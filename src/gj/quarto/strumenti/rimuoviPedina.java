package gj.quarto.strumenti;
import java.io.*;

public class rimuoviPedina {
 
	public void eliminaPedina(String file, String lineToRemove) {
		try {
			File inFile = new File(file);     
			if (!inFile.isFile()) {
				System.out.println("Parameter is not an existing file");
				return;
			}
		
		File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
		BufferedReader br = new BufferedReader(new FileReader(file));
		PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
		
		String line = null;
		while ((line = br.readLine()) != null) {
			if (!line.trim().equals(lineToRemove)) {
				pw.println(line);
				pw.flush();
			}
		}
		pw.close();
		br.close();
		
		if (!inFile.delete()) {
			System.out.println("Could not delete file");
			return;
		} 
		
		if (!tempFile.renameTo(inFile))
			System.out.println("Could not rename file");
		}
		
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}


 /*public static void main(String[] args) {
   FileUtil util = new FileUtil();
   util.removeLineFromFile("test.txt", "bbbbb");
 }*/
}
