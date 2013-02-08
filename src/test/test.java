package test;

import plateau.Coup;
import plateau.Plateau;

public class test {
	
	/*public static void main(String args[]) {

		Joueur monJoueur = new Joueur();
		monJoueur.initJoueur(2);
		
		System.out.println(monJoueur.binoName());
		
		monJoueur.declareLeVainqueur(2);
		monJoueur.declareLeVainqueur(1);
		
		//Plateau p = new Plateau();
	}*/
	
	/*public static void main(String args[]) {
		Plateau p = new Plateau();
		
		if(((p.masqueCoups[0][4] & 0x80) != 0 ))
		{
			System.out.println(p.masqueCoups[0][4] + " : gauche autorisée");
		}
		else System.out.println("fail1");
		
		if(((p.masqueCoups[0][2] & 0x80) == 0 ))
		{
			System.out.println(p.masqueCoups[0][2] + " : gauche refusée");
		}
		else System.out.println("fail2");
			
	}*/
	public static void main(String args[]) {
		Plateau p = new Plateau();
		
		System.out.println(p.getCoupPossible(1));
		p.doMvt(new Coup(3, 3, 4, 4));
		System.out.println(p);
		System.out.println(p.getCoupPossible(1));
			
	}
	
}
