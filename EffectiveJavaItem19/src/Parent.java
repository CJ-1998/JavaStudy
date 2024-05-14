public class Parent {

    public void A(){
        System.out.println("부모 클래스 메서드 사용");
        B();
    }

    public void B(){
        System.out.println("재정의 한 메서드 사용");
    }

}
