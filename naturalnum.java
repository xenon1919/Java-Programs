import java.util.Scanner;
public class naturalnum {
    public static void main(String args[]) {
        System.out.println("Enter a number upto where series is to be generated\n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            System.out.println(i);
        }
sc.close();
    }
}
