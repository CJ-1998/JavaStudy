import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map map = new HashMap<Integer, String>();

        map.put(0, "00");
        map.put(1, "11");
        map.put(2, "22");
        map.put(3, "33");

        Set<Integer> set1 = map.keySet();
        System.out.println("set1 인스턴스 주소: "+ System.identityHashCode(set1));

        Set<Integer> set2 = map.keySet();
        System.out.println("set2 인스턴스 주소: "+ System.identityHashCode(set2));

        System.out.println();
        System.out.println("set 1 값: " + set1);
        System.out.println("set 2 값: " + set2);

        set1.remove(3);

        System.out.println();
        System.out.println("set 1 변경 후");
        System.out.println("set 1 값: " + set1);
        System.out.println("set 2 값: " + set2);

        System.out.println();
        Set<Integer> set3 = map.keySet();
        System.out.println("set3 인스턴스 주소: "+ System.identityHashCode(set3));
    }

    private static long sum(){
        long sum = 0L;
        for(long i = 0; i<=Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }
}
