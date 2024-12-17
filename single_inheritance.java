class A {
    public void eat() {
        System.out.println("I am eating");
    }
}
class B extends A {
    public void walk() {
        System.out.println("I am walking");
    }
}
public class single_inheritance {
    public static void main(String args[]) {
        B obj = new B();
        obj.walk();
        obj.eat();
    }
}
