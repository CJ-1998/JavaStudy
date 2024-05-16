package codeGenerator;

import java.util.ArrayList;
import java.util.List;

public class JavaScriptCodeGenerator implements CodeGenerator{

    @Override
    public String makeBasicCode(String[] inputParameter, String outputParameter) {

        List<String> varNames = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        sb.append("const arguments = process.argv.slice(2);\n");

        for(int index=0;index<inputParameter.length;index++) {
            String varName = "a"+index;
            varNames.add(varName);
            String value = makeInputParameter(inputParameter[index], index);
            sb.append(value);
        }

        sb.append("const result=solution(");
        for(int i=0;i<varNames.size();i++){
            sb.append(varNames.get(i));
            if(i==varNames.size()-1){
                sb.append(");\n");
            }
            else{
                sb.append(", ");
            }
        }

        return sb.toString();
    }

    @Override
    public String makeInputParameter(String inputParameter, int index) {

        if(inputParameter.equals("int")){
            StringBuilder sb = new StringBuilder();
            sb.append("const temp");
            sb.append(index);
            sb.append("= arguments[");
            sb.append(index);
            sb.append("];\n");
            sb.append("const a");
            sb.append(index);
            sb.append("= parseInt(temp");
            sb.append(index);
            sb.append(");\n");
            return sb.toString();
        }
        else if(inputParameter.equals("double")){
            StringBuilder sb = new StringBuilder();
            sb.append("const temp");
            sb.append(index);
            sb.append("= arguments[");
            sb.append(index);
            sb.append("];\n");
            sb.append("const a");
            sb.append(index);
            sb.append("= parseFloat(temp");
            sb.append(index);
            sb.append(");\n");
            return sb.toString();
        }
        else if(inputParameter.equals("String")){
            StringBuilder sb = new StringBuilder();
            sb.append("const temp");
            sb.append(index);
            sb.append("= arguments[");
            sb.append(index);
            sb.append("];\n");
            sb.append("const a");
            sb.append(index);
            sb.append("= temp");
            sb.append(index);
            sb.append(";\n");
            return sb.toString();
        }
        else if(inputParameter.equals("int[]")||inputParameter.equals("double[]")){
            StringBuilder sb = new StringBuilder();
            sb.append("const temp");
            sb.append(index);
            sb.append("= arguments[");
            sb.append(index);
            sb.append("];\n");
            sb.append("const a");
            sb.append(index);
            sb.append("= JSON.parse(temp");
            sb.append(index);
            sb.append(");\n");
            return sb.toString();

        }
        else if(inputParameter.equals("String[]")){
            StringBuilder sb = new StringBuilder();
            sb.append("const temp");
            sb.append(index);
            sb.append("= arguments[");
            sb.append(index);
            sb.append("];\n");
            sb.append("const string = temp");
            sb.append(index);
            sb.append(".replace(/(\\w+)/g, '\"$1\"');\n");
            sb.append("const a");
            sb.append(index);
            sb.append("= JSON.parse(string);\n");
            return sb.toString();
        }
        else if(inputParameter.equals("int[][]")||inputParameter.equals("double[][]")){
            StringBuilder sb = new StringBuilder();
            sb.append("const temp");
            sb.append(index);
            sb.append("= arguments[");
            sb.append(index);
            sb.append("];\n");
            sb.append("const sliceString");
            sb.append(index);
            sb.append(" = temp");
            sb.append(index);
            sb.append(".slice(1,-1);\n");
            sb.append("const a");
            sb.append(index);
            sb.append("= sliceString");
            sb.append(index);
            sb.append(".split('/').map(innerArrayString => {\n");
            sb.append("return JSON.parse(innerArrayString);});\n");
            return sb.toString();
        }
        else if(inputParameter.equals("String[][]")){
            StringBuilder sb = new StringBuilder();
            sb.append("const temp");
            sb.append(index);
            sb.append("= arguments[");
            sb.append(index);
            sb.append("];\n");
            sb.append("const sliceString");
            sb.append(index);
            sb.append(" = temp");
            sb.append(index);
            sb.append(".slice(1,-1);\n");
            sb.append("const a");
            sb.append(index);
            sb.append("= sliceString");
            sb.append(index);
            sb.append(".split('/').map(innerArrayString => {\n");
            sb.append("const string=innerArrayString.replace(/(\\w+)/g, '\"$1\"');\n");
            sb.append("return JSON.parse(string);});\n");
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

    @Override
    public String addCode(String code, String basicCode){
        return code+basicCode;
    }
}
