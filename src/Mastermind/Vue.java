package Mastermind;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Panel;

public class Vue extends Frame{
	Modele modl;
	public Vue() {
		this.modl = new Modele();
		
		this.setLayout(new BorderLayout());

		Panel VueClavier = new Panel();
		Canvas VueProposition = new Canvas();
		
		for(int i=0; i<modl.couleur.length; i++) {
			Button b = new Button();
			b.setBackground(this.modl.couleur[i]);
			VueClavier.add(b);
		}
		
		this.add(VueClavier, BorderLayout.SOUTH);
		this.add(VueProposition, BorderLayout.NORTH);
		
		this.setSize(500, 500);
		this.setTitle("Mastermind");
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Vue v = new Vue();
	}
	
}
