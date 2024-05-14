import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Test test = new Test();
        TestCloneableInstance testCloneableInstance = new TestCloneableInstance();

        test.clone();
        testCloneableInstance.clone();

        Integer[] temp = {1,2,3};

        System.out.println(temp);
        System.out.println(temp.clone());
        System.out.println();

        Child1 child1 = new Child1(1,2);
        child1.clone();

        String t="D";

    }
}
