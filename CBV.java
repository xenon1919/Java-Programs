class CBV
{
    public static void main(String[] args)
    {
        int a=15,b=20;
        System.out.println("Before Call ");
        System.out.println(a+" "+b);
        meth(a,b);
        System.out.println("After Call ");
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
