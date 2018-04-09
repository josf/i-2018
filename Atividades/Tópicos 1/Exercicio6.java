package integracao2018;

import java.io.*;

public class Exercicio6 {

	public static void main(String[] args) throws IOException {

		String destFile = "C:\\Users\\Pichau\\eclipse-workspace\\integracao2018\\inputfile.txt";
		FileInputStream fis = new FileInputStream(destFile);
		DataInputStream dis = new DataInputStream(fis);
		
		while (dis.available() > 0) {

			int lines = dis.readInt();

			byte[] buffer = new byte[lines];
			dis.readFully(buffer, 0, lines);

			String output = new String(buffer, "UTF-8");

			System.out.println(output + "\n");

		}
	}
}
