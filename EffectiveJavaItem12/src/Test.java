import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.net.URL;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        MyClass myClass = new MyClass("kim",1234);
        MyClass myClass1=myClass;

        System.out.println(myClass);

        System.out.println(myClass1.equals(myClass));

        String string1="abcd";
        String string2="abcd";

        System.out.println(string1.equals(string2));


        CaseInsensitiveString temp1 = new CaseInsensitiveString("Polish");
        CaseInsensitiveString temp2 = new CaseInsensitiveString("polish");

        System.out.println(temp1.equals(temp2));
        System.out.println(temp2.equals(temp1));

        A a= new A();
        B b= new B();
        System.out.println(a.getClass());
        System.out.println(b.getClass());

        System.out.println((a instanceof B));
        System.out.println((b instanceof A));

        A t= null;
        System.out.println(t instanceof A);

//        Objects.equals(a,b);

        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList);


//        a.equals(null);

        int aa = 1073741825;
        int ab = 1073741824;
        System.out.println(ab*3);
        System.out.println(ab*2);

        int c=ab*3;

        System.out.println(c/3);

    }
}

