import java.util.*;
public class ArrayList_demo {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=1;i<=5;i++)
        al.add(i);
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
        System.out.println(al.size());
    }
}
