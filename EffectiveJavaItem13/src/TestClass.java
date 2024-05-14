public class TestClass {
    public static void main(String[] args) {
        try {
            Child original = new Child(10, 20);
            System.out.println("Original: " + original);
            Child cloned = original.clone();
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
