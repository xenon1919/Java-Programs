import java.util.*;
public class HashMap_demo {
    public static void main(String args[]) {
        HashMap<Integer,String>hm= new HashMap<Integer,String>();
        hm.put(1,"Rishi");
        hm.put(2,"Sai");
        hm.put(3,"Teja");
        for(Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
