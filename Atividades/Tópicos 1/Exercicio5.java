package rolinha.com;

import java.io.*;

public class Outro {

	public static void main(String[] args) throws IOException {

		/*
		 * Escreva um programa (linha de comandos) que lê um arquivo texto e o
		 * converte em um arquivo contendo uma sequência de bytes
		 * correspondente. O arquivo texto (de entrada) é um texto codificado
		 * como UTF-8.
		 */

		String destFile = args[0];
		String textArg = args[1];
		String readText = null;
		String lines;
		byte[] utf8Bytes;
		
		FileInputStream fis = new FileInputStream(destFile);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		BufferedOutputStream bos = new BufferedOutputStream(arg0)

		// Read all the text in the file
		while ((lines = br.readLine()) != null) {
			readText += lines;
		}

		utf8Bytes = readText.getBytes("UTF-8");
		// Converting back = new String(utf8bytes, "UTF-8");
		
		
		
		// Concat the printed text
		try (PrintStream ps = new PrintStream(destFile, "UTF-8")) {
			ps.println(textArg + readText);

			// Flush the print stream
			ps.flush();

			System.out.println("Text has  been  written to " + (new File(destFile).getAbsolutePath()));
		} catch (FileNotFoundException err) {
			err.printStackTrace();
		}

	}
}
