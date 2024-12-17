import java.awt.*;
public class choice {
    public static void main(String[] args) {
        Frame f = new Frame("Choice");
        Choice ch = new Choice();
        ch.add("Apple");
        ch.add("Banana");
        ch.add("Orange");
        ch.add("Mango");
        ch.setBounds(100,100,150,100);
        f.add(ch);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}