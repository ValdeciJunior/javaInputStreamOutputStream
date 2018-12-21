package principal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StreamApp {
	public static void byteStram() throws Exception {
		FileInputStream entrada = new FileInputStream("/home/valdeci/eclipse-workspace/java-OutputStream-InputStram/src/principal/dados.txt");
		int c = 0;
		while((entrada.read()) != -1) {
			c++;
		}
		System.out.println("Número de caractere é: "+c);
		entrada.close();
	}
	
	public static void caractereStream(char letra) throws Exception {
		FileInputStream entrada = new FileInputStream("/home/valdeci/eclipse-workspace/java-OutputStream-InputStram/src/principal/dados.txt");
		int c = 0;
		int cc;
		while((cc = entrada.read()) != -1) {
			if(cc == letra) {
				c++;
			}
		}
		System.out.println("Número de vezes que a letra informada foi encontrada foi: "+c);
		entrada.close();
	}
	
	public static void main(String[] args) {
		
		try {
			//byteStram();
			System.out.println("Informe a letra");
			char letra = (char)System.in.read();
			caractereStream(letra);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
