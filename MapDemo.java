import java.util.*;
class MapDemo   {
    public static void main(String[] args) {
        Map<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));
        Set ds = hm.entrySet();
        Iterator it = ds.iterator();
        while (it.hasNext()) {
            Map.Entry<String,Integer> me = (Map.Entry)it.next();
            System.out.println(me.getKey()+" "+me.getValue());
        }
    }
}