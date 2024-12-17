import java.util.*;
class HashtableDemo
{ public static void main(String args[])
 { Hashtable<Integer,String> student = new Hashtable<Integer, String>();
 student.put(new Integer(101), "Emma");
 student.put(new Integer(102), "Adele");
 student.put(new Integer(103), "Aria");
 student.put(new Integer(104), "Ally");
 Set dataset = student.entrySet();
 Iterator iterate = dataset.iterator();
 while(iterate.hasNext())
 { Map.Entry map=(Map.Entry)iterate.next();
 System.out.println(map.getKey()+" "+map.getValue());
 } } }