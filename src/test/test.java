package test;

import joueur.Joueur;
import plateau.Plateau;

public class test {
	
	public static void main(String args[]) {

		Joueur monJoueur = new Joueur();
		monJoueur.initJoueur(2);
		
		System.out.println(monJoueur.binoName());
		
		monJoueur.declareLeVainqueur(2);
		monJoueur.declareLeVainqueur(1);
		
		//Plateau p = new Plateau();
	}
}
