class A {
    void run() {
        System.out.println("I am running");
    }
}
class B extends A {
    void walk() {
        System.out.println("I am walking");
    }
}
class C extends B {
    void sleep() {
  System.out.println("I am sleeping");
}
}
class inheritance2 {
    public static void main(String args[])  {
    C obj = new C();
    obj.run();
    obj.walk();
    obj.sleep();

}
}
