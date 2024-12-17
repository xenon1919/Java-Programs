import java.util.Scanner;
public class operations {
    public static void main(String args[]) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        System.out.print("Choose the operation you want to perform\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n");
        int operator = sc.nextInt();
        switch(operator) {
            case 1 : 
            c = a + b;
            System.out.println(c);
            break;
            case 2 :
            c = a - b;
            System.out.println(c);
            break;
            case 3 :
            c = a*b;
            System.out.println(c);
            break;
            case 4 :
            c = a/b;
            System.out.println(c);
            break;
            default :
            System.out.println("Invalid operator");
        }
sc.close();
    }
}