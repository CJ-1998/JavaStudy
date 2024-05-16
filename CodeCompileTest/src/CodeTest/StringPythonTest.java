package CodeTest;

import codeGenerator.PythonCodeGenerator;

public class StringPythonTest {
    public static void main(String[] args) {
        PythonCodeGenerator pythonCodeGenerator = new PythonCodeGenerator();

//        String test = pythonCodeGenerator.makeInputParameter("int[][]",1);
//        System.out.println(test);

        String[] inputParameter = {"int", "double", "String", "int[]","double[]","String[]", "int[][]","double[][]","String[][]"};
        String outputParameter = "int";

        String allTest = pythonCodeGenerator.makeBasicCode(inputParameter,outputParameter);

//        System.out.println(allTest);

        String code = "def solution(a1, a2):\n"+
                "\tprint(a1)\n"+
                "\tprint(a2)\n"+
                "\treturn a2\n";

        String allCode = pythonCodeGenerator.addCode(code,allTest);
        System.out.println(allCode);
    }
}
