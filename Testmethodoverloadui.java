import java.util.*;
class MethodOverloadingDemo
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public float add(float a, float b)
    {
        return a+b;
    }
}
class Testmethodoverloadui
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            MethodOverloadingDemo mod=new MethodOverloadingDemo();
            System.out.println("Enter 1st Number");
            int a = sc.nextInt();
            System.out.println("Enter 2nd Number");
            int b = sc.nextInt();
            System.out.println("Addition of 2 integers "+mod.add(a,b));
            System.out.println("Enter 1st Number");
            float t = sc.nextFloat();
            System.out.println("Enter 2nd Num ber");
            float u = sc.nextFloat();
            System.out.println("Addition of 2 float "+mod.add(t,u));
            System.out.println("Enter 1st Number");
            int p = sc.nextInt();
            System.out.println("Enter 2nd Number");
            int q = sc.nextInt();
            System.out.println("Enter 3rd Number");
            int r = sc.nextInt();
            System.out.println("Addition of 3 integers "+mod.add(p, q, r));
        }
    }
}