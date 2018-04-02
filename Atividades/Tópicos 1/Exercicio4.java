package integracao2018;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Exercicio4 {

	public static void main(String[] args) throws IOException {

		/*
		 * Escreva um programa (linha de comandos) cujo primeiro argumento o
		 * nome de um arquivo e cujo segundo argumento uma sequncia de
		 * caracteres. Quando executado, a sequencia de caracteres fornecida
		 * como o segundo argumento persistida no arquivo cujo nome e fornecido
		 * como primeiro argumento. O texto deve ser persistido no formato
		 * UTF-8.
		 */

		String destFile = args[0];
		String textArg = args[1];
		String readText = null;
		String lines;
		FileInputStream fis = new FileInputStream(destFile);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		// Read all the text in the file
		while ((lines = br.readLine()) != null) {
			readText += lines;
		}

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
