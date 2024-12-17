import java.awt.*;
public class checkboxgroup {
    public static void main(String[] args) {
        Frame f = new Frame("CheckboxGroup");
        CheckboxGroup cg1 = new CheckboxGroup();
        Checkbox c1 = new Checkbox("C",cg1, true);
        Checkbox c2 = new Checkbox("Java", cg1,false);
        c1.setBounds(100,100,50,30);
        c2.setBounds(100,150,80,30);
        f.add(c1);
        f.add(c2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
