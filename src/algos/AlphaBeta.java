package algos;

import heuristiques.Heuristique;

import java.util.ArrayList;

import plateau.Coup;
import plateau.Plateau;

public class AlphaBeta {
	
	Heuristique herp;
	
	public AlphaBeta(Heuristique h) {
		herp = h;
	}

	public int maxValue(Plateau etat, int alpha, int beta, int h){
		if(h==0){ // peut etre 1
			return herp.evalue(etat);
		}
		ArrayList<Coup> coups = etat.getCoupspossibles();
		for(int i = 0; i < coups.size(); i++){
			etat.doMvt(coups.get(i));
			alpha = Math.max(alpha, minValue(etat, alpha, beta, h-1));
			etat.doMvt(coups.get(i)); // undo
			if (alpha >= beta){
				return beta;
			}
		}
		return alpha;
	}
	
	public int minValue(Plateau etat, int alpha, int beta, int h){
		if(h==0){
			return herp.evalue(etat);
		}
		ArrayList<Coup> coups = etat.getCoupspossibles();
		for(int i = 0; i < coups.size(); i++){
			etat.doMvt(coups.get(i));
			beta = Math.min(beta, maxValue(etat, alpha, beta, h-1));
			etat.doMvt(coups.get(i)); // undo
			if (alpha >= beta){
				return alpha;
			}
		}
		return beta;
	}
}
