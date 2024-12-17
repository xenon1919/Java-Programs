public class Inherit {
    void show() {
        System.out.println("I am in show method");
    }
}
class Inherit2 extends Inherit {
    void show2() {
        System.out.println("I am in show method");
    }
}
class display {
    public static void main(String args[]) {
        Inherit2 ob = new Inherit2();
        ob.show();
        ob.show2();
    }
}