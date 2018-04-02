package integracao2018;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercicio2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		/*
		 * Escreva um programa (linha de comandos) que recebe como argumento o nome de
		 * um arquivo JPEG e que verifica se esta restrição é satisfeita ou não.
		 */

		// Get the input file and data
		FileInputStream fis = new FileInputStream(args[0]);
		DataInputStream dis = new DataInputStream(fis);

		// FF D8 - FF D9
		int numberOfBytes = 4;
		int numberSkiped = dis.available() - 4;

		// Print the first two bytes, then skip to the last two
		for (int i = 0; i < numberOfBytes; i++) {
			System.out.printf("%02X ", dis.readByte());
			if (i == 2)
				dis.skipBytes(numberSkiped);
		}

	}
}
