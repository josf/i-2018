package integracao2018;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercicio2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		// Get the input file and data
		// FileInputStream fis = new FileInputStream("args [0]");
		FileInputStream fis = new FileInputStream("C:\\Users\\Pichau\\eclipse-workspace\\integracao2018\\692075.jpg");
		DataInputStream dis = new DataInputStream(fis);

		// FF D8 - FF D9
		int numberOfBytes = 4;
		int numberSkiped = dis.available() - 4;
		
		// Print the first two bytes, then skip to the last two
		for (int i = 0; i < numberOfBytes; i++) {
			System.out.printf("%02X ", dis.readByte());
			if(i==2)
				dis.skipBytes(numberSkiped);	
		}
		
	}
}
