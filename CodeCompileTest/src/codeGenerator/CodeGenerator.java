package codeGenerator;

public interface CodeGenerator {

    public String makeBasicCode(String[] inputParameter, String outputParameter);

    public String makeInputParameter(String inputParameter, int index);

    public String makeOutput(String outputParameter);

    public String addCode(String code, String basicCode);
}
