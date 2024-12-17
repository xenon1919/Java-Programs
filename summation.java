import java.util.Scanner;
public class summation {
    public static void main(String args[]) {
        System.out.println("Enter n value\n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int i=1;
        while(i<=n) {
            sum =sum+i;
            i++;
        }
       System.out.println(sum);
    }
}
