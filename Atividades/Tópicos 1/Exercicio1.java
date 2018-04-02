package integracao2018;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercicio1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		// Get the input file and data
		FileInputStream fis = new FileInputStream("args [0]");
		DataInputStream dis = new DataInputStream(fis);
		
		int numberOfBytes = 4;
		for (int i = 0; i < numberOfBytes; i++)
			System.out.printf("%02X ", dis.readByte());

		// ** COOL WAY **
		// Size of the byte data.
		// byte[] data = new byte[4];
		// Read data until for the byte array .
		// Integer leng = fin.read(data);
		// for (int j = 0; j < leng; j++) {
		// System.out.printf("%02X ", data[j]);
		// }

	}
}
