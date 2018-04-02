package integracao2018;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercicio4 {

	public static void main(String[] args) throws IOException {

		/*
		 * Escreva um programa (linha de comandos) cujo primeiro argumento é o nome de
		 * um arquivo e cujo segundo argumento é uma sequência de caracteres. Quando
		 * executado, a sequência de caracteres fornecida como o segundo argumento é
		 * persistida no arquivo cujo nome é fornecido como primeiro argumento. O texto
		 * deve ser persistido no formato UTF-8.
		 */

		// Get the input file and data
		File file = new File(args[0]);
		FileInputStream fis = new FileInputStream(file);
		StringBuffer sb = new StringBuffer();

		try {
			int ch;
			while ((ch = fis.read()) != -1) {
				sb.append((char) ch);
			}

			fis.close();
			System.out.println(sb);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
