import java.util.Scanner;
public class evenw {
    public static void main(String args[]) {
        System.out.println("Enter n value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while(i<=n) {
            if(i%2 == 0) {
                System.out.println(i);
            }
            i++;
        }
sc.close();
    }
}
