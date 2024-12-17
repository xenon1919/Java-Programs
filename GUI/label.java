import java.awt.*;
import java.applet.*;
/*<applet code="label.class" height=400 width=400>
 </applet>
 */
public class label extends Applet {
    public void init() {
        Label l1 = new Label("Label 1");
        Label l2 = new Label("Label 2");
        add(l1);
        add(l2);
    }
    
}
