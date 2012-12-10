package plateau;

public class Plateau {
	private Integer grille[][] = {{-1, -1, -1, 1, 1, 1, -1, -1, -1},
								  {-1, -1, -1, 1, 1, 1, -1, -1, -1},
								  {-1, -1,  1, 1, 1, 1,  1, -1, -1},
								  { 0,  0,  1, 1, 1, 1,  1,  0,  0},
								  { 0,  0,  0, 0, 0, 0,  0,  0,  0},
								  { 0,  0,  2, 2, 2, 2,  2,  0,  0},
								  {-1, -1,  2, 2, 2, 2,  2, -1, -1},
								  {-1, -1, -1, 2, 2, 2, -1, -1, -1},
								  {-1, -1, -1, 2, 2, 2, -1, -1, -1}
								 };
	
	public Plateau() {
		for(int i=0;i<grille.length;i++) {
			for(int j=0;j<grille[i].length;j++)
				System.out.println(grille[i][j]);
			System.out.println("");
		}
	}
}
