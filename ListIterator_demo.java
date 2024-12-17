import java.util.*;
public class ListIterator_demo {
    public static void main(String[] args) {
        List<String> l = new LinkedList<>();
        l.add("I");
        l.add("am");
        l.add("Iron man");
        ListIterator<String> i = l.listIterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
        for(String s:l) {
            System.out.println(s);
        }
    }
}
