public class Parent1 implements Cloneable {

    public int a1;
    public int b1;


    @Override
    protected Object clone() throws CloneNotSupportedException {

        Parent1 temp = (Parent1) super.clone();
        temp.hi(3,4);
        return temp;
    }

    public void hi(int a, int b){
        a1=a;
        b1=b;
    }
}
