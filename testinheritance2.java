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
class C extends A {
    void dance() {
        System.out.println("I am dancing");
    }
}
public class testinheritance2 {
    public static void main(String args[]) {
        C obj = new C();
        obj.dance();
        obj.run();
    }
}
