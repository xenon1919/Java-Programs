import java.util.LinkedList;
public class linkedlist {
    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=-0;i<=6;i++) {
            ll.add(i);
        }
        System.out.println(ll);
        ll.remove(2);
        System.out.println(ll);
        for(int i=0;i<ll.size();i++) {
            System.out.println(ll.get(i) + " ");
        }
    }
}
