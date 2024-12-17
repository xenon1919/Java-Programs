import java.awt.*;
public class checkbox {
    public static void main(String args[]) {
        Frame f = new Frame("Checkbox");
        Checkbox c1 = new Checkbox("Java", true);
        Checkbox c2 = new Checkbox("Python");
        c1.setBounds(100,100,50,50);
        c2.setBounds(100,150,50,50);
        f.add(c1);
        f.add(c2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}