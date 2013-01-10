package joueur;

/**
 * Voici l'interface abstraite qu'il suffit d'implanter pour jouer.
 * Ensuite, vous devez utiliser ClientJeu en lui donnant le nom de votre classe
 * pour qu'il la charge et se connecte au serveur.
 * 
 * Vous pouvez utiliser le RandomPlayer pour tester.
 * 
 * @author L. Simon (Univ. Paris-Sud)- 2006-2013
 *
 */

public interface IJoueur {
	
	static final int TAILLE = 9; // Taille du plateau. Pas la peine de la changer !
	static final int BLANC = 1;  // Mais pas lors de la conversation avec l'arbitre
	static final int NOIR = 2;   // Vous pouvez changer cela en interne si vous le souhaitez
	
	/**
	 * L'arbitre vient de lancer votre joueur. Il lui informe par cette mthode
	 * que vous devez jouer dans cette couleur. Vous pouvez utiliser cette mthode
	 * abstraite, ou la mthode constructeur de votre classe, pour initialiser
	 * vos structures.
	 * @param mycolour La couleur dans laquelle vous allez jouer (1=BLANC, 2=NOIR)
	 */
	public void initJoueur(int mycolour);

	public int getNumJoueur(); // Doit retourner l'argument passÂ par la fonction ci-dessus (constantes BLANC ou NOIR)

	
	/**
	 * C'est ici que vous devez faire appel  votre IA pour trouver le meilleur coup  jouer
	 * sur le plateau courant.
	 * 
	 * @return une chaine dcrivant le mouvement. Cette chaine doit tre dcrite exactement comme sur l'exemple :
	 * String msg = "" + lignePiece + " " + colonnePiece + " " + ligneDestination + " " + colonneDestination + '\0';
	 * System.out.println("Voici mon mouvement : " + msg);
	 */
	public String choixMouvement();	

	
	/**
	 * Mthode appele par l'arbitre pour dsigner le vainqueur. Vous pouvez en profiter pour
	 * imprimer une bannire de joie... Si vous gagnez... 
	 * 
	 * @param colour La couleur du gagnant (BLANC=1, NOIR=2).
	 */
	public void declareLeVainqueur(int colour);
	
	
	/**
	 * On suppose que l'arbitre a vrifi que le mouvement ennemi tait bien lgal. Il vous informe
	 * du mouvement ennemi. A vous de rpercuter ce mouvement dans vos structures. Comme
	 * par exemple liminer les pions que ennemi vient de vous prendre par ce mouvement.
	 * Il n'est pas ncessaire de rflchir dj  votre prochain coup  jouer : pour cela
	 * l'arbitre appelera ensuite choixMouvement().
	 * 
	 * @param startCol Colonne de dpart du mouvement (entre 1 et TAILLE), 
	 *                 commenant  gauche=1  droite=(TAILLE)
	 * @param startRow Ligne de dpart du mouvement (entre 1 et TAILLE), 
	 *                 commenant en haut=1  bas=(TAILLE)
	 * @param finishCol Colonne d'arrive du mouvement (entre 1 et TAILLE),
	 * 	                commenant  gauche=1  droite=(TAILLE)
	 * @param finishRow Ligne d'arrive du mouvement (entre 1 et TAILLE),
	 *                  commenant en haut=1  bas=(TAILLE)
	 */
	public void mouvementEnnemi(int startCol, int startRow, int finishCol, int finishRow);

	/**
	 * @return Le nom de votre binome
	 */
	public String binoName();

	
}


