import java.applet.Applet;
import java.awt.Graphics;


public class MyAppletDemo  extends Applet {
	
	public void init()
	{
		System.out.println("Init is Started");
	}
	
	public void start()
	{
		System.out.println("Start method is started");
	}
	public  void stop() {
	
		System.out.println("Stop Method is started");

	}
	public void destory()
	{
		System.out.println("Applet destoryed and terminited");
	}
	
	public void paint(Graphics g)
	{
		g.drawString("My Applet", 500, 500);
	}
	

}
