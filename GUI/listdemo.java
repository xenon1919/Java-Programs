import java.awt.*;
import java.applet.*;
/*<applet code='listdemo.class' height=400 width=400>
</applet>  */
public class listdemo extends Applet {
    public void init() {
    List l = new List(4);
    l.add("Java");
    l.add("Python");
    l.add("C++");
    l.add("Ruby");
    l.setSize(400,400);
    l.setVisible(true);
}
}
