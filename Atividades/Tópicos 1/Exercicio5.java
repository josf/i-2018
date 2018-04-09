package integracao2018;

import java.io.*;

public class Exercicio5 {

	public static void main(String[] args) throws IOException {

		/*
		 * Escreva um programa (linha de comandos) que lê um arquivo texto e o converte
		 * em um arquivo contendo uma sequência de bytes correspondente. O arquivo texto
		 * (de entrada) é um texto codificado como UTF-8.
		 */

		String destFile = "C:\\Users\\Pichau\\eclipse-workspace\\integracao2018\\inputfile.txt";
		String textArg = "C:\\Users\\Pichau\\eclipse-workspace\\integracao2018\\outputfile.txt";
		String readText = null;
		String lines = null;
		byte[] utf8Bytes;

		FileInputStream fis = new FileInputStream(destFile);
		FileOutputStream fos = new FileOutputStream(textArg);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		System.out.println("Text  gotten  from " + (new File(textArg).getAbsolutePath()));

		// Read all the text in the file
		while ((lines = br.readLine()) != null) {
			readText += lines;
		}

		utf8Bytes = readText.getBytes();
		System.out.println(utf8Bytes);
		// Converting back = new String(utf8bytes, "UTF-8");

		bos.write(utf8Bytes);
		bos.flush();
		bos.close();

		System.out.println("Text  has  been  written to " + (new File(textArg).getAbsolutePath()));

	}
}
