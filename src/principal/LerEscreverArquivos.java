package principal;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class LerEscreverArquivos {
	public static void main(String[] args) throws Exception {
		OutputStream bytes = new FileOutputStream("/home/valdeci/Workspace/javaInputStreamOutputStream/src/principal/saida.txt", true);
		OutputStreamWriter chars = new OutputStreamWriter(bytes);
		BufferedWriter strings = new BufferedWriter(chars);
//		strings.write("Guj");
		strings.close();
	}
}
