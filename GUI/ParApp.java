import java.applet.Applet;
import java.awt.*;
/*  <applet code ="ParApp" width = "300" height = "400" >
<param name = "site" value = "www.mysite.com"/> 
</applet>*/
public class ParApp extends Applet{
	private String defaultMessage = "Hello";
	public void paint(Graphics g) {
		String s1 = getParameter("site");
		if(s1==null)
			s1=defaultMessage;
		g.drawString(s1,50,25);
	}
} 