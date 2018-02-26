package gj.quarto.strumenti;

import java.io.*;

import gj.quarto.eccezioni.EccezioneConfigurazione;

public class Configurazione {
	private int larghezza = 4;
	private int altezza = 4;
	
	public Configurazione(int l, int a) throws EccezioneConfigurazione, FileNotFoundException, IOException, NumberFormatException{
		larghezza = l;
		altezza = a;
	}
	
	public int getAltezza(){
		return altezza;
		
	}
	
	public int getLarchezza(){
		return larghezza;
	}
	
}
