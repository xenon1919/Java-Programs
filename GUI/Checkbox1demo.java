import java.awt.*;
import java.applet.*;
/* <applet code = "Checkbox1demo.class" height="200" width=300> </applet */
public class Checkbox1demo extends Applet {
    public void init() {
        Checkbox c1 = new Checkbox("Java",true);
        Checkbox c2 = new Checkbox("PHP");
        add(c1);
        add(c2);
    }
}