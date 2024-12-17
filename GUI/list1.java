import java.awt.*;
import java.applet.*;
/* <applet code = "list1.class" height="200" width=300> </applet */
public class list1 extends Applet {
    public void init() {
        List l = new List(4);
        l.add("C");
        l.add("C++");
        l.add("Java");
        l.add("PHP");
        add(l);
    }
}
