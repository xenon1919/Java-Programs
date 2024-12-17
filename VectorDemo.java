import java.util.*;
public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector(3,2);
        System.out.println("Initial size"+v.size());
        System.out.println("Initial Capacity"+v.capacity());
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("Capacity after 4 addition"+v.capacity());
        v.addElement(5.45);
        System.out.println("Current Capacity"+v.capacity());
        v.addElement(6.08);
        v.addElement(7);
        System.out.println("Current Capacity"+v.capacity());
        v.addElement(9.4);
        v.addElement(10);
        System.out.println("Current Capacity"+v.capacity());
        v.addElement(11);
        v.addElement(12);
        System.out.println("First Element"+(Integer)v.firstElement());
        System.out.println("Last Element"+(Integer)v.lastElement());
        if(v.contains(3));
        System.out.println("Contains 3");
        Enumeration vEnum = v.elements();
        System.out.println("Elements in Vector");
        while(vEnum.hasMoreElements())
        System.out.println(vEnum.nextElement());
    }
}
