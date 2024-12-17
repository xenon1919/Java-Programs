public class sum {
// Overloaded sum(). This sum takes two int parameters
public int sum1(int x, int y)
{
return (x + y);
}
// Overloaded sum(). This sum takes three int parameters
public int sum1(int x, int y, int z)
{
return (x + y + z);
}
// Overloaded sum(). This sum takes two double parameters
public double sum1(double x, double y)
{
return (x + y);
}
public static void main(String args[])
{
sum s = new sum();
System.out.println(s.sum1(10, 20));
System.out.println(s.sum1(10, 20, 30));
System.out.println(s.sum1(10.5, 20.5));
}}
