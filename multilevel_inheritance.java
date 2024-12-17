class A {
    public void run() {
        System.out.println("I am running");
    }
}
class B extends A {
    public void walk() {
        System.out.println("I am walking");
    }
}
class C extends B {
    public void eat() {
        System.out.println("I am eating");
    }
}
public class multilevel_inheritance {
    public static void main(String[] args) {
    C obj = new C();
    obj.walk();
    obj.eat();
    obj.run();
    }
    
}
