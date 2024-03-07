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
	Button btn;
	static int empl = 0;
	static int emplj = 0;
	
	public Vue() {
		this.modl = new Modele();
		
		this.setLayout(new BorderLayout());

		Panel VueClavier = new Panel();
		Canvas VueProposition = new Canvas();
		
		for(int i=0; i<modl.Couleur.length; i++) {
			btn = new Button();
			btn.setBackground(this.modl.Couleur[i]);
			btn.setPreferredSize(new Dimension(40,40));
			VueClavier.add(btn);
		}
		
		VueProposition.setBackground(Color.GRAY);
		
		
		this.add(VueClavier, BorderLayout.SOUTH);
		this.add(VueProposition, BorderLayout.NORTH);
		
		
		this.setSize(400, 750);
		this.setTitle("Mastermind");
		
		this.setVisible(true);
	}
	
	public void coloration(Graphics g, int i) {
		g.setColor(this.modl.Couleur[i]);
		g.fillOval(5+empl*90, 40+emplj*60, 50, 50);
		empl++;
		if(empl==4) {
			emplj++;
		}
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
