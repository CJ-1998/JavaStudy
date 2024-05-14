package test;

public class OuterClass {

    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public void hello(){
        System.out.println("hello");
    }

    public class InnerClass{

        public void sayOutsideHello(){
            OuterClass.this.hello();
            OuterClass.this.setNum(5);

            System.out.println(OuterClass.this.num);
        }

    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        innerClass.sayOutsideHello();
    }

}
