package joueur;

import plateau.Plateau;



public class Joueur implements IJoueur {

	int ma_couleur;
	Plateau mon_plateau;
	@Override
	public void initJoueur(int mycolour) {
		mon_plateau = new Plateau();
		ma_couleur = mycolour;
		
	}

	@Override
	public int getNumJoueur() {
		return ma_couleur;
	}

	@Override
	public String choixMouvement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void declareLeVainqueur(int colour) {
		if (colour==ma_couleur)
			System.out.println("BRAVO, vous avez gagner !");
		else System.out.println("Dommage, vous avez perdu, try again !");

	}

	@Override
	public void mouvementEnnemi(int startCol, int startRow, int finishCol,
			int finishRow) {
		mon_plateau.mouvementPion(startCol, startRow, finishCol, finishRow);

	}

	@Override
	public String binoName() {
		return "Jean BADIÉ & Benjamin BLOIS";
	}

}
