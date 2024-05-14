public class Child1 extends Parent1 {

    public int a1;
    public int b1;

    public Child1(int a1, int b1) {
        this.a1 = a1;
        this.b1 = b1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Child1 temp = (Child1) super.clone();
        System.out.println("a1: "+temp.a1+" , b1: "+temp.b1);
        return temp;
    }

    @Override
    public void hi(int a, int b) {
        a1=a;
        b1=b;
    }
}
