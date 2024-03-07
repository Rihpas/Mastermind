package Mastermind;

import java.awt.Color;


public class Rangee {
	public Color[] jetons;
	public int indiceJeton=0;
	public int nbNoir; //bonne couleur bien placer 
	public int nbBlanc; // bonne couleur mal placer
	public Integer[] resultat= {nbNoir,nbBlanc} ;
	
	public Rangee () {
		jetons=new Color[Modele.Difficulte];
	}
	
	
}
