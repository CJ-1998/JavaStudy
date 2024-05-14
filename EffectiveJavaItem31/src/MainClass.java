import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();

        Iterable<Integer> test1 = new ArrayList<>();
        Iterable<Number> test2 = new ArrayList<>();
        Iterable<Object> test3 = new ArrayList<>();

        stack.pushAll(test1);
        stack.pushAll(test2);
        stack.pushAll(test3);

        Collection<Integer> test11 = new ArrayList<>();
        Collection<Number> test22 = new ArrayList<>();
        Collection<Object> test33 = new ArrayList<>();

        stack.popAll(test11);
        stack.popAll(test22);
        stack.popAll(test33);

    }

    public void test1(List<? extends Number>list){
        Integer integer = list.get(0);
        Number number = list.get(0);
        Object object = list.get(0);
    }

    public void test2(List<? super Number> list){
        Integer integer = list.get(0);
        Number number = list.get(0);
        Object object = list.get(0);
    }
}
