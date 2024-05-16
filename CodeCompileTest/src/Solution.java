public class Solution{
    public int solution(int a, double b, String c, int[]d, double[]e, String[] f, int[][]g, double[][]h, String[][]i) {

        return a;
    }
    public static void main(String[] args) {
        int a0= Integer.parseInt(args[0]);
        double a1= Double.parseDouble(args[1]);
        String a2= args[2];
        String input3 = args[3];
        String[] parts3 = input3.substring(1, input3.length() - 1).split(",");
        int[] a3 = new int[parts3.length];
        for (int i = 0; i < parts3.length; i++) {
            String str = parts3[i];
            a3[i] = Integer.parseInt(str);
        }
        String input4 = args[4];
        String[] parts = input4.substring(1, input4.length() - 1).split(",");
        double[] a4 = new double[parts.length];
        for (int i = 0; i < parts.length; i++) {
            String str = parts[i];
            a4[i] = Double.parseDouble(str);
        }
        String input5 = args[5];
        String[] a5 = input5.substring(1, input5.length() - 1).split(",");
        String input6 = args[6];
        String[] outerParts6 = input6.substring(1, input6.length() - 1).split("/");
        int[][] a6 = new int[outerParts6.length][];
        for (int i = 0; i < outerParts6.length; i++) {
            String[] innerParts = outerParts6[i].substring(1, outerParts6[i].length() - 1).split(",");
            a6[i] = new int[innerParts.length];
            for (int j = 0; j < innerParts.length; j++) {
                a6[i][j] = Integer.parseInt(innerParts[j]);
            }
        }
        String input7 = args[7];
        String[] outerParts7 = input7.substring(1, input7.length() - 1).split("/");
        double[][] a7 = new double[outerParts7.length][];
        for (int i = 0; i < outerParts7.length; i++) {
            String[] innerParts = outerParts7[i].substring(1, outerParts7[i].length() - 1).split(",");
            a7[i] = new double[innerParts.length];
            for (int j = 0; j < innerParts.length; j++) {
                a7[i][j] = Double.parseDouble(innerParts[j]);
            }
        }
        String input8 = args[8];
        String[] outerParts8 = input8.substring(1, input8.length() - 1).split("/");

        String[][] a8 = new String[outerParts8.length][];

        for (int i = 0; i < outerParts8.length; i++) {
            String[] innerParts = outerParts8[i].substring(1, outerParts8[i].length() - 1).split(",");
            a8[i] = new String[innerParts.length];

            for (int j = 0; j < innerParts.length; j++) {
                a8[i][j] = innerParts[j];
            }
        }
        Solution test = new Solution();
        int result = test.solution(a0, a1, a2, a3, a4, a5, a6, a7, a8);
        System.out.println(result);
    }
}


