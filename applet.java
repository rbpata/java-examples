import java.util.*;
import java.awt.*;
import java.applet.*;
public class applet extends Applet{

	public void paint(Graphics g)
	{
		g.drawRect(10,30,300,350);
		g.drawString("Rectangle",10,170);
		g.drawLine(10,30,40,207);
		g.drawString("Line",10,170);
		g.fillOval(30,24,340,220);
		showStatus("Applied..");
	}
	public void paint(Graphics g)
	{
		g.drawOval(10,10,100,100);
		g.drawLine(60,30,160,130);
		g.drawLine(10,10,250,230);
		g.drawLine(30,40,130,350);
		g.drawLine(12,20,250,230);
	}
	public void paint(Graphics g)
	{
		g.drawRect(10,10,100,100);
		g.drawLine(10,20,200,120);
		g.drawLine(10,30,200,130);
		g.drawLine(10,40,200,140);
		g.drawLine(10,50,200,150);
	}
	// <applet code = "className.class" height = 300 width = 400>
	// <param Name="radius" Value = 100>
	// </applet>
	public void paint(Graphics g)
	{
		Dimension d = getSize();
		int x = d.width/2;
		int y = d.width/2;
		String str;
		int r;
		str = getParameter("radius");
		r = Integer.parInt(str);
		g.fillOval(x-r,t-r,2*r,2*r);
		
		
		Dimension d = getSize();
		int x = d.width/2;
		int y = d.width/2;
		String str;
		int r;
		str = getParameter("radius");
		r = Integer.parseInt(str);
		g.fillOval(x-r,y-r,2*r,2*r);
		
	}
}