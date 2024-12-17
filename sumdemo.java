import java.util.Scanner;
public class sumdemo {
    public static void main(String[] args) {
        int n, sum=0, add=0;
        System.out.println("Enter the number of integers to be added : ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter integers : ");
        for(int i=0;i<n;i++) {
            Scanner s = new Scanner(System.in);
            add=s.nextInt();
            sum=sum+add;
        }
        System.out.println("The sum of numbers is " +sum);
        sc.close();
    }
}