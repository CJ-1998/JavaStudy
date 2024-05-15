package codeGenerator;

public class JavaCodeGenerator implements CodeGenerator {

    public String addCode(String code, String basicCode){
        return code.substring(0, code.length() - 1) + basicCode;
    }
}
