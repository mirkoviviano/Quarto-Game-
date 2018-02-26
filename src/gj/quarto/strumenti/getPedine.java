package gj.quarto.strumenti;

import java.io.*;
public class getPedine {
	

	private BufferedReader reader;

	public getPedine(String text) throws FileNotFoundException, IOException{
		reader = new BufferedReader(new FileReader("pedine.txt"));
		//CONTO QUANTI PEDINE SONO PRESENTI NEL FILE
		int pedine = 0;
		String s;
		System.out.println(text);
		while(true) {
			s = reader.readLine();
		    if(s==null)
		      break;
		    pedine++;
		    
		 System.out.println(pedine + ") " + s);
		 
		}
		reader.close();
	}
}
