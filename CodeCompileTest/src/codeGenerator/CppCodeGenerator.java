package codeGenerator;

public class CppCodeGenerator implements CodeGenerator{
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
        return code+basicCode;
    }
}
