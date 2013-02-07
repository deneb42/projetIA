package plateau;

import java.util.ArrayList;

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
	/* Masque permettant de représenter les déplacements possible sous forme d'un octet on valide ou non le déplacement, la case d'ou l'on peut partir dans toutes les directions vaut donc 255.
	*  0 -> aucun déplacement
	*  1 -> giagonale haut à gauche
	*  2 -> déplacement vers le haut
	*  4 -> diagonal haut droite
	*  8 -> droite
	*  16 -> diagonal bas droite
	*  32 -> bas
	*  64 -> diagonal bas gauche
	*  128 -> gauche
	*/
	public char masqueCoups[][] = {	{0, 0, 24, 0, 168, 0, 192, 0, 0},
									{0, 0, 0, 25, 170, 196, 0, 0, 0},
									{48, 0, 56, 168, 255, 168, 224, 0, 96},
									{0, 49, 42, 255, 170, 255, 162, 0},
									{42, 170, 255, 170, 255, 170, 255, 170, 162},
									{0, 70, 42, 255, 170, 255, 162, 19, 0},
									{8, 0, 14, 138, 255, 138, 131, 0, 3},
									{0, 0, 0, 76, 170, 145, 0, 0, 0},
									{0, 0, 12, 0, 138, 129, 0, 0}
								   };

	
	
	public Plateau() {
		System.out.println(toString());
	}
	
	void coupsAutorisés(){
		
	}
	public void doMvt(Coup c) {
		int dx=0, dy=0;
		
		grille[c.dy][c.dx] = grille[c.oy][c.ox]; // dest = orig

		if(c.dx-c.ox>1)
			dx=1;
		else if(c.dx-c.ox<1)
			dx=-1;
		if(c.dy-c.oy>1)
			dy=1;
		else if(c.dy-c.oy<1)
			dy=-1;
		if(dx!=0 || dy!=0) // si il y a eu une prise
			if(grille[c.oy+dy][c.ox+dx]!=o) {// utile pour els triangles
				if(grille[c.oy+dy][c.ox+dx]!=v)
					grille[c.oy+dy][c.ox+dx] = v; // si la case est pleine, on jour le coup, on vide la case
				else
					grille[c.oy+dy][c.ox+dx] = grille[c.oy][c.ox]==n?b:n; // sinon on déjoue le coup, on place un pion de la couleur adverse
			}
		
		grille[c.oy][c.ox] = v; // orig = vide
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
		str.append("\n");
		
		return str.toString();
	}
	
	public void set(int x, int y, int val) { grille[y-1][x-1] = val; }

	public ArrayList<Coup> getCoupspossibles() {
		// TODO Auto-generated method stub
		return null;
	}
}
