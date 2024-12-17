class Sample
{
	int total = 0;
	synchronized void m()
	{
		for(int i =1;i<=5;i++)
		{
			total = total+i;
			System.out.println("\t"+total);
			System.out.println("\t"+Thread.currentThread().getId());
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class ThreadSyn extends Thread
{
	Sample S;
	ThreadSyn(Sample S)
	{
		this.S=S;
	}
	public void run()
	{
		S.m();
	}
}
class ThreadSyn1 extends Thread
{
	Sample S;
	ThreadSyn1(Sample S)
	{
		this.S=S;
	}
	public void run()
	{
		S.m();
	}
}
class TestThreadSyn
{
	public static void main(String args[])
	{
		Sample S = new Sample();
		System.out.println("Two Threads are Synchronized");
		ThreadSyn ts = new ThreadSyn(S);
		ThreadSyn1 ts1 = new ThreadSyn1(S);
		ts.start();
		ts1.start();
		
	}
}
