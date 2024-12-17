interface A {
    void mA();
}
interface B extends A {
    void mB();
}
public class interface_demo implements B{
    public void mA() {
        System.out.println("I am in A method ");
    }
    public void mB() {
        System.out.println("I am in B method ");
    }
    public static void main(String[] args) {
        interface_demo obj = new interface_demo();
        obj.mA();
        obj.mB();
    }
}
