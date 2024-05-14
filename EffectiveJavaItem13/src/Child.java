class Child extends Parent {
    int y;

    public Child(int x, int y) {
        super(x);
        this.y = y;
    }

    @Override
    public Child clone() throws CloneNotSupportedException {
        System.out.println("Child clone method called");
        return (Child) super.clone();
    }

    @Override
    public void adjustState() {
//        super.adjustState();
        System.out.println("Child's adjustState method called");
        // 복제 과정에서 자신의 상태를 교정
        this.y = 0;
    }

    @Override
    public String toString() {
        return "Child{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
