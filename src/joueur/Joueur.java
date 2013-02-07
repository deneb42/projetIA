package joueur;

import plateau.*;

public class Joueur implements IJoueur{
	public static final int VIDE=0, OUT=-1;
	private static final String binoName = "Jean Badié - Benjamin Blois", 
								win = "Yeah on est les meilleurs !", 
								loose = "Ouaich c'est pas possib t'as triché quoi !";
	private int color;
	public Plateau p;
	
	/*public static void main(String args[]) {
		Joueur jvg = new Joueur();
		jvg.initJoueur(BLANC);
		jvg.mouvementEnnemi(4, 2, 6, 4);
		System.out.println(jvg.p.toString());
	}*/
	
	@Override
	public void initJoueur(int mycolour) {
		color = mycolour;
		p = new Plateau();
	}

	@Override
	public String choixMouvement() {
		String msg;
		Coup c = new Coup();
		
		msg = "" + c.oy + " " + c.ox + " " + c.dy + " " + c.dx + '\0';
		//System.out.println("Voici mon mouvement : " + msg);
		return msg;
	}

	@Override
	public void mouvementEnnemi(int startCol, int startRow, int finishCol, int finishRow) {
		p.doMvt(new Coup(startCol, startRow, finishCol, finishRow));
	}

	@Override
	public void declareLeVainqueur(int colour) { System.out.println(color==colour?win:loose); }
	@Override
	public String binoName() { return binoName; }
	@Override
	public int getNumJoueur() { return color; }
}
