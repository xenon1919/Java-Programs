import java.util.*;
import java.lang.*;
public class StringTokenizerDemo
{
	public static void main(String[] args)
	{
		int n;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integers with space gap");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s," ");
		while (st.hasMoreTokens());
		{
			String temp = st.nextToken();
			n = Integer.parseInt(temp);
			System.out.println(n);
			
		}
		System.out.println("Sum of Integers = "+sum);
	}
}
