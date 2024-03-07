package Mastermind;

import java.awt.Color;
import java.util.Random;


public class Modele {
	public static Color[] Couleur= {Color.YELLOW,Color.GREEN,Color.BLUE,Color.MAGENTA,Color.RED,Color.ORANGE,Color.WHITE,Color.BLACK};
	public static int n_tentatives=10 ;
	public static int Difficulte =4;
	public static enum Etat {EN_COURS,GAGNE,PERDU};
	
	public Etat etat;
	public Rangee conbinaison ;
	public Rangee[] propositions=new Rangee[n_tentatives];
	public int tentative;
	
	public Random gnr = new Random();
	
	public void choix_combinaison() {
		for (int i=0 ;i<Difficulte-1;i++) {
			Color x= Couleur[gnr.nextInt(0,this.Difficulte-1)];
			conbinaison.jetons[i]=x;
		}
	}
	
	
	
	public static void main(String[] args) {
		Rangee rang=new Rangee();
		Modele modl=new Modele();
		modl.choix_combinaison();
		
		System.out.println(modl.conbinaison);
	}
	
	
	
	
	
}
