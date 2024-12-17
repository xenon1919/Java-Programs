import java.util.*;
public class AgeCheck 
{
	public static void CheckAge(int age) throws Exception
 	{
		if(age<18) 
		{
			throw new Exception("Not Eligible to Vote");
		}
		else
		{
			System.out.println("Eligible to vote");
		}
	}
	public static void main(String[] args)  {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		try  {
			CheckAge(age);
		}  catch(Exception e)  {
			System.out.println(e);
		}
		sc.close();
	}
}
		