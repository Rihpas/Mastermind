package Mastermind;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class Vue extends Frame{
	Modele modl;
	public Vue() {
		this.modl = new Modele();
		
		this.setLayout(new BorderLayout());

		Panel VueClavier = new Panel();
		Canvas VueProposition = new Canvas();
		
		for(int i=0; i<modl.Couleur.length; i++) {
			Button b = new Button();
			b.setBackground(this.modl.Couleur[i]);
			b.setPreferredSize(new Dimension(40,40));
			VueClavier.add(b);
		}
		
		VueProposition.setBackground(Color.GRAY);
		
		
		this.add(VueClavier, BorderLayout.SOUTH);
		this.add(VueProposition, BorderLayout.NORTH);
		
		this.setSize(400, 750);
		this.setTitle("Mastermind");
		
		this.setVisible(true);
	}
	
	public void paint(Graphics g) {
		for(int i=0; i<4; i++) {
			for(int j=0; j<10; j++) {
				g.drawOval(5+i*90, 40+j*60, 50, 50);
			}
		}
		
		for(int x=0; x<10; x++) {
			for(int i=0; i<2; i++) {
				for(int j=0; j<2; j++) {
					g.drawOval(350+i*20, 45+j*20+x*60, 15, 15);
				}
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new Vue();
	}
	
}
