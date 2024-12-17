import java.awt.*;
import java.applet.*;
/* <applet code = 'label1demo.class' height="300" width="500"> </applet> */
public class label1demo extends Applet{
   public void init() {
    Label l1 = new Label("Label 1");
    Label l2 = new Label("Label 2");
    add(l1);
    add(l2);
   }    
}
