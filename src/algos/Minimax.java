package algos;

import plateau.Plateau;

public class Minimax {

	public int maxMin(Plateau enCours){
		int meilleur;
		
		if (enCours.estFeuille()){ //Fonction à coder
			return enCours.valeur("AMIS"); // fonction à coder doit renvoyer la valeur du plateau
		}
		meilleur = -599999999; //valeur aléatoire très grand pour remplacer -Infini
		for(int i = 0; i enCours.getSesfils().Size(); i++){//sesFils idéalement contenu dans une liste ici
			meilleur = Math.max(meilleur, minMax(enCours.getSesfils(i)));
		}
		return meilleur;
	}

	public int minMax(Plateau enCours){
		int pire;
		
		if (enCours.estFeuille()){ //Fonction à coder
			return enCours.valeur("ENNEMI"); // fonction à coder doit renvoyer la valeur du plateau
		}
		pire = 599999999; //valeur aléatoire très grande pour remplacer +Infini
		for(int i = 0; i enCours.getSesfils().Size(); i++){//sesFils idéalement contenu dans une liste ici
			pire = Math.min(pire, minMax(enCours.getSesfils(i)));
		}
		return pire;
		
	}
}