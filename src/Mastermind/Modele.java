package Mastermind;

import java.awt.Color;


public class Modele {
	public static Color[] Couleur= {Color.YELLOW,Color.GREEN,Color.BLUE,Color.MAGENTA,Color.RED,Color.ORANGE,Color.WHITE,Color.BLACK};
	public static int n_tentatives=10 ;
	public static int Difficulte =4;
	public static enum Etat {EN_COURS,GAGNE,PERDU};
	
	public Etat etat;
	public Rangee conbinaison ;
	public Rangee[] propositions=new Rangee[n_tentatives];
	public int tentative; 
}
