import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Stack <E>{

    public void push(E e){

    }

    public Number pop(){
        return null;
    }

    public void pushAll(Iterable<? extends Number> src){
        for (Integer number : src) {

        }

        for (Number number : src) {

        }

        for (Object number : src) {

        }

    }

    public void popAll(Collection<? super Number> dst){
        Integer integer = 3;
        Number number = 3;
        Object object = 3;

        dst.add(integer);
        dst.add(number);
        dst.add(object);

        for (Object o : dst) {

        }

        for (Number o : dst) {

        }

        for (Integer o : dst) {

        }
    }

    public void test(ArrayList<? extends Number> dst){
        Integer integer = 3;
        Number number = 3;
        Object object = 3;

        dst.add(integer);
        dst.add(number);
        dst.add(object);

        for (Object o : dst) {

        }

        for (Number o : dst) {

        }

        for (Integer o : dst) {

        }

    }
}
