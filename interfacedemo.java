interface printable {
    void print();
}
class interfacedemo implements printable {
    public void print() {
        System.out.println("print");
    }
    public static void main(String args[]) {
        interfacedemo obj = new interfacedemo();
        obj.print();
    }
}