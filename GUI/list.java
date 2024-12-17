import java.awt.*;
public class list {
    public static void main(String args[]) {
        Frame f = new Frame("List");
        List l = new List(6);
        l.setBounds(100,100,150,100);
        l.add("Java");
        l.add("SQL");
        l.add("PHP");
        l.add("MongoDB");
        l.add("Django");
        l.add("Ruby");
        f.add(l);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}