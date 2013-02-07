package joueur;

import plateau.Plateau;

public class JVaisGagner implements IJoueur{
	public static final int VIDE=0, OUT=-1;
	private static final String binoName = "Jean Badié - Benjamin Blois", 
								win = "Yeah on est les meilleurs !", 
								loose = "Ouaich c'est pas possib t'as triché quoi !";
	private int color, enemyColor;
	public Plateau p;
	
	public static void main(String args[]) {
		JVaisGagner jvg = new JVaisGagner();
		jvg.initJoueur(BLANC);
		jvg.mouvementEnnemi(4, 2, 6, 4);
		System.out.println(jvg.p.toString());
	}
	
	@Override
	public void initJoueur(int mycolour) {
		color = mycolour;
		if(color==NOIR)
			enemyColor=BLANC;
		else
			enemyColor=NOIR;
		p = new Plateau();
	}

	@Override
	public String choixMouvement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void mouvementEnnemi(int startCol, int startRow, int finishCol, int finishRow) {
		int dx=0, dy=0;
		
		p.set(startCol, startRow, 0);
		p.set(finishCol, finishRow, enemyColor); // ATTENTION, IL FAUT EGALEMENT GERER LA PRISE.
		if(finishCol-startCol>1)
			dx=1;
		else if(finishCol-startCol<1)
			dx=-1;
		if(finishRow-startRow>1)
			dy=1;
		else if(finishRow-startRow<1)
			dy=-1;
		if(dx!=0 || dy!=0)
			p.set(startCol+dx, startRow+dy, 0);
	}

	@Override
	public void declareLeVainqueur(int colour) {
			System.out.println(color==colour?win:loose);
	}
	@Override
	public String binoName() { return binoName; }
	@Override
	public int getNumJoueur() { return color; }
}
