class X {
    void add() {
        int x =5, y=5;
        System.out.println(x+y);
    }
}
class Y extends X {
    void product() {
        int a =2, b=3;
        System.out.println(a*b);

    }
    }
    class Z extends X {
        void div() {
            int i=10, j=5;
            System.out.println(i/j);
        }
    }

class Hierarchical {
    public static void main(String args[]) {
        Z obj = new Z();
        obj.div();
        obj.add();
    }
}