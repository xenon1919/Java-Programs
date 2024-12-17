import java.awt.*;
import java.applet.*;
/* <applet code = "checkboxgroup1.class" height="200" width=300> </applet */
public class checkboxgroup1 extends Applet {
    public void init() {
        CheckboxGroup cg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("C",cg,true);
        Checkbox c2 = new Checkbox("C++",cg,false);
        add(c1);
        add(c2);
    }
}