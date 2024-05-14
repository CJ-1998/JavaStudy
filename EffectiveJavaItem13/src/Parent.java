class Parent implements Cloneable {
    int x;

    public Parent(int x) {
        this.x = x;
    }

    @Override
    public Parent clone() throws CloneNotSupportedException {
        // 하위 클래스에서 오버라이딩 될 수 있는 메서드 호출
        this.adjustState(); // 잘못된 호출
        System.out.println("Parent clone method called");
        return (Parent) super.clone();
    }

    // 하위 클래스에서 오버라이딩 될 수 있는 메서드
    public void adjustState() {
        System.out.println("Parent's adjustState method called");
    }

    @Override
    public String toString() {
        return "Parent{" +
                "x=" + x +
                '}';
    }

}