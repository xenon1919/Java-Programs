import java.util.*;
public class Dictionary_demo {
    public static void main(String args[]) {
        Dictionary d = new Hashtable();
        d.put(1,"Rishi");
        d.put(2,"Sai");
        d.put(3,"Teja");
        for(Enumeration e=d.elements(); e.hasMoreElements();) {
            System.out.println(e.nextElement());
        }
        d.remove(1);
        for(Enumeration e=d.elements(); e.hasMoreElements();) {
            System.out.println(e.nextElement());
        }
    }
}
