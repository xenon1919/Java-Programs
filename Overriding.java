class Overriding {
    void show(int a) {
        System.out.println("1");
    }
}
class Test extends Overriding {

    void show(int a) {
        System.out.println("2");
    }
public static void main(String args[]) {
Overriding o = new Overriding();
o.show(10);
Test p = new Test();
p.show(12);
}
}