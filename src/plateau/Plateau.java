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
			if(grille[c.oy+dy][c.ox+dx]!=v)
				grille[c.oy+dy][c.ox+dx] = v; // si la case est pleine, on jour le coup, on vide la case
			else
				grille[c.oy+dy][c.ox+dx] = grille[c.oy][c.ox]==n?b:n; // sinon on déjoue le coup, on place un pion de la couleur adverse
		
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
		return str.toString();
	}
	
	public void set(int x, int y, int val) { grille[y-1][x-1] = val; }
}
