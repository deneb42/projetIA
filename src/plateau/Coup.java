package plateau;

public class Coup {
	public int ox, oy, dx, dy;
	
	
	
	public void set(int pox, int poy, int pdx, int pdy) {
		ox = pox; oy=poy; dx=pdx; dy=pdy;
	}
	
	public Coup() {
		set(0, 0, 0, 0);
	}
	
	public Coup(int pox, int poy, int pdx, int pdy) {
		ox = pox; oy=poy; dx=pdx; dy=pdy;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("<"+ox+" "+oy+"> -> <"+dx+" "+dy+"> ");
		return str.toString();
	}
}
