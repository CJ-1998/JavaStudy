package codeGenerator;

public class JavaScriptCodeGenerator implements CodeGenerator{

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

    @Override
    public String addCode(String code, String basicCode){
        return code+basicCode;
    }
}
