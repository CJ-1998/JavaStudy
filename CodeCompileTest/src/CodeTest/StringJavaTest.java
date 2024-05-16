package CodeTest;

import codeGenerator.JavaCodeGenerator;

public class StringJavaTest {
    public static void main(String[] args) {
        JavaCodeGenerator javaCodeGenerator = new JavaCodeGenerator();
//        String temp = javaCodeGenerator.makeInputParameter("String[]", "[1,2,3]",0);
//        System.out.println(temp);
//
//        String temp1 = javaCodeGenerator.makeInputParameter("String[][]", "[[1,2,3]/[2,3,4]]",0);
//        System.out.println(temp1);

        StringBuilder sb=new StringBuilder();
        sb.append("class Solution{\n");
        sb.append("public int solution(int a, String b) {\n");
        sb.append("return a;\n");
        sb.append("}\n");
        sb.append("}");
        String code = sb.toString();

        String[] inputParameter = {"int", "double", "String", "int[]","double[]","String[]", "int[][]","double[][]","String[][]"};
        String outputParameter = "int";

        String test = javaCodeGenerator.makeBasicCode(inputParameter, outputParameter);
//        System.out.println(test);

        String realCode = javaCodeGenerator.addCode(code,test);
        System.out.println(realCode);
    }
}
