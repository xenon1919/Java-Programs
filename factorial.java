import java.util.Scanner;
public class factorial {   

public static void main(String args[]) {
    System.out.println("Enter a number for which you want to find factorial of :");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int fact = 1;
    int i;
    for(i=1;i<=num;i++)
    {
        fact=fact*i;
    }
    sc.close();
    System.out.println(fact);
    
}

}