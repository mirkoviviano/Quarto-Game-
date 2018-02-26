package gj.quarto.strumenti;

public class Posizione {
	private final Cella cella;
	private final boolean orizzontale;
	
	public Posizione(Cella s, boolean d){
		cella = s;
		orizzontale = d;
	}
	
	public int getX(){
		return cella.getX();
	}
	
	public int getY(){
		return cella.getY();
	}
	
	public boolean getOrizzontale(){
		return orizzontale;
	}
	
	public final String toString(){
		return "["+cella+","+(orizzontale?"H":"V") +"]";
	}
}
