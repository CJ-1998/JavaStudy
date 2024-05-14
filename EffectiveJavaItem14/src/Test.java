import java.util.ArrayList;

public class Test {

    private ArrayList<Integer> t;

    public Test(ArrayList<Integer> t) {
        this.t = t;
    }

    public void showList(){

        for (Integer integer : t) {
            System.out.print("integer = " + integer+" ");
        }
    }
}
