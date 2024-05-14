import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MainClass {

    public void rawTypeParameter(GenericClass parameter){
        parameter.sayHello();
    }

    public void parameterizedTypeParameter(GenericClass<String> parameter){
        parameter.sayHello();
    }

    public void testParameter(List test){
        System.out.println("hi");
    }

    public static void main(String[] args) {
        GenericClass<String> temp1 = new GenericClass<>();
        GenericClass temp2 = new GenericClass();

        MainClass mainClass = new MainClass();

        mainClass.parameterizedTypeParameter(temp1);
        mainClass.rawTypeParameter(temp2);

        mainClass.parameterizedTypeParameter(temp2);
        mainClass.rawTypeParameter(temp1);



        Collection stamps = new ArrayList();
        stamps.add(new Stamp());
        stamps.add(new Coin());

        for(Iterator i = stamps.iterator(); i.hasNext();){
//            Stamp stamp = (Stamp) i.next();
        }

        /*
        Collection<Stamp> stampss = new ArrayList();
        stampss.add(new Stamp());
        stampss.add(new Coin());

        Collection<BigDecimal> test = new ArrayList<>();
        test.add(new BigDecimal(1));
        test.add(new BigInteger("3"));
        */

        List<String> test1 = new ArrayList<>();
        List<Object> test2 = new ArrayList<>();
        mainClass.testParameter(test1);
        mainClass.testParameter(test2);

        Set<String> test = new HashSet();
        

    }

    public static Set union(Set s1, Set s2){
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    static class Coin{

    }

    static class Stamp{

    }
}
