package codeGenerator;

public class CppCodeGenerator implements CodeGenerator{
    @Override
    public String makeBasicCode(String[] inputParameter, String outputParameter) {
        return null;
    }

    @Override
    public String makeInputParameter(String inputParameter, int index) {
        if(inputParameter.equals("int")){
            StringBuilder sb = new StringBuilder();
            return sb.toString();
        }
        else if(inputParameter.equals("double")){
            StringBuilder sb = new StringBuilder();
            return sb.toString();
        }
        else if(inputParameter.equals("String")){
            StringBuilder sb = new StringBuilder();
            return sb.toString();
        }
        else if(inputParameter.equals("int[]")){
            StringBuilder sb = new StringBuilder();
            return sb.toString();

        }
        else if(inputParameter.equals("double[]")){
            StringBuilder sb = new StringBuilder();
            return sb.toString();
        }
        else if(inputParameter.equals("String[]")){
            StringBuilder sb = new StringBuilder();
            return sb.toString();
        }
        else if(inputParameter.equals("int[][]")){
            StringBuilder sb = new StringBuilder();
            return sb.toString();
        }
        else if(inputParameter.equals("double[][]")){
            StringBuilder sb = new StringBuilder();
            return sb.toString();

        }
        else if(inputParameter.equals("String[][]")){
            StringBuilder sb = new StringBuilder();
            return sb.toString();
        }
        return null;
    }

    @Override
    public String makeOutput(String outputParameter) {
        if(outputParameter.equals("int")){
            StringBuilder sb = new StringBuilder();
            return sb.toString();
        }
        else if(outputParameter.equals("double")){
            StringBuilder sb = new StringBuilder();
            return sb.toString();
        }
        else if(outputParameter.equals("String")){
            StringBuilder sb = new StringBuilder();
            return sb.toString();
        }
        else if(outputParameter.equals("int[]")){
            StringBuilder sb = new StringBuilder();
            return sb.toString();

        }
        else if(outputParameter.equals("double[]")){
            StringBuilder sb = new StringBuilder();
            return sb.toString();
        }
        else if(outputParameter.equals("String[]")){
            StringBuilder sb = new StringBuilder();
            return sb.toString();
        }
        else if(outputParameter.equals("int[][]")){
            StringBuilder sb = new StringBuilder();
            return sb.toString();
        }
        else if(outputParameter.equals("double[][]")){
            StringBuilder sb = new StringBuilder();
            return sb.toString();

        }
        else if(outputParameter.equals("String[][]")){
            StringBuilder sb = new StringBuilder();
            return sb.toString();
        }

        return null;
    }

    public String addCode(String code, String basicCode){
        return code+basicCode;
    }
}
