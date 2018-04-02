package integracao2018;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class Exemplos {
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
			leCoisa(pathName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// Le todas as linhas de um arquivo UTF-8, usa o Files
	public static void leCoisa(String fileName) throws IOException {
		Charset uft8 = Charset.forName("UTF-8");
		Path arquivo = Paths.get(fileName);
		for (String linha : Files.readAllLines(arquivo, uft8)) {
			System.out.println(linha);
		}
		
	}
	
	// Le todas as linhas de um arquivo UTF-8, usa o BufferReader
	public static void leCoisaParecido(String fileName) throws IOException {
		Path arquivo = Paths.get(fileName);
		Charset utf8 = Charset.forName("UTF-8");
		BufferedReader br = Files.newBufferedReader(arquivo, utf8);

		String linha;
		while ((linha = br.readLine()) != null) {
		   System.out.println(linha);
		}

		
	}
	
	// Le as linhas de um arquivo, usando FileInput e BufferReader
	public static void leCoisaAlternativo(String fileName) throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		String linha;
		while ((linha = br.readLine()) != null) {
		   System.out.println(linha);
		}
		
		br.close();
	}

	//
	public static void criaBinario(String fileName) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(216);
		dos.close();
	}
	
	//
	public static void leBinario(String fileName) throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		DataInputStream dis = new DataInputStream(fis);

		int valor = dis.readInt();
		dis.close();
		System.out.println(valor);
		System.out.println(Integer.toHexString(valor));

	}
	
	//
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
