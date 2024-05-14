public class Test implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Test t = new Test();
        return t;
    }
}
