import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Raw {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
//        unsafeAdd(strings, Integer.valueOf(42));
//        String s= strings.get(0); // 컴파일러가 자동으로 형변환 코드를 넣어준다.

        Set<String> test1 = new HashSet<>();
        Set<Integer> test2 = new HashSet<>();

        test1.add("dsd");
        test2.add(3);

        Raw raw = new Raw();
//        raw.temp(test1, test2);

        Class temp = Enum.class;

        System.out.println(temp);

        List t=new ArrayList();


    }

    private static void unsafeAdd(List<Object> list, Object o) {
        list.add(o);
    }

    private void temp1(Set<?> s){
//        s.add(123);
        s.add(null);
    }

    private void temp2(Set s){
        s.add(123);
        s.add("123");
        s.add(null);
    }

    private void temp3(Set<Object> s){
        s.add(123);
        s.add("123");
        s.add(null);
    }
}