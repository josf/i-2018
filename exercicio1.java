package integracao;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.Set;

import org.omg.CORBA.Any;

public class exercicio1 {
	/*
	 * Escreva um programa (linha de comandos) que recebe como único argumento
	 * um nome de arquivo e exibe os 4 primeiros bytes (inteiro de 32 bits) 
	 * em formato hexadecimal na saída padrão. Qual o resultado da execução
	 * desse programa quando o arquivo de entrada é um arquivo .class
	 * (bytecodes)?
	 */
	public static String pathName = "algomassa";
	public static String pathName2 = "outrocoiso";
	
	
	public static void main(String args[]) throws IOException{
		/*
		PrintWriter pw = new PrintWriter(pathName, "UTF-8");
		pw.write(pathName2);
		pw.close();
		*/
		
		try {
			criaBinario(pathName);
			leCoisa();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void leCoisa() throws IOException {
		Charset uft8 = Charset.forName("UTF-8");
		Path arquivo = Paths.get(pathName);
		for (String linha : Files.readAllLines(arquivo, uft8)) {
			System.out.println(linha);
		}
		
	}
	
	public static void leCoisaParecido() throws IOException {
		Path arquivo = Paths.get(pathName);
		Charset utf8 = Charset.forName("UTF-8");
		BufferedReader br = Files.newBufferedReader(arquivo, utf8);

		String linha;
		while ((linha = br.readLine()) != null) {
		   System.out.println(linha);
		}

		
	}
	
	public static void leCoisaAlternativo() throws IOException {
		FileInputStream fis = new FileInputStream(pathName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		String linha;
		while ((linha = br.readLine()) != null) {
		   System.out.println(linha);
		}
		
		br.close();
	}

	public static void criaBinario(String fileName) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(216);;
		dos.close();
	}
	
	public static void leBinario(String fileName) throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		DataInputStream dis = new DataInputStream(fis);

		int valor = dis.readInt();
		dis.close();
		System.out.println(valor);
		System.out.println(Integer.toHexString(valor));

	}
	
	public static void criaBuffer(String fileName) throws IOException {
		Path arquivo = Paths.get(fileName);
		int valor = Integer.parseInt(pathName);

		ByteBuffer buffer = ByteBuffer.allocate(10);
		buffer.putInt(valor);
		buffer.flip();

		FileChannel fc = FileChannel.open(arquivo);
		fc.write(buffer);
		fc.close();

	}
	
}
