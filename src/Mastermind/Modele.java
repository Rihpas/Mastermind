package Mastermind;

import java.awt.Color;


public class Modele {
	public Color[] couleur= {Color.YELLOW,Color.GREEN,Color.BLUE,Color.MAGENTA,Color.RED,Color.ORANGE,Color.WHITE,Color.BLACK};
	public static int n_tentatives=10 ;
	public static int difficulte =4;
	public enum etat {EN_COURS,GAGNE,PERDU};
}
