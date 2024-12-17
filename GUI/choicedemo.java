import java.awt.*;
import java.applet.*;
/*<applet code='choicedemo.class' height=400 width=400>
 </applet>
 */
public class choicedemo extends Applet {
    public void init() {
        Choice ch = new Choice();
        ch.add("PHP");
        ch.add("Java");
        ch.add("R");
        ch.add("SQL");
    }
}
