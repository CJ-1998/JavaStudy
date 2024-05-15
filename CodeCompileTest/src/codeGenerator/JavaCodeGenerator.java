package codeGenerator;

import java.util.ArrayList;
import java.util.List;

public class JavaCodeGenerator implements CodeGenerator {

    @Override
    public String makeBasicCode(String[] inputParameter, String outputParameter) {

        List<String> varNames = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("public static void main(String[] args) {\n");

        for(int index=0;index<inputParameter.length;index++){
            String varName = "a"+index;
            varNames.add(varName);
            String value = makeInputParameter(inputParameter[index], index);
            stringBuilder.append(value);
        }

        stringBuilder.append("Solution test = new Solution();\n");
        stringBuilder.append(outputParameter);
        stringBuilder.append(" result = test.solution(");
        for(int i=0;i<varNames.size();i++){
            stringBuilder.append(varNames.get(i));
            if(i==varNames.size()-1){
                stringBuilder.append(");\n");
            }
            else{
                stringBuilder.append(", ");
            }
        }

        String output = makeOutput(outputParameter);
        stringBuilder.append(output);

        stringBuilder.append("}\n");
        stringBuilder.append("}");

        return stringBuilder.toString();
    }

    @Override
    public String makeInputParameter(String inputParameter, int index) {
        if(inputParameter.equals("int")){
            StringBuilder sb = new StringBuilder();
            sb.append(inputParameter);
            sb.append(" ");
            sb.append("a");
            sb.append(index);
            sb.append("= Integer.parseInt(args[");
            sb.append(index);
            sb.append("]);\n");
            return sb.toString();
        }
        else if(inputParameter.equals("double")){
            StringBuilder sb = new StringBuilder();
            sb.append(inputParameter);
            sb.append(" ");
            sb.append("a");
            sb.append(index);
            sb.append("= Double.parseDouble(args[");
            sb.append(index);
            sb.append("]);\n");
            return sb.toString();
        }
        else if(inputParameter.equals("String")){
            StringBuilder sb = new StringBuilder();
            sb.append(inputParameter);
            sb.append(" ");
            sb.append("a");
            sb.append(index);
            sb.append("= args[");
            sb.append(index);
            sb.append("];\n");
            return sb.toString();
        }
        else if(inputParameter.equals("int[]")){
            StringBuilder sb = new StringBuilder();
            sb.append("String input = args[");
            sb.append(index);
            sb.append("];\n");
            sb.append("String[] parts = input.substring(1, input.length() - 1).split(\",\");\n");
            sb.append(inputParameter);
            sb.append(" ");
            sb.append("a");
            sb.append(index);
            sb.append(" = new int[parts.length];\n");
            sb.append("for (int i = 0; i < parts.length; i++) {\n");
            sb.append("    String str = parts[i];\n");
            sb.append("    a");
            sb.append(index);
            sb.append("[i] = Integer.parseInt(str);\n");
            sb.append("}\n");
            return sb.toString();

        }
        else if(inputParameter.equals("double[]")){
            StringBuilder sb = new StringBuilder();
            sb.append("String input = args[");
            sb.append(index);
            sb.append("];\n");
            sb.append("String[] parts = input.substring(1, input.length() - 1).split(\",\");\n");
            sb.append(inputParameter);
            sb.append(" ");
            sb.append("a");
            sb.append(index);
            sb.append(" = new double[parts.length];\n");
            sb.append("for (int i = 0; i < parts.length; i++) {\n");
            sb.append("    String str = parts[i];\n");
            sb.append("    a");
            sb.append(index);
            sb.append("[i] = Double.parseDouble(str);\n");
            sb.append("}\n");
            return sb.toString();
        }
        else if(inputParameter.equals("String[]")){
            StringBuilder sb = new StringBuilder();
            sb.append("String input = args[");
            sb.append(index);
            sb.append("];\n");
            sb.append(inputParameter);
            sb.append(" ");
            sb.append("a");
            sb.append(index);
            sb.append(" = input.substring(1, input.length() - 1).split(\",\");\n");
            return sb.toString();
        }
        else if(inputParameter.equals("int[][]")){
            StringBuilder sb = new StringBuilder();
            sb.append("String input = args[");
            sb.append(index);
            sb.append("];\n");
            sb.append("String[] outerParts = input.substring(1, input.length() - 1).split(\"/\");\n");
            sb.append(inputParameter);
            sb.append(" ");
            sb.append("a");
            sb.append(index);
            sb.append(" = new int[outerParts.length][];\n");
            sb.append("for (int i = 0; i < outerParts.length; i++) {\n");
            sb.append("    String[] innerParts = outerParts[i].substring(1, outerParts[i].length() - 1).split(\",\");\n");
            sb.append("    a");
            sb.append(index);
            sb.append("[i] = new int[innerParts.length];\n");
            sb.append("    for (int j = 0; j < innerParts.length; j++) {\n");
            sb.append("        a");
            sb.append(index);
            sb.append("[i][j] = Integer.parseInt(innerParts[j]);\n");
            sb.append("    }\n");
            sb.append("}\n");
            return sb.toString();
        }
        else if(inputParameter.equals("double[][]")){
            StringBuilder sb = new StringBuilder();
            sb.append("String input = args[");
            sb.append(index);
            sb.append("];\n");
            sb.append("String[] outerParts = input.substring(1, input.length() - 1).split(\"/\");\n");
            sb.append(inputParameter);
            sb.append(" ");
            sb.append("a");
            sb.append(index);
            sb.append(" = new double[outerParts.length][];\n");
            sb.append("for (int i = 0; i < outerParts.length; i++) {\n");
            sb.append("    String[] innerParts = outerParts[i].substring(1, outerParts[i].length() - 1).split(\",\");\n");
            sb.append("    a");
            sb.append(index);
            sb.append("[i] = new double[innerParts.length];\n");
            sb.append("    for (int j = 0; j < innerParts.length; j++) {\n");
            sb.append("        a");
            sb.append(index);
            sb.append("[i][j] = Double.parseDouble(innerParts[j]);\n");
            sb.append("    }\n");
            sb.append("}\n");
            return sb.toString();

        }
        else if(inputParameter.equals("String[][]")){
            StringBuilder sb = new StringBuilder();
            sb.append("String input = args[");
            sb.append(index);
            sb.append("];\n");
            sb.append("String[] outerParts = input.substring(1, input.length() - 1).split(\"/\");\n");
            sb.append("\n");
            sb.append(inputParameter);
            sb.append(" ");
            sb.append("a");
            sb.append(index);
            sb.append(" = new String[outerParts.length][];\n");
            sb.append("\n");
            sb.append("for (int i = 0; i < outerParts.length; i++) {\n");
            sb.append("    String[] innerParts = outerParts[i].substring(1, outerParts[i].length() - 1).split(\",\");\n");
            sb.append("    a");
            sb.append(index);
            sb.append("[i] = new String[innerParts.length];\n");
            sb.append("\n");
            sb.append("    for (int j = 0; j < innerParts.length; j++) {\n");
            sb.append("        a");
            sb.append(index);
            sb.append("[i][j] = innerParts[j];\n");
            sb.append("    }\n");
            sb.append("}\n");
            return sb.toString();
        }

        return null;
    }

    @Override
    public String makeOutput(String outputParameter) {
        if(outputParameter.equals("int")||outputParameter.equals("double")||outputParameter.equals("String")){
            StringBuilder sb = new StringBuilder();
            sb.append("System.out.println(result);\n");
            return sb.toString();
        }
        else if(outputParameter.equals("int[]")||outputParameter.equals("double[]")||outputParameter.equals("String[]")){
            StringBuilder sb = new StringBuilder();
            sb.append("for (int i = 0; i < result.length; i++) {\n");
            sb.append("if(i==0) System.out.print(\"[\");\n");
            sb.append("System.out.print(result[i]);\n");
            sb.append("if(i!=result.length-1) System.out.print(\",\");\n");
            sb.append("else System.out.print(\"]\");\n");
            sb.append("}\n");
            return sb.toString();

        }
        else if(outputParameter.equals("int[][]")||outputParameter.equals("double[][]")||outputParameter.equals("String[][]")){
            StringBuilder sb = new StringBuilder();
            sb.append("for (int i = 0; i < result.length; i++) {\n");
            sb.append("if(i==0) System.out.print(\"[\");\n");
            sb.append("for(int j=0;j<result[i].length;j++){\n");
            sb.append("if(j==0) System.out.print(\"[\");\n");
            sb.append("System.out.print(result[i][j]);\n");
            sb.append("if(j!=result[i].length-1) System.out.print(\",\");\n");
            sb.append("else System.out.print(\"]\");\n");
            sb.append("}\n");
            sb.append("if(i!=result.length-1) System.out.print(\"/\");\n");
            sb.append("else System.out.print(\"]\");\n");
            sb.append("}\n");
            return sb.toString();
        }

        return null;
    }

    public String addCode(String code, String basicCode){
        return code.substring(0, code.length() - 1) + basicCode;
    }
}
