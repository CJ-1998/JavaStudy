import java.io.IOException;

public class Main {

    public void test() throws IOException, InterruptedException {
        String[] args={};

        String javaCode = "public class Solution {\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println(\"Hello, Java World!\");\n" +
                "    }\n" +
                "}";

        ProjectResult projectResult = FileExecute.executeFile(javaCode, "JAVA",args,5L);
        System.out.println(projectResult);

        String javaCode1 = "#include <iostream>\n" +
                "using namespace std;\n" +
                "int main() {\n" +
                "    cout << \"Hello, C++ World!\" << endl;\n" +
                "    return 0;\n" +
                "}";

        ProjectResult projectResult1 = FileExecute.executeFile(javaCode1, "CPP",args,5L);
        System.out.println(projectResult1);

        String javaCode2 = "print('Hello, Python World!')";

        ProjectResult projectResult2 = FileExecute.executeFile(javaCode2, "PYTHON",args,5L);
        System.out.println(projectResult2);
    }

    public void parameterTest() throws IOException, InterruptedException{
        String javaCode = "    public static void main(String[] args) {\n" +
                "String temp = args[0];"+
                "Solution solution1 = new Solution();"+
                "String result = solution1.solution(temp);"+
                "        System.out.println(result);\n" +
                "    }\n" +
                "}";

        String code = "public class Solution {\n" +
                "public String solution(String temp){\n"+
                "return temp; }\n"+
                "}";
        String newJavaCode = code.substring(0, code.length() - 1) + javaCode;
        String[] args={"1234"};
        ProjectResult projectResult = FileExecute.executeFile(newJavaCode, "JAVA",args,5L);
        System.out.println(projectResult);
    }

    public void jsTest() throws IOException, InterruptedException{
        String[] args={};
        String jsCode = "console.log(\"Hello, JS World!\");";
        ProjectResult projectResult = FileExecute.executeFile(jsCode, "JAVASCRIPT",args,5L);
        System.out.println(projectResult);
    }

    public void loopTest() throws IOException, InterruptedException {
        String[] args={};

        String javaCode1 = "#include <iostream>\n" +
                "using namespace std;\n" +
                "int main() {\n" +
                "while(true){}\n"+
                "    cout << \"Hello, C++ World!\" << endl;\n" +
                "    return 0;\n" +
                "}";

        ProjectResult projectResult1 = FileExecute.executeFile(javaCode1, "CPP",args,2L);
        System.out.println(projectResult1);

    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Main main = new Main();
//        main.parameterTest();
//        main.test();
//        main.jsTest();

//        for(int i=0;i<5;i++){
//            main.parameterTest();
//        }

        main.loopTest();
    }
}





