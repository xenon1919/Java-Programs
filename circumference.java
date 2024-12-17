import java.util.Scanner;
public class circumference {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double circumference = 2*r*3.14;
        System.out.println(circumference);
        sc.close();
       }
     
}
