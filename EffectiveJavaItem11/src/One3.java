import java.util.Objects;

public class One3 {

    private int a;
    private int b;

    public One3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        One3 one3 = (One3) o;
        return a == one3.a && b == one3.b;
    }
}
