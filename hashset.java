import java.util.*;
public class hashset {
    public static void main(String args[]) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Java");
        hs.add("is");
        hs.add("secure");
        Iterator<String>itr=hs.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        }
    }

