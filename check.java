import java.util.Scanner;
public class check {
    public static void main(String args[]) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0) {
            System.out.println("It is an even number");
        }
        else {
            System.out.println("It is an odd number");
        }

    }
}