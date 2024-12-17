import java.util.*;
public class HashTable_demo {
    public static void main(String args[]) {
        Hashtable<Integer,String>ht=new Hashtable <Integer,String>();
        ht.put(1,"Tony");
        ht.put(2,"Bruce");
        ht.put(3,"Steve");
        ht.put(4,"Natasha");
        System.out.println(ht);
        ht.remove(3);
        System.out.println(ht);
    }
}
