package gj.quarto.strumenti;

import java.io.*;
import java.util.*;

import gj.quarto.eccezioni.EccezioneConfigurazione;

public class Main{
	private static Scanner nome;

	public static void main(String[] args) throws FileNotFoundException, EccezioneConfigurazione, IOException{
		final String ANSI_RED   = "\u001B[31m";
		final String ANSI_BLACK = "\u001B[30m";
		System.out.println(ANSI_RED + "BENVENUTO!\n"+ ANSI_BLACK + "Questo è il gioco \"Quarto\", per iniziare inserisci le tue iniziali: ");
		nome = new Scanner(System.in);
		String nomeGiocatore = nome.nextLine();
		
		//AGGIUNTA NOME IN MAIUSCOLO PER IL GIOCATORE IN ENTRATA
		
		System.out.println(ANSI_BLACK + "Perfetto "+ nomeGiocatore + ", attendi che carichi il gioco...\nLa configurazione del gioco è stata "
				+ "correttamente caricata.\n"+ANSI_RED+"DIVERTITI!!!"+ANSI_BLACK);
		System.out.println("---------------------------------------");
		Configurazione c = new Configurazione(4,4);
		new Tabella(c);
		new Pedina();
	}
}