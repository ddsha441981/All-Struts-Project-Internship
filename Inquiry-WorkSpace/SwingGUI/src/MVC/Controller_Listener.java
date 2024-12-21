package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller_Listener implements ActionListener {
	ViewGui vg;

	public Controller_Listener(ViewGui vg) {
		super();
		this.vg = vg;
	}

	@Override
	public void actionPerformed(ActionEvent l1) {
		
		float num1 = 0 , num2 , res = 0;
		
		if(l1.getSource()==vg.b1)
		{
			num1 = Float.parseFloat(vg.txt1.getText());
			num2 = Float.parseFloat(vg.txt2.getText());
			res = num1 + num2;
			
			vg.res.setText(Float.toString(res));
		}
		if(l1.getSource()==vg.b2)
		{
			num1 = Float.parseFloat(vg.txt1.getText());
			num2 = Float.parseFloat(vg.txt2.getText());
			res = num1 - num2;
			
			vg.res.setText(Float.toString(res));
		}
		if(l1.getSource()==vg.b3)
		{
			num1 = Float.parseFloat(vg.txt1.getText());
			num2 = Float.parseFloat(vg.txt2.getText());
			res = num1 * num2;
			
			vg.res.setText(Float.toString(res));
		}
		if(l1.getSource()==vg.b4)
		{
			num1 = Float.parseFloat(vg.txt1.getText());
			num2 = Float.parseFloat(vg.txt2.getText());
			res = num1 / num2;
			
			vg.res.setText(Float.toString(res));
		}
	}
	

}
