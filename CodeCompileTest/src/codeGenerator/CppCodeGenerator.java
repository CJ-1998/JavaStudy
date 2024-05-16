package codeGenerator;

import java.util.ArrayList;
import java.util.List;

public class CppCodeGenerator implements CodeGenerator{
    @Override
    public String makeBasicCode(String[] inputParameter, String outputParameter) {

        List<String> varNames = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        sb.append("int main(int argc, char* argv[]) {\n");

        for(int index=0;index<inputParameter.length;index++){
            int realIndex=index+1;
            String varName = "a"+realIndex;
            varNames.add(varName);
            String value = makeInputParameter(inputParameter[index], realIndex);
            sb.append(value);
        }

        String changedOutputParameter = changeOutputParameter(outputParameter);
        sb.append(changedOutputParameter);
        sb.append(" result = solution(");
        for(int i=0;i<varNames.size();i++){
            sb.append(varNames.get(i));
            if(i==varNames.size()-1){
                sb.append(");\n");
            }
            else{
                sb.append(", ");
            }
        }

        String output = makeOutput(outputParameter);
        sb.append(output);
        sb.append("return 0;\n");
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String makeInputParameter(String inputParameter, int index) {
        if(inputParameter.equals("int")){
            StringBuilder sb = new StringBuilder();
            sb.append("string temp");
            sb.append(index);
            sb.append(" = argv[");
            sb.append(index);
            sb.append("];\n");
            sb.append(inputParameter);
            sb.append(" a");
            sb.append(index);
            sb.append("= stoi(temp");
            sb.append(index);
            sb.append(");\n");
            return sb.toString();
        }
        else if(inputParameter.equals("double")){
            StringBuilder sb = new StringBuilder();
            sb.append("string temp");
            sb.append(index);
            sb.append(" = argv[");
            sb.append(index);
            sb.append("];\n");
            sb.append(inputParameter);
            sb.append(" a");
            sb.append(index);
            sb.append("= stod(temp");
            sb.append(index);
            sb.append(");\n");
            return sb.toString();
        }
        else if(inputParameter.equals("String")){
            StringBuilder sb = new StringBuilder();
            sb.append("string temp");
            sb.append(index);
            sb.append(" = argv[");
            sb.append(index);
            sb.append("];\n");
            sb.append("string a");
            sb.append(index);
            sb.append("= temp");
            sb.append(index);
            sb.append(";\n");
            return sb.toString();
        }
        else if(inputParameter.equals("int[]")){
            StringBuilder sb = new StringBuilder();
            sb.append("string inputString");
            sb.append(index);
            sb.append(" = argv[");
            sb.append(index);
            sb.append("];\n");

            sb.append("inputString");
            sb.append(index);
            sb.append(" = inputString");
            sb.append(index);
            sb.append(".substr(1, inputString");
            sb.append(index);
            sb.append(".size() - 2);\n");
            sb.append("replace(inputString");
            sb.append(index);
            sb.append(".begin(), inputString");
            sb.append(index);
            sb.append(".end(), ',', ' ');\n");
            sb.append("stringstream ss");
            sb.append(index);
            sb.append("(inputString");
            sb.append(index);
            sb.append(");\n");

            sb.append("int num");
            sb.append(index);
            sb.append(";\n");
            sb.append("vector<int> a");
            sb.append(index);
            sb.append(";\n");

            sb.append("while (ss");
            sb.append(index);
            sb.append(" >> num");
            sb.append(index);
            sb.append(") {\n");
            sb.append("a");
            sb.append(index);
            sb.append(".push_back(num");
            sb.append(index);
            sb.append(");\n");
            sb.append("}\n");

            return sb.toString();

        }
        else if(inputParameter.equals("double[]")){
            StringBuilder sb = new StringBuilder();
            sb.append("string inputString");
            sb.append(index);
            sb.append(" = argv[");
            sb.append(index);
            sb.append("];\n");

            sb.append("inputString");
            sb.append(index);
            sb.append(" = inputString");
            sb.append(index);
            sb.append(".substr(1, inputString");
            sb.append(index);
            sb.append(".size() - 2);\n");
            sb.append("replace(inputString");
            sb.append(index);
            sb.append(".begin(), inputString");
            sb.append(index);
            sb.append(".end(), ',', ' ');\n");
            sb.append("stringstream ss");
            sb.append(index);
            sb.append("(inputString");
            sb.append(index);
            sb.append(");\n");

            sb.append("double num");
            sb.append(index);
            sb.append(";\n");
            sb.append("vector<double> a");
            sb.append(index);
            sb.append(";\n");

            sb.append("while (ss");
            sb.append(index);
            sb.append(" >> num");
            sb.append(index);
            sb.append(") {\n");
            sb.append("a");
            sb.append(index);
            sb.append(".push_back(num");
            sb.append(index);
            sb.append(");\n");
            sb.append("}\n");
            return sb.toString();
        }
        else if(inputParameter.equals("String[]")){
            StringBuilder sb = new StringBuilder();
            sb.append("string inputString");
            sb.append(index);
            sb.append(" = argv[");
            sb.append(index);
            sb.append("];\n");

            sb.append("inputString");
            sb.append(index);
            sb.append(" = inputString");
            sb.append(index);
            sb.append(".substr(1, inputString");
            sb.append(index);
            sb.append(".size() - 2);\n");
            sb.append("replace(inputString");
            sb.append(index);
            sb.append(".begin(), inputString");
            sb.append(index);
            sb.append(".end(), ',', ' ');\n");
            sb.append("stringstream ss");
            sb.append(index);
            sb.append("(inputString");
            sb.append(index);
            sb.append(");\n");

            sb.append("string num");
            sb.append(index);
            sb.append(";\n");
            sb.append("vector<string> a");
            sb.append(index);
            sb.append(";\n");

            sb.append("while (ss");
            sb.append(index);
            sb.append(" >> num");
            sb.append(index);
            sb.append(") {\n");
            sb.append("a");
            sb.append(index);
            sb.append(".push_back(num");
            sb.append(index);
            sb.append(");\n");
            sb.append("}\n");
            return sb.toString();
        }
        else if(inputParameter.equals("int[][]")){
            StringBuilder sb = new StringBuilder();
            sb.append("string inputString");
            sb.append(index);
            sb.append(" = argv[");
            sb.append(index);
            sb.append("];\n");

            sb.append("inputString");
            sb.append(index);
            sb.append(" = inputString");
            sb.append(index);
            sb.append(".substr(1, inputString");
            sb.append(index);
            sb.append(".size() - 2);\n");
            sb.append("replace(inputString");
            sb.append(index);
            sb.append(".begin(), inputString");
            sb.append(index);
            sb.append(".end(), ',', ' ');\n");
            sb.append("stringstream ss");
            sb.append(index);
            sb.append("(inputString");
            sb.append(index);
            sb.append(");\n");

            sb.append("string str");
            sb.append(index);
            sb.append(";\n");
            sb.append("vector<vector<int>> a");
            sb.append(index);
            sb.append(";\n");

            sb.append("while (ss");
            sb.append(index);
            sb.append(" >> str");
            sb.append(index);
            sb.append(") {\n");
            sb.append("str");
            sb.append(index);
            sb.append(" = str");
            sb.append(index);
            sb.append(".substr(1, str");
            sb.append(index);
            sb.append(".size() - 2);\n");
            sb.append("replace(str");
            sb.append(index);
            sb.append(".begin(), str");
            sb.append(index);
            sb.append(".end(), ',', ' ');\n");
            sb.append("stringstream stream(str");
            sb.append(index);
            sb.append(");\n");

            sb.append("int num;\n");
            sb.append("vector<int> temp;\n");
            sb.append("while (stream >> num) {\n");
            sb.append("temp.push_back(num);\n");
            sb.append("}\n");
            sb.append("a");
            sb.append(index);
            sb.append(".push_back(temp);\n");
            sb.append("} \n");

            return sb.toString();
        }
        else if(inputParameter.equals("double[][]")){
            StringBuilder sb = new StringBuilder();
            sb.append("string inputString");
            sb.append(index);
            sb.append(" = argv[");
            sb.append(index);
            sb.append("];\n");

            sb.append("inputString");
            sb.append(index);
            sb.append(" = inputString");
            sb.append(index);
            sb.append(".substr(1, inputString");
            sb.append(index);
            sb.append(".size() - 2);\n");
            sb.append("replace(inputString");
            sb.append(index);
            sb.append(".begin(), inputString");
            sb.append(index);
            sb.append(".end(), ',', ' ');\n");
            sb.append("stringstream ss");
            sb.append(index);
            sb.append("(inputString");
            sb.append(index);
            sb.append(");\n");

            sb.append("string str");
            sb.append(index);
            sb.append(";\n");
            sb.append("vector<vector<double>> a");
            sb.append(index);
            sb.append(";\n");

            sb.append("while (ss");
            sb.append(index);
            sb.append(" >> str");
            sb.append(index);
            sb.append(") {\n");
            sb.append("str");
            sb.append(index);
            sb.append(" = str");
            sb.append(index);
            sb.append(".substr(1, str");
            sb.append(index);
            sb.append(".size() - 2);\n");
            sb.append("replace(str");
            sb.append(index);
            sb.append(".begin(), str");
            sb.append(index);
            sb.append(".end(), ',', ' ');\n");
            sb.append("stringstream stream(str");
            sb.append(index);
            sb.append(");\n");

            sb.append("double num;\n");
            sb.append("vector<double> temp;\n");
            sb.append("while (stream >> num) {\n");
            sb.append("temp.push_back(num);\n");
            sb.append("}\n");
            sb.append("a");
            sb.append(index);
            sb.append(".push_back(temp);\n");
            sb.append("} \n");
            return sb.toString();

        }
        else if(inputParameter.equals("String[][]")){
            StringBuilder sb = new StringBuilder();
            sb.append("string inputString");
            sb.append(index);
            sb.append(" = argv[");
            sb.append(index);
            sb.append("];\n");

            sb.append("inputString");
            sb.append(index);
            sb.append(" = inputString");
            sb.append(index);
            sb.append(".substr(1, inputString");
            sb.append(index);
            sb.append(".size() - 2);\n");
            sb.append("replace(inputString");
            sb.append(index);
            sb.append(".begin(), inputString");
            sb.append(index);
            sb.append(".end(), ',', ' ');\n");
            sb.append("stringstream ss");
            sb.append(index);
            sb.append("(inputString");
            sb.append(index);
            sb.append(");\n");

            sb.append("string str");
            sb.append(index);
            sb.append(";\n");
            sb.append("vector<vector<string>> a");
            sb.append(index);
            sb.append(";\n");

            sb.append("while (ss");
            sb.append(index);
            sb.append(" >> str");
            sb.append(index);
            sb.append(") {\n");
            sb.append("str");
            sb.append(index);
            sb.append(" = str");
            sb.append(index);
            sb.append(".substr(1, str");
            sb.append(index);
            sb.append(".size() - 2);\n");
            sb.append("replace(str");
            sb.append(index);
            sb.append(".begin(), str");
            sb.append(index);
            sb.append(".end(), ',', ' ');\n");
            sb.append("stringstream stream(str");
            sb.append(index);
            sb.append(");\n");

            sb.append("string num;\n");
            sb.append("vector<string> temp;\n");
            sb.append("while (stream >> num) {\n");
            sb.append("temp.push_back(num);\n");
            sb.append("}\n");
            sb.append("a");
            sb.append(index);
            sb.append(".push_back(temp);\n");
            sb.append("} \n");
            return sb.toString();
        }
        return null;
    }

    public String changeOutputParameter(String outputParameter){
        if(outputParameter.equals("int")||outputParameter.equals("double")){
            return outputParameter;
        }
        else if(outputParameter.equals("String")){
            return "string";
        }
        else if(outputParameter.equals("int[]")){
            return "vector<int>";
        }
        else if(outputParameter.equals("double[]")){
            return "vector<double>";
        }
        else if(outputParameter.equals("String[]")){
            return "vector<string>";
        }
        else if(outputParameter.equals("int[][]")){
            return "vector<vector<int>>";
        }
        else if(outputParameter.equals("double[][]")){
            return "vector<vector<double>>";
        }
        else if(outputParameter.equals("String[][]")){
            return "vector<vector<string>>";
        }
        return null;
    }

    @Override
    public String makeOutput(String outputParameter) {
        if(outputParameter.equals("int")||outputParameter.equals("double")||outputParameter.equals("String")){
            StringBuilder sb = new StringBuilder();
            sb.append("cout<<result;\n");
            return sb.toString();
        }
        else if(outputParameter.equals("int[]")){
            StringBuilder sb = new StringBuilder();
            sb.append("int size = result.size();\n");
            sb.append("string str = \"\";\n");
            sb.append("for (int i = 0; i < size; i++) {\n");
            sb.append("if(i==0) str += \"[\";\n");
            sb.append("str+=to_string(result[i]);\n");
            sb.append("if(i!=size-1) str+=\",\";\n");
            sb.append("else str+=\"]\";\n");
            sb.append("}\n");
            sb.append("cout << str;\n");

            /*
            int size = result.size();
            string str = "";
            for (int i = 0; i < size; ++i) {
                if(i==0) str += "[";
                str+=to_string(result[i]);
                if(i!=size-1) str+=",";
                else str+="]";
            }
            cout << str;
            */

            return sb.toString();

        }
        else if(outputParameter.equals("double[]")){
            StringBuilder sb = new StringBuilder();
            sb.append("int size = result.size();\n");
            sb.append("string str = \"\";\n");
            sb.append("for (int i = 0; i < size; i++) {\n");
            sb.append("if(i==0) str += \"[\";\n");
            sb.append("str+=to_string(result[i]);\n");
            sb.append("str.erase(str.find_last_not_of('0') + 1, string::npos);\n");
            sb.append("if(i!=size-1) str+=\",\";\n");
            sb.append("else str+=\"]\";\n");
            sb.append("}\n");
            sb.append("cout << str;\n");

            /*
                int size = result.size();
                string str = "";
                for (int i = 0; i < size; ++i) {
                    if(i==0) str += "[";
                    str+=to_string(result[i]);
                    str.erase(str.find_last_not_of('0') + 1, string::npos);
                    if(i!=size-1) str+=",";
                    else str+="]";
                }
                cout << str;
             */

            return sb.toString();
        }
        else if(outputParameter.equals("String[]")){
            StringBuilder sb = new StringBuilder();
            sb.append("int size = result.size();\n");
            sb.append("string str = \"\";\n");
            sb.append("for (int i = 0; i < size; i++) {\n");
            sb.append("if(i==0) str += \"[\";\n");
            sb.append("str+=result[i];\n");
            sb.append("if(i!=size-1) str+=\",\";\n");
            sb.append("else str+=\"]\";\n");
            sb.append("}\n");
            sb.append("cout << str;\n");

            /*
            int size = result.size();
            string str = "";
            for (int i = 0; i < size; ++i) {
                if(i==0) str += "[";
                str+=result[i];
                if(i!=size-1) str+=",";
                else str+="]";
            }
            cout << str;
             */
            return sb.toString();
        }
        else if(outputParameter.equals("int[][]")){
            StringBuilder sb = new StringBuilder();

            sb.append("int size = result.size();\n");
            sb.append("string strstr = \"\";\n");
            sb.append("for (int i = 0; i < size; i++) {\n");
            sb.append("if(i==0) strstr += \"[\";\n");
            sb.append("int vSize=result[i].size();\n");
            sb.append("for(int j=0;j<vSize;j++){\n");
            sb.append("if(j==0) strstr += \"[\";\n");
            sb.append("strstr+=to_string(result[i][j]);\n");
            sb.append("if(j!=vSize-1) strstr+=\",\";\n");
            sb.append("else strstr+=\"]\";\n");
            sb.append("}\n");
            sb.append("if(i!=size-1) strstr+=\"/\";\n");
            sb.append("else strstr+=\"]\";\n");
            sb.append("}\n");
            sb.append("cout << strstr;\n");

            /*
            int size = result.size();
            string strstr = "";
            for (int i = 0; i < size; i++) {
                if(i==0) strstr += "[";
                int vSize=result[i].size();
                for(int j=0;j<vSize;j++){
                    if(j==0) strstr += "[";
                    strstr+=to_string(result[i][j]);
                    if(j!=vSize-1) strstr+=",";
                    else strstr+="]";
                }
                if(i!=size-1) strstr+="/";
                else strstr+="]";
            }
            cout << strstr;
             */

            return sb.toString();
        }
        else if(outputParameter.equals("double[][]")){
            StringBuilder sb = new StringBuilder();
            sb.append("int size = result.size();\n");
            sb.append("string strstr = \"\";\n");
            sb.append("for (int i = 0; i < size; i++) {\n");
            sb.append("if(i==0) strstr += \"[\";\n");
            sb.append("int vSize=result[i].size();\n");
            sb.append("for(int j=0;j<vSize;j++){\n");
            sb.append("if(j==0) strstr += \"[\";\n");
            sb.append("strstr+=to_string(result[i][j]);\n");
            sb.append("strstr.erase(strstr.find_last_not_of('0') + 1, string::npos);\n");
            sb.append("if(j!=vSize-1) strstr+=\",\";\n");
            sb.append("else strstr+=\"]\";\n");
            sb.append("}\n");
            sb.append("if(i!=size-1) strstr+=\"/\";\n");
            sb.append("else strstr+=\"]\";\n");
            sb.append("}\n");
            sb.append("cout << strstr;\n");

            /*
                int size = result.size();
                string strstr = "";
                for (int i = 0; i < size; i++) {
                    if(i==0) strstr += "[";
                    int vSize=result[i].size();
                    for(int j=0;j<vSize;j++){
                        if(j==0) strstr += "[";
                        strstr+=to_string(result[i][j]);
                        strstr.erase(strstr.find_last_not_of('0') + 1, string::npos);
                        if(j!=vSize-1) strstr+=",";
                        else strstr+="]";
                    }
                    if(i!=size-1) strstr+="/";
                    else strstr+="]";
                }
                cout << strstr;
             */
            return sb.toString();

        }
        else if(outputParameter.equals("String[][]")){
            StringBuilder sb = new StringBuilder();
            sb.append("int size = result.size();\n");
            sb.append("string strstr = \"\";\n");
            sb.append("for (int i = 0; i < size; i++) {\n");
            sb.append("if(i==0) strstr += \"[\";\n");
            sb.append("int vSize=result[i].size();\n");
            sb.append("for(int j=0;j<vSize;j++){\n");
            sb.append("if(j==0) strstr += \"[\";\n");
            sb.append("strstr+=(result[i][j]);\n");
            sb.append("if(j!=vSize-1) strstr+=\",\";\n");
            sb.append("else strstr+=\"]\";\n");
            sb.append("}\n");
            sb.append("if(i!=size-1) strstr+=\"/\";\n");
            sb.append("else strstr+=\"]\";\n");
            sb.append("}\n");
            sb.append("cout << strstr;\n");

            /*
            int size = result.size();
            string strstr = "";
            for (int i = 0; i < size; i++) {
                if(i==0) strstr += "[";
                int vSize=result[i].size();
                for(int j=0;j<vSize;j++){
                    if(j==0) strstr += "[";
                    strstr+=(result[i][j]);
                    if(j!=vSize-1) strstr+=",";
                    else strstr+="]";
                }
                if(i!=size-1) strstr+="/";
                else strstr+="]";
            }
            cout << strstr;
             */
            return sb.toString();
        }

        return null;
    }

    public String addCode(String code, String basicCode){

        StringBuilder sb = new StringBuilder();
        sb.append("#include <iostream>\n");
        sb.append("#include <vector>\n");
        sb.append("#include <string>\n");
        sb.append("#include <sstream>\n");
        sb.append("#include <algorithm>\n");
        String includeString = sb.toString();

        return includeString+code+basicCode;
    }
}
