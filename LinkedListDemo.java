import java.util.*;
class LinkedListDemo {
public static void main(String args[]) {
// Create an Linked list.
LinkedList<String> LL = new LinkedList<String>();
System.out.println("InitiLL size of LL: " +LL.size());
// Add elements to the Linked list.

LL.add("C");
LL.add("A");
LL.add("E");
LL.add("B");
LL.add("D");
LL.add("F");
LL.add(1, "A2");
System.out.println("Size of LL after additions: " +LL.size());
// Display the Linked list.
System.out.println("Contents of LL: " + LL);
// Remove elements from the Linked list.
LL.remove("F");
LL.remove(2);
System.out.println("Size of LL after deletions: " +LL.size());
System.out.println("Contents of LL: " + LL);
LL.removeFirst();
LL.removeLast();
System.out.println("Size of LL after deletion at First and Last: " +LL.size());
System.out.println("Contents of LL: " + LL);
}
}