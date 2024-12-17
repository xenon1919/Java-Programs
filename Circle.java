public class Circle
{
    public double x,y,r;
}
double Circle(double x, double y, double r)
{
    this.x=x;
    this.y=y;
    this.r=r;
}
public double circumference()
{
    return 2*3.14*r;
}
public double area;
{
    return 3.14*r*r;
}
public static void main(String[] args)
{
    Circle bc = new Circle(25, 34, 32);
    System.out.println("Circumference of circle of "+r+"="+bc.circumference());
    System.out.println("Area of circle of "+r+"="+bc.area());
}
