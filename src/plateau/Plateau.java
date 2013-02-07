package plateau;

import joueur.Joueur;

public class Plateau {
	private final int b=Joueur.BLANC, n=Joueur.NOIR, v=Joueur.VIDE, o=Joueur.OUT;
	private Integer grille[][] = {{o, o, o, b, b, b, o, o, o},
								  {o, o, o, b, b, b, o, o, o},
								  {o, o, b, b, b, b, b, o, o},
								  {v, v, b, b, b, b, b, v, v},
								  {v, v, v, v, v, v, v, v, v},
								  {v, v, n, n, n, n, n, v, v},
								  {o, o, n, n, n, n, n, o, o},
								  {o, o, o, n, n, n, o, o, o},
								  {o, o, o, n, n, n, o, o, o}
								 };
	
	public Plateau() {
		System.out.println(toString());
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("┌─────────┐\n");
		for(int i=0;i<grille.length;i++) {
			str.append("│");
			for(int j=0;j<grille[i].length;j++)
				switch(grille[i][j]) {
				case o: str.append("+"); break;
				case v: str.append("."); break;
				case b: str.append("○"); break;
				case n: str.append("●"); break;
				}
			str.append("│\n");
		}
		str.append("└─────────┘");
		return str.toString();
	}
	
	public void set(int x, int y, int val) { grille[y-1][x-1] = val; }
}
