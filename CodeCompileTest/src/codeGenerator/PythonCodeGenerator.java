package codeGenerator;

public class PythonCodeGenerator implements CodeGenerator {

    public String addCode(String code, String basicCode){
        String importCode="import sys\n";
        return importCode+code+basicCode;
    }
}
