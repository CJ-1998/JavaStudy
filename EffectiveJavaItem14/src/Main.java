import java.awt.Dimension;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        Integer[] temp = new Integer[5];
        for (int i=0;i<5;i++){
            temp[i]=5-i;
        }

        Arrays.sort(temp);
        for (Integer integer : temp) {
            System.out.println("integer = " + integer);
        }

        System.out.println();

        NotMakeCompareTo[] arr = new NotMakeCompareTo[5];
        for (int i=0;i<5;i++){
            arr[i]=new NotMakeCompareTo(i);
        }

//        Arrays.sort(arr);
//
//        for (NotMakeCompareTo notMakeCompareTo : arr) {
//            System.out.println("notMakeCompareTo = " + notMakeCompareTo);
//        }

        BigDecimal t1= new BigDecimal("10.0");
        BigDecimal t2= new BigDecimal("10.000");

        System.out.println(t1.compareTo(t2));
        System.out.println(t1.equals(t2));

        System.out.println("-----------------------");

        ArrayList<Integer> testList = new ArrayList<>(3);
        testList.add(2);
        testList.add(5);
        testList.add(6);

        Test test = new Test(testList);

        test.showList();

        System.out.println();

        testList.set(0,144);

        test.showList();

        System.out.println();

        System.out.println("-----------------------");


        BigDecimal t11= new BigDecimal(10.0);
        BigDecimal t22= new BigDecimal(10.000);

        System.out.println(t11.compareTo(t22));
        System.out.println(t11.equals(t22));

        BigInteger tempInteger = new BigInteger("12");

        AbstractCollection

    }
}
