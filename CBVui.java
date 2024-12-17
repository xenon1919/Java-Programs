import java.util.*;
class CBVui
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st and 2nd Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before call");
        System.out.println(a+" "+b);
        meth(a,b);
        System.out.println("After Call");
        System.out.println(a+" "+b);
    }
    public static void meth(int a, int b)
    {
        System.out.println("Before Swap");
        System.out.println(a+" "+b);
        int c = a;
        a = b;
        b = c;
        System.out.println("After Swap");
        System.out.println(a+" "+b);
    }
}
