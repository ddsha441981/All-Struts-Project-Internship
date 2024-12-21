package MVC;

public class ModelLink {
	
	ViewGui vg;
	Controller_Listener cl;
	public ModelLink(ViewGui vg, Controller_Listener cl) {
		super();
		this.vg = vg;
		this.cl = cl;
		vg.b1.addActionListener(cl);
		vg.b2.addActionListener(cl);
		vg.b3.addActionListener(cl);
		vg.b4.addActionListener(cl);
	}
	

}
