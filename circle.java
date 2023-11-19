import java.applet.*;
import java.awt.*;

/*
<applet code=circle width=400 height=400>
<param Name="radius" Value="100">
</applet>
*/
public class circle extends Applet
{
	public void paint(Graphics g)
	{
		Dimension d=getSize();
		int xc=d.width/2;
		int yc=d.width/2;
		String str;
		int r;
		str=getParameter("radius");
		r=Integer.parseInt(str);
		g.setColor(Color.BLUE);
		g.fillOval(xc-r,yc-r,2*r,2*r);
	}
}

