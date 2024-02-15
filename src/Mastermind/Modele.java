package Mastermind;

import java.awt.Color;
import java.util.ArrayList;

public class Modele {
	public ArrayList<Color> couleur=new ArrayList<>();
	public int n_tentatives ;
	public int difficulte;
	public enum etat {EN_COURS,GAGNE,PERDU};
}
