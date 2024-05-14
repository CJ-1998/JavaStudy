public class NoNameClass {

    private double x;
    private double y;

    public double operate() {
        Operator operator = new Operator() {
            private static double temp;

            @Override
            public double plus() {
                System.out.println(NoNameClass.this.operate());
                System.out.printf("%f + %f = %f\n", x, y, x + y);
                return x + y;
            }

            @Override
            public double minus() {
                System.out.printf("%f - %f = %f\n", x, y, x - y);
                return x - y;
            }
        };

        return operator.plus();
    }

    public static double temp(){
        Operator operator = new Operator() {

            public static int temp123(){
                return 0;
            }

            @Override
            public double plus() {
                return 0;
            }

            @Override
            public double minus() {
                return 0;
            }
        };

        return operator.minus();
    }
}

interface Operator {
    double plus();

    double minus();
}


