interface A {
    void mA();
}
interface B extends A {
    void mB();
}
public class testinterface implements B {
   public void mA() {
        System.out.println("I am in A method");
    }
  public void mB() {
        System.out.println("I am in B method");
    }
    public static void main(String args[]) {
        testinterface obj = new testinterface();
        obj.mA();
        obj.mB();
    }
}
