public class exception_demo {
    public static void main(String[] args) {
        try {
            int a=1/0;
            System.out.println(a);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
    }
}
