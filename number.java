import java.util.Scanner;
public class number {
    public static void main(String args[]) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b) {
            System.out.println("a and b are equal");
        }
        else if(a>b) {
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("a is lesser tha b");
        }
sc.close();
    }
}
