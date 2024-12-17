import java.util.*;
public class treeset {
    public static void main(String args[]) {
        TreeSet<String> ts= new TreeSet<String>();
        ts.add("I");
        ts.add("am");
        ts.add("a");
        ts.add("good");
        ts.add("programmer");
        Iterator<String>itr=ts.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}