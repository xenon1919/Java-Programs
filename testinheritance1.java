class A {
    void run() {
        System.out.println("I am running");
    }
}
class B extends A {
    void eat() {
        System.out.println("I am eating");
    }
}
class C extends B {
    void dance() {
        System.out.println("I am dancing");
    }
}
public class testinheritance1 {
    public static void main(String args[]) {
        C obj = new C();
        obj.run();
        obj.eat();
        obj.dance();
    }
}
