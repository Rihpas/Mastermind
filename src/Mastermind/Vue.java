package Mastermind;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Panel;

public class Vue{
	public Vue() {
		Frame f = new Frame();
		Panel VueClavier = new Panel();
		Canvas VueProposition = new Canvas();
		
		f.add(VueClavier);
		f.add(VueProposition);
		
		
		f.setSize(500, 500);
		f.setTitle("Mastermind");
		f.setLayout(new BorderLayout());
		f.setVisible(true);
	}
	
	
}
