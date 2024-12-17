package sum;
import java.util.*;
public class add {
    public void sum() {
        System.out.println("Enter the first number : ");
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Enter the second number : ");
        int y=sc.nextInt();
        int z=x+y;
        System.out.println("Addition of two numbers is " + z);
    }
}