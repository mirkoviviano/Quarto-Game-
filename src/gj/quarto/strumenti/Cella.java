package gj.quarto.strumenti;


public class Cella {
	private final int x;
	private final int y;
	
	public Cella(int inX, int inY){
		x = inX;
		y = inY;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public final String toString(){
		return "("+y+","+x+")";
	}
}
