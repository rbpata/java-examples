import java.applet.*;
import java.awt.*;

public class mixapplet extends Applet{
	
	public void paint(Graphics g)
	{
		Dimension d = getSize();
		int x = d.width/2;
		int y = d.width/2;
		String str; 
		int r;
		str = getParameter("radius");
		r = Integer.parseInt(str);

		g.fillOval(x-r, y-r, r*2, r*2);
		g.drawLine(10,10, 200, 200);
		
		//g.drawRect(10,40,100,120);
		//g.drawString("Rectangle",40,60);
		//showStatus("Activated");
		//g.drawLine(40,60,200,240);
		//g.drawString("line",40,60);
		//g.fillOval(60,60,200,200);
		//g.drawString("ovel",100,120);
		
	}
	
}