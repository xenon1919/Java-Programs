class Box
{
	double width;
	double height;
	double length;
	Box(double w,double h,double l)
	{
		width=w;height=h;length=l;
	}
	double volume()
	{
		return width*height*length;
	}
	public static void main(String[] args)
	{
		Box bc = new Box(32.9,67,34.6);
		System.out.println("Volume of the Box: "+bc.volume());
	}
}