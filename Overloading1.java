class Overloading1 {

    void show(int a, String b) {

        System.out.println("1");
    }

    void show(String a, int b) {
        
        System.out.println("2");
    }

    public static void main(String args[]) {

        Overloading1 o = new Overloading1();
        o.show(10, "DOG");
        o.show("CAT", 20);
    }
    
}
