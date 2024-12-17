import java.util.*;
public class EnumerationInterface_demo {
    public static void main(String args[]) {
        Enumeration heroes;
        Vector x=new Vector();
        x.add("Iron Man");
        x.add("Captain America");
        x.add("Black Widow");
        x.add("Hulk");
        x.add("Hawkeye");
        x.add("Thor");
        heroes=x.elements();
        while(heroes.hasMoreElements()) {
            System.out.println(heroes.nextElement());
        }
    }
}
