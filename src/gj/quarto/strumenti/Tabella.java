package gj.quarto.strumenti;

import java.io.*;

public class Tabella {
	
	public Tabella(Configurazione c) throws IOException, FileNotFoundException{
		String[][] matrix = new String[5][5];
		int x=0, y=0;
		try{
		BufferedReader in = new BufferedReader(new FileReader("scacchiera.txt"));
			String line;
			while ((line = in.readLine()) != null){
				String[] values = line.split(",");
	        	for (String str : values){
	        		matrix[x][y] = str;
	        		System.out.println(matrix[x][y]);
	        	}
	        	y=y+1;
			}
			x=x+1;
        	in.close();
        }catch( IOException ioException ) {}
	}
}