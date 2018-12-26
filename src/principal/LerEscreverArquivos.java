package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class LerEscreverArquivos {
	public static void main(String[] args) throws Exception {
		
		String op = JOptionPane.showInputDialog("Escolha uma opção: \n"
				+ "1- Criar um arquivo .txt \n"
				+ "2- Editar um arquivo .txt \n"
				+ "3- Deletar um arquivo .txt");
		switch (op) {
		case "1":
			Scanner text = new Scanner(System.in);
			OutputStream bytes = new FileOutputStream("/home/valdeci/Workspace/javaInputStreamOutputStream/src/principal/"+JOptionPane.showInputDialog("Informe o nome do arquivo")+".txt", true);
			OutputStreamWriter chars = new OutputStreamWriter(bytes);
			BufferedWriter strings = new BufferedWriter(chars);
			strings.write(text.nextLine());
			strings.close();
			break;

		case "2":
//			String caminho = JOptionPane.showInputDialog("Digite o caminho do arquivo:");
			String caminho = "/home/valdeci/Workspace/javaInputStreamOutputStream/src/principal/teste.txt";
//			FileInputStream entrada = new FileInputStream(caminho);
//			int l = 0;
//			while((l = entrada.read()) != -1) {
//				System.out.print((char)l);
//			}
//			entrada.close();
			
			Scanner teste = new Scanner(System.in);
			teste.nextLine();
			Scanner teste2 = new Scanner(String.valueOf(teste));
			
			teste.nextLine();
			break;
		default:
			break;
		}
	}
}
