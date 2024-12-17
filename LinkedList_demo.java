import java.util.*;
public class LinkedList_demo {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        for(int i=1;i<=5;i++)
        ll.add(i);
        System.out.println(ll);
        ll.remove(3);
        System.out.println(ll);
        System.out.println(ll.size());
    }
}
