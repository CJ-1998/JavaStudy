public class OuterClass {
    public static void setTemp1(int temp1) {
        OuterClass.temp1 = temp1;
    }

    public void setTemp2(int temp2) {
        this.temp2 = temp2;
    }

    public static int getTemp1() {
        return temp1;
    }

    public int getTemp2() {
        return temp2;
    }

    public void sayBye(){
        InnerClass.sayBye(temp2);
    }

    private static int temp1;
    private int temp2;

    private static class InnerClass{

        private OuterClass outerClass;

        public InnerClass() {
            this.outerClass = new OuterClass();
        }

        public static void sayBye(int temp2){
            System.out.println(temp2);
        }

        public void sayHello(){
            System.out.println(temp1);
            System.out.println(outerClass.temp2);
        }
    }
}
