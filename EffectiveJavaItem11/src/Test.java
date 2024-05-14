import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        One2 one1 = new One2(5,3);
        One2 one2 = new One2(5,3);

        One1 one3 = new One1(5,3);
        One1 one4 = new One1(5,3);

        System.out.println("not include c: " + one1.hashCode());
        System.out.println("not include c: " + one2.hashCode());

        System.out.println();

        System.out.println("include c: " + one3.hashCode());
        System.out.println("include c: " + one4.hashCode());

        Map<One3,String> m = new HashMap<>();
        m.put(new One3(5,3),"KIM");
        System.out.println(m.get(new One3(5,3))); //null

        Set<One3> set = new HashSet<>();
        set.add(new One3(5,3));
        System.out.println(set.contains(new One3(5,3))); //false

    }
}
