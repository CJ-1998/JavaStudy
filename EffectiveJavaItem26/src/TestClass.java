import java.util.ArrayList;
import java.util.List;

public class TestClass {

    public void rawTypeMethod(List test){

    }

    public void objectTypeMethod(List<Object> test){

    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();

        List<String> test = new ArrayList<>();

        testClass.rawTypeMethod(test);
//        testClass.objectTypeMethod(test);
    }
}
