class Addone extends Thread
{
	public void run()
	{
		System.out.println("Using Thread Class");
		System.out.println("Process exec on thread"+Thread.currentThread().getId());
		System.out.println("Addone Thread");
		int sum=0;
		for(int i=10;i<20;i++)
		sum=sum+i;
		System.out.println("Sum i"+sum);
	}
}
class Addtwo implements Runnable
{
	public void run()
	{
		System.out.println("Using Interface");
		System.out.println("Process exec on thread"+Thread.currentThread().getId());
		System.out.println("Addtwo Thread");
		int sum=0;
		for(int i=20;i<=30;i++)
		sum=sum+i;
		System.out.println("Sum i"+sum);
	}
}
public class Threaddemo
{
	public static void main(String[] args)
	{
		Addone obj1 = new Addone();
		Thread obj2 = new Thread(new Addtwo());
		obj2.start();
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			obj1.start();
		}
	}
}
