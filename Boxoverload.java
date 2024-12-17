class Boxoverload
{
    double width,height,length;
    Boxoverload(double w,double h,double l)
    {
        width=w;height=h;length=l;
    }
    Boxoverload()
    {
        width=-1;height=-1;length=-1;
    }
    Boxoverload(double side)
    {
        width=height=length=side;
    }
    double vol()
    {
        return width*height*length;
    }
    public static void main(String[] args)
    {
        Boxoverload bc = new Boxoverload(36);
        Boxoverload sc = new Boxoverload();
        Boxoverload nc = new Boxoverload(23.5, 30.5, 20.9);

        System.out.println("Volume of Cube= "+bc.vol());
        System.out.println("Volume of Box(Negative input)= "+sc.vol());
        System.out.println("Volume of Box(Cuboid)= "+nc.vol());
    }
}