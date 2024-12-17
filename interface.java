Interface Interdemo
{
public void display( );
public void run( );
}
class ImpleInterdemo Implements Interdemo
{
public void display( )
{
system.out.println("we are using interface");
}
}
public void run( )
{
system.out.println("executing run method");
}
}
public class list Interdemo
{
public static void main(string args[ ])
{
ImpleInterdemo tid=new ImpleInterdemo( )
tid.display( );
tid.run( );
}
}
