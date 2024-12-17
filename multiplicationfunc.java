import java.util.Scanner;
public class multiplicationfunc {
    public static void mulFun(int a, int b) {
        int mulFun = a*b;
        System.out.println(mulFun);
    }
    public static void main(String args[]) {
        System.out.println("ENTER ANY TWO NUMBERS");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        mulFun(a,b);
sc.close();
    }
}
