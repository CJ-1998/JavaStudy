package codeGenerator;

import java.util.ArrayList;
import java.util.List;

public class PythonCodeGenerator implements CodeGenerator {

    @Override
    public String makeBasicCode(String[] inputParameter, String outputParameter) {

        List<String> varNames = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        sb.append("if __name__ == \"__main__\":\n");

        for(int index=0;index<inputParameter.length;index++) {
            int realIndex= index+1;
            String varName = "a"+realIndex;
            varNames.add(varName);
            String value = makeInputParameter(inputParameter[index], realIndex);
            sb.append(value);
        }

        sb.append("\tresult=solution(");
        for(int i=0;i<varNames.size();i++){
            sb.append(varNames.get(i));
            if(i==varNames.size()-1){
                sb.append(")\n");
            }
            else{
                sb.append(", ");
            }
        }

        sb.append("\tprint(result)");

        return sb.toString();
    }

    @Override
    public String makeInputParameter(String inputParameter, int index) {
        if(inputParameter.equals("int")){
            StringBuilder sb = new StringBuilder();
            sb.append("\ttemp=sys.argv[");
            sb.append(index);
            sb.append("]\n");
            sb.append("\ta");
            sb.append(index);
            sb.append("=int(temp)\n");
            return sb.toString();
        }
        else if(inputParameter.equals("double")){
            StringBuilder sb = new StringBuilder();
            sb.append("\ttemp=sys.argv[");
            sb.append(index);
            sb.append("]\n");
            sb.append("\ta");
            sb.append(index);
            sb.append("=float(temp)\n");
            return sb.toString();
        }
        else if(inputParameter.equals("String")){
            StringBuilder sb = new StringBuilder();
            sb.append("\ttemp=sys.argv[");
            sb.append(index);
            sb.append("]\n");
            sb.append("\ta");
            sb.append(index);
            sb.append("=temp\n");
            return sb.toString();
        }
        else if(inputParameter.equals("int[]")){
            StringBuilder sb = new StringBuilder();
            sb.append("\ttemp=sys.argv[");
            sb.append(index);
            sb.append("]\n");
            sb.append("\ttemp_list=temp.strip('[]').split(',')\n");
            sb.append("\ta");
            sb.append(index);
            sb.append("=[int(x) for x in temp_list]\n");
            return sb.toString();

        }
        else if(inputParameter.equals("double[]")){
            StringBuilder sb = new StringBuilder();
            sb.append("\ttemp=sys.argv[");
            sb.append(index);
            sb.append("]\n");
            sb.append("\ttemp_list=temp.strip('[]').split(',')\n");
            sb.append("\ta");
            sb.append(index);
            sb.append("=[float(x) for x in temp_list]\n");
            return sb.toString();
        }
        else if(inputParameter.equals("String[]")){
            StringBuilder sb = new StringBuilder();
            sb.append("\ttemp=sys.argv[");
            sb.append(index);
            sb.append("]\n");
            sb.append("\ttemp_list=temp.strip('[]').split(',')\n");
            sb.append("\ta");
            sb.append(index);
            sb.append("=[\"'\" + x + \"'\" for x in temp_list]\n");
            return sb.toString();
        }
        else if(inputParameter.equals("int[][]")){
            StringBuilder sb = new StringBuilder();
            sb.append("\ttemp=sys.argv[");
            sb.append(index);
            sb.append("]\n");
            sb.append("\ttemp_list=temp.strip('[]').split('/')\n");
            sb.append("\ta");
            sb.append(index);
            sb.append("=[[int(x) for x in substring.strip('[]').split(',')] for substring in temp_list]\n");
            return sb.toString();
        }
        else if(inputParameter.equals("double[][]")){
            StringBuilder sb = new StringBuilder();
            sb.append("\ttemp=sys.argv[");
            sb.append(index);
            sb.append("]\n");
            sb.append("\ttemp_list=temp.strip('[]').split('/')\n");
            sb.append("\ta");
            sb.append(index);
            sb.append("=[[float(x) for x in substring.strip('[]').split(',')] for substring in temp_list]\n");
            return sb.toString();

        }
        else if(inputParameter.equals("String[][]")){
            StringBuilder sb = new StringBuilder();
            sb.append("\ttemp=sys.argv[");
            sb.append(index);
            sb.append("]\n");
            sb.append("\ttemp_list=temp.strip('[]').split('/')\n");
            sb.append("\ta");
            sb.append(index);
            sb.append("=[substring.strip('[]').split(',') for substring in temp_list]\n");
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
        String importCode="import sys\n";
        return importCode+code+basicCode;
    }
}
