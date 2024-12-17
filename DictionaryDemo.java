import java.util.*;
public class DictionaryDemo {
    public static void main(String[] args) {
        Dictionary st = new Hashtable();
        st.put("101","Bruce");
        st.put("102","Wayne");
        st.put("103","Diana");
        st.put("104","Clark");
        st.put("105","Kent");        
        System.out.println("\nDelete:"+st.remove("103"));
        Enumeration e = st.elements();
        System.out.println("After Deletion");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());      
        }
        System.out.println("The name of Deleted Student: "+st.get("103"));
        System.out.println("\nThe size of Student Dictionary is: "+st.size());
    }    
}