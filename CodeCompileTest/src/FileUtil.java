import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;

public class FileUtil {

    private static final String DIRECTORY_PATH = "../";

    public static String makeFileFromCode(Long projectId, String str, String language) {
        BufferedWriter fw;
        File f;
        String fileType = language.equals("PYTHON") ? ".py" : language.equals("JAVA") ? ".java" : language.equals("CPP") ? ".cpp" : ".js";
        String fileName = "Solution" + fileType;
        // todo: java, cpp 는 파일명이 대문자로 시작하고 클래스와 이름이 같아야함

        {
            try {
                f = new File(fileName);
                fw = new BufferedWriter(new FileWriter(f));
                fw.write(str);
                fw.flush();

                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return fileName;
    }

    public static int deleteFile(String fileName) {
        Path filePath = Paths.get(fileName);
        try {
            // 파일 삭제
            Files.delete(filePath);
        } catch (NoSuchFileException e) {
            System.out.println("삭제하려는 파일/디렉토리가 없습니다");
            return -1;
        } catch (DirectoryNotEmptyException e) {
            System.out.println("디렉토리가 비어있지 않습니다");
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 1;
    }
}
