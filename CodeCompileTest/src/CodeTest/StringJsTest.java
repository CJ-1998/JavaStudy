package CodeTest;

import codeGenerator.JavaScriptCodeGenerator;

public class StringJsTest {
    public static void main(String[] args) {
        JavaScriptCodeGenerator javaScriptCodeGenerator = new JavaScriptCodeGenerator();

//        String temp = javaScriptCodeGenerator.makeInputParameter("String[][]", 0);
//        System.out.println(temp);

        String[] inputParameter = {"int[]", "String[][]"};
        String outputParameter = "int";

        String basicCode = javaScriptCodeGenerator.makeBasicCode(inputParameter,outputParameter);

//        System.out.println(basicCode);

        StringBuilder sb = new StringBuilder();
        sb.append("function solution(a0, a1){\n");
        sb.append("return a0+10; };\n");
        String code = sb.toString();

        String allCode = javaScriptCodeGenerator.addCode(code,basicCode);
        System.out.println(allCode);
    }
}
