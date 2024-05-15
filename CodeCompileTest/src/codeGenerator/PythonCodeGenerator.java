package codeGenerator;

public class PythonCodeGenerator implements CodeGenerator {

    @Override
    public String makeBasicCode(String[] inputParameter, String[] inputParameterValue, String outputParameter) {
        return null;
    }

    @Override
    public String makeInputParameter(String inputParameter, String inputParameterValue, int index) {
        return null;
    }

    @Override
    public String makeOutput(String outputParameter) {
        return null;
    }

    public String addCode(String code, String basicCode){
        String importCode="import sys\n";
        return importCode+code+basicCode;
    }
}
