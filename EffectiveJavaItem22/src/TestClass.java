public class TestClass implements PhysicalConstants{

    public TestClass() {
    }

    public void test(){
        System.out.println("AVOGADROS_NUMBER: " + AVOGADROS_NUMBER);
        System.out.println("ELECTRON_MASS: " + ELECTRON_MASS);
    }

    public double chemical(){
        return AVOGADROS_NUMBER;
    }
}
