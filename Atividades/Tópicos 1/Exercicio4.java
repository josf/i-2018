package integracao2018;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercicio4 {

	public static void main(String[] args) throws IOException {

		/*
		 * Escreva um programa (linha de comandos) cujo primeiro argumento � o nome de
		 * um arquivo e cujo segundo argumento � uma sequ�ncia de caracteres. Quando
		 * executado, a sequ�ncia de caracteres fornecida como o segundo argumento �
		 * persistida no arquivo cujo nome � fornecido como primeiro argumento. O texto
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
