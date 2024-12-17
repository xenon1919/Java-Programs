import java.awt.*;
import java.applet.*;
/* <applet code = "choice1.class" height="200" width=300> </applet */
public class choice1 extends Applet {
    public void init() {
        Choice ch =new Choice();
        ch.add("Java");
        ch.add("Python");
        ch.add("C++");
        add(ch);
    }
}