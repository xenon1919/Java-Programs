class MethodOverloadingDemo
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add (int a,int b,int c)
	{
		return a+b+c;
	}
	public float add(float a,float b)
	{
		return a+b;
	}
}
class TestmethodOverloading
{
	public static void main(String[] args)
	{
		MethodOverloadingDemo mod = new MethodOverloadingDemo();
		System.out.println("Addition of 2 integers = "+mod.add(10,20));
		System.out.println("Addition of 2 float = "+mod.add(5.6f,6.3f));
		System.out.println("Addition of 3 integers = "+mod.add(4,5,6));
	}
}
