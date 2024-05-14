import java.util.Objects;

public class One1 {
    private int a;
    private int b;
    private int c;

    public One1(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = a+b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        One1 one1 = (One1) o;
        return a == one1.a && b == one1.b && c == one1.c;
    }
}
