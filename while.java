import java.util.Scanner;
public class loopwhile {
    public static void main(String args[]) {
        System.out.println("Enter n value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n) {
            System.out.println(i);
            i++
        }

    }
}
