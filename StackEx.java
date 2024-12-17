import java.util.*;
public class StackEx {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push("Captain");
        st.push("Jack");
        st.push("Sparrow");
        st.push("Batman");
        st.push("Flash");
        Enumeration e1 = st.elements();
        while (e1.hasMoreElements())
        System.out.println(e1.nextElement()+" ");
        st.pop();
        st.pop();
        System.out.println("\nAfter removing");
        Enumeration e2 = st.elements();
        while (e2.hasMoreElements())
        System.out.println(e2.nextElement());
    }
}
