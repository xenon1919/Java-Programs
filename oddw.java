import java.util.Scanner;
public class oddw {
    public static void main(String args[]) {
        System.out.println("Enter value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        while(i<=n) {
            if(i%2 != 0)
            {
                System.out.println(i);
            }
            i++;
        }
        sc.close();
    }
}
