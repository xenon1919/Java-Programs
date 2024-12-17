class A {
    void run() {
        System.out.println("I am running");
    }
}
class B extends A {
    void eat() {
        System.out.println("I am sleeping");
    }
}
public class testinheritance {
    public static void main(String args[]) {
        B obj = new B();
        obj.run();
        obj.eat();
    }
    }
