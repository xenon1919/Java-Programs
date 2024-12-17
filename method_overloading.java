public class method_overloading {
    public int sum(int x, int y) {
        return(x+y);
    }
    public int sum(int x, int y, int z) {
        return(x+y+z);
    }
    public double sum(double x, double y) {
        return(x+y);
    }
    public static void main(String args[]) {
        method_overloading obj=new method_overloading();
        System.out.println(obj.sum(10,10));
        System.out.println(obj.sum(10,10,10));
        System.out.println(obj.sum(10,20.5));
    }
}