class Car
{
	Car()
	{
		System.out.println("Car");
	}
	void VehicleType()
	{
		System.out.println("VehicleType: Car");
	}
}
class Maruti extends Car
{
	Maruti()
	{
		System.out.println("Maruti");
	}
	void VehicleType()
	{
		System.out.println("VehicleType: Car");
	}
	void Brand()
	{
		System.out.println("Brand: Maruti");
	}
	void Speed()
	{
		System.out.println("Max: 90Kmph");
	}
}
class Maruti800 extends Maruti
{
	Maruti800()
	{
		System.out.println("Maruti Model: 800");
	}
	void VehicleType()
	{
		System.out.println("VehicleType: Car");
	}
	void Brand()
	{
		System.out.println("Brand: Maruti800");
	}
	void Speed()
	{
		System.out.println("Max: 80Kmph");
	}
}
class MultiInheritance
{
	public static void main(String[] args)
	{
		Maruti800 ob = new Maruti800();
		ob.VehicleType();
		ob.Brand();
		ob.Speed();
	}
}
