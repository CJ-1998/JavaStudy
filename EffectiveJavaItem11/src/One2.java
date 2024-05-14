import java.util.Objects;

public class One2 {
    private int a;
    private int b;
    private int c;

    public One2(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = a+b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        One2 one2 = (One2) o;
        return a == one2.a && b == one2.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
