import java.util.Scanner;
class userInputDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number");
		float b = sc.nextFloat();
		System.out.println("Enter 3rd Number");
		int c = sc.nextInt();
		float d = a+b+c;
		System.out.println("Total="+d);
		sc.close();
	}
}