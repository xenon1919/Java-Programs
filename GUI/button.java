import java.awt.*;
public class button {
    public static void main(String args[]) {
        Frame f = new Frame("Button");
        Button b = new Button("Tap here");
        b.setBounds(50,100,80,30);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}