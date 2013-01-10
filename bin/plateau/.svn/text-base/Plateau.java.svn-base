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
		System.out.println(toString());
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("┌─────────┐\n");
		for(int i=0;i<grille.length;i++) {
			str.append("│");
			for(int j=0;j<grille[i].length;j++)
				switch(grille[i][j]) {
				case -1: str.append("+"); break;
				case 0: str.append("."); break;
				case 1: str.append("○"); break;
				case 2: str.append("●"); break;
				}
			str.append("│\n");
		}
		str.append("└─────────┘");
		return str.toString();
	}
	
	public static void main(String args[]) {
		Plateau p = new Plateau();
	}
}
