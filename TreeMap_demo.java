import java.util.*;
public class TreeMap_demo {
    public static void main(String args[]) {
        TreeMap<Integer,String> tm= new TreeMap <Integer,String>();
        tm.put(1,"Rishi");
        tm.put(2,"Sai");
        tm.put(3,"Teja");
        tm.put(4,"Xeno");
        for(Map.Entry m:tm.entrySet()) {
            System.out.println(m.getKey() + " "+m.getValue());
        }
    }
}
