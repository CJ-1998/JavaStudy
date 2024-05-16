import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class FileExecute {

    public static ProjectResult executeFile(String code, String language, String[] testCase, Long timeLimit) throws IOException, InterruptedException {

        String command1, command2;
        ProjectResult response = null;
        String fileName = FileUtil.makeFileFromCode(code, language);

        switch (language) {
            case "PYTHON" -> {
                command1 = "python";
                String[] basicArgs={command1, fileName};
                String[] args = Stream.concat(Arrays.stream(basicArgs), Arrays.stream(testCase)).toArray(String[]::new);
                    response = commonProcess(timeLimit,args);
                FileUtil.deleteFile(fileName);
            }
            case "JAVA" -> {
                command1 = "javac";
                command2 = "java";
                response = commonProcess(timeLimit,command1, fileName);
                FileUtil.deleteFile(fileName);
                if (response.getStatus().equals("error")) {
                    break;
                }
                String[] basicArgs={command2, "Solution"};
                String[] args = Stream.concat(Arrays.stream(basicArgs), Arrays.stream(testCase)).toArray(String[]::new);
                    response = commonProcess(timeLimit,args);
                FileUtil.deleteFile("Solution" + ".class");
            }
            case "CPP" -> {
                command1 = "g++";
                response = commonProcess(timeLimit,command1, fileName);
                FileUtil.deleteFile(fileName);
                if (response.getStatus().equals("error")) {
                    break;
                }
                String[] basicArgs={"./a.exe", "1"};
                String[] args = Stream.concat(Arrays.stream(basicArgs), Arrays.stream(testCase)).toArray(String[]::new);
                    response = commonProcess(timeLimit, args);
                FileUtil.deleteFile("./a.exe");
            }
            case "JAVASCRIPT"->{
                command1 = "node";
                String[] basicArgs={command1, fileName};
                String[] args = Stream.concat(Arrays.stream(basicArgs), Arrays.stream(testCase)).toArray(String[]::new);
                    response = commonProcess(timeLimit, args);
                FileUtil.deleteFile(fileName);
            }
        }

        return response;
    }

    private static ProjectResult commonProcess(Long timeLimit, String... strings) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder(strings);
        Process p = pb.start();
        ProjectResult response = new ProjectResult();

        // 시간 제한 설정 (예: 5초)
        long timeoutSeconds = timeLimit;

        boolean checkTimeout = false;

        // 프로세스 실행
        try {
            // 프로세스 종료 대기 : 0이면 에러 없음, 1이면 에러 있음
            boolean isCompleted = p.waitFor(timeoutSeconds, TimeUnit.SECONDS);

            // 시간 제한 초과 확인
            if (!isCompleted) {
                // 시간 초과 시 프로세스 강제 종료
                p.destroy();
                p.waitFor();
                checkTimeout=true;
                // response.setStatus("timeout");
            }
        } catch (InterruptedException e) {
            // 인터럽트 예외 처리
            p.destroy();
            response.setStatus("error");
        }

        // 프로세스 실행 완료 후 결과 처리
        response.setData(convertToString(p.getInputStream()));

        String str = convertToString(p.getErrorStream());
        if (str.length() > 2) {
            response.setData(str);
        }

        // 종료 코드 확인 : 0이면 에러 없음, 1이면 에러 있음
        int exitCode = p.exitValue();
        if (exitCode == 0) {
            response.setStatus("executed");
        }
        else{
            if(checkTimeout){
                response.setStatus("timeout");
                response.setData("timeout");
            }
            else{
                response.setStatus("error");
            }
        }

        return response;
    }

    private static ProjectResult commonProcess1(Long timeLimit, String... strings) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder(strings);
        Process p = pb.start();
        ProjectResult response = new ProjectResult();

        response.setData(convertToString(p.getInputStream()));

        String str = convertToString(p.getErrorStream());
        if (str.length() > 2) {
            response.setData(str);
        }

        // 프로세스 종료 대기 : 0이면 에러 없음, 1이면 에러 있음
        int exitCode = p.waitFor();
        // 프로세스 강제 종료
        p.destroy();
        // 종료 코드 확인 : 0이면 에러 없음, 1이면 에러 있음
        p.exitValue();

        if (exitCode == 0) {
            response.setStatus("executed");
        } else {
            response.setStatus("error");
        }

        return response;
    }

    public static String convertToString(InputStream inputStream) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            return stringBuilder.toString().trim();
        }
    }
}