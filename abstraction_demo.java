abstract class A {
    abstract void run();
}
public class abstraction_demo extends A{
    public void run() {
        System.out.println("I am running");
    }
    public static void main(String[] args) {
        A obj = new abstraction_demo();
        obj.run();
    }
}
