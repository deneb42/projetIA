package algos;

import plateau.Plateau;

public class Negamax {

	public int negaMax(Plateau enCours){
		int meilleur;
		
		if (enCours.estFeuille()){ //Fonction à coder
			return enCours.valeur(); // fonction à coder doit renvoyer la valeur du plateau
		}
		meilleur = -599999999; //valeur aléatoire très grand pour remplacer -Infini
		for(int i = 0; i enCours.getSesfils().Size(); i++){//sesFils idéalement contenu dans une liste ici
			int val = negaMax(enCours.getSesfils(i));
			if(val > meilleur){
				meilleur = val;
			}
		}
		return meilleur;
	}

	public int negAlphaBeta(Plateau etat, int alpha, int beta){
		if(etat.estFeuille()){
			return etat.value();
		}
		for(int i = 0; i etat.getSesfils().Size(); i++){
			int val = -negAlphaBeta(etat.getSesFils(i), alpha, beta);
			if (val > alpha){
				alpha = val;
				if(alpha > beta){
					return alpha;
				}
			}
		}
		return alpha;
	}
}
