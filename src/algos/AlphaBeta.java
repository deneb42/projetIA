package algos;

import plateau.Plateau;

public class AlphaBeta {

	public int maxValue(Plateau etat, int alpha, int beta){
		if(etat.estFeuille()){
			return etat.value();
		}
		for(int i = 0; i etat.getSesfils().Size(); i++){
			alpha = Math.max(alpha, minValue(etat.getSesfils(i), alpha, beta));
			if (alpha >= beta){
				return beta;
			}
		}
		return alpha;
	}
	
	public int minValue(Plateau etat, int alpha, int beta){
		if(etat.estFeuille()){
			return etat.value();
		}
		for(int i = 0; i etat.getSesfils().Size(); i++){
			beta = Math.min(beta, maxValue(etat.getSesfils(i), alpha, beta));
			if (alpha >= beta){
				return alpha;
			}
		}
		return beta;
	}
}
