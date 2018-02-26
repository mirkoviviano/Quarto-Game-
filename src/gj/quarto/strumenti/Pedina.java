package gj.quarto.strumenti;

import java.io.*;
import java.util.*;

public class Pedina {
	private BufferedReader br;
	private Scanner insert;

	public Pedina() throws FileNotFoundException, IOException{
		final String ANSI_RED   = "\u001B[31m";
		final String ANSI_BLACK = "\u001B[30m";
		
		new getPedine("Hai a disposizione ");
		br = new BufferedReader(new FileReader("pedine.txt"));
		String pedina = br.readLine();
		System.out.println("Devi posizionare la pedina "+ ANSI_RED + pedina + ANSI_BLACK +  "\nInserisci la posizione (esempio: 1,1): ");
		insert = new Scanner(System.in);
		String posizionePedina = insert.nextLine();
		System.out.println(ANSI_RED + "La pedina " + pedina + " è stata inserita alla posizione " + posizionePedina + "." + ANSI_BLACK);
		
		
		rimuoviPedina util = new rimuoviPedina();
		util.eliminaPedina("pedine.txt", pedina);
		br.close();
	}
}
