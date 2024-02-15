package Mastermind;

import java.awt.Color;
import java.util.ArrayList;

public class Modele {
	ArrayList<Color> couleur=new ArrayList<>();
	int n_tentatives ;
	int difficulte;
	enum etat {EN_COURS,GAGNE,PERDU};
}
