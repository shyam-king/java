import java.awt.*;
import java.applet.*;

/* 
<applet code="JApplet" width=300 height=300>
</applet>
	*/

public class JApplet extends Applet{
	public void paint(Graphics g) {
		g.drawString("Java is cool", 100, 100);
	}
}
