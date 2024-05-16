package CodeTest;

import codeGenerator.CppCodeGenerator;

public class StringCppTest {
    public static void main(String[] args) {
        CppCodeGenerator codeGenerator = new CppCodeGenerator();

//        String test = codeGenerator.makeInputParameter("String[][]",1);
//        System.out.println(test);

        String[] inputParameter = {"int", "double", "String", "int[]","double[]","String[]", "int[][]","double[][]","String[][]"};
        String outputParameter = "int";

        StringBuilder sb = new StringBuilder();
        sb.append("#include<iostream>\n");
        sb.append("using namespace std;\n");
        sb.append("int solution(int a, string b){\n");
        sb.append("return a+22;\n");
        sb.append("}\n");

        String code= sb.toString();

        String basicCode = codeGenerator.makeBasicCode(inputParameter,outputParameter);
        String allCode = codeGenerator.addCode(code,basicCode);
        System.out.println(allCode);
    }
}
