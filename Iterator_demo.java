import java.util.*;
public class Iterator_demo {
    public static void main(String[] args) {
        List<String>l=new LinkedList<>();
        l.add("I");
        l.add("am");
        l.add("Rishi");
        System.out.println(l);
        Iterator<String> itr=l.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        itr.remove();
        System.out.println(l);
    }
}
