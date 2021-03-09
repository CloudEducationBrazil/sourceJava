package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileArquivo {

	public static void main(String[] args) {
		// POO Plano de Curso: https://www.inf.pucrs.br/manssour/POO/index.html 
		
		Scanner sc = null;
		String path = "c:\\temp\\teste.txt";
		
		File file = new File(path); // \ pré-fixo de caracteres especias
		
		System.out.println();
		System.out.println("File e Scanner");
		System.out.println();

		// File e Scanner
		try {
			sc = new Scanner(file);
			
			while (sc.hasNextLine() ) {
				System.out.println(sc.nextLine());
			}
						
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if ( sc != null)
				sc.close();			
		}
		
		System.out.println();
		System.out.println("FileReader e BufferedReader");
		System.out.println();
		
		// String path = "c:\\temp\\teste.txt";
		// FileReader e BufferReader
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while ( line != null ) {
				System.out.println(line);
				line = br.readLine();
			}
						
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if ( br != null )
				  br.close();
					
				if ( fr != null )
			      fr.close();
					
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println();
		System.out.println("try-with-resources - FileReader e BufferedReader");
		System.out.println();
		
		// try-with-resources - FileReader e BufferedReader
		try ( BufferedReader br2 = new BufferedReader ( new FileReader(path) ) ) {
			String line2 = br2.readLine();
			
			while ( line2 != null ) {
				System.out.println(line2);
				line2 = br2.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println();
		System.out.println("try-with-resources - FileWriter e BufferedWriter");
		System.out.println();
		
		String path2 = "c:\\temp\\teste2.txt";
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		// try-with-resources - FileReader e BufferedReader
		try ( BufferedWriter bw = new BufferedWriter( new FileWriter(path2) ) ) {
			// Não recria ou arquivo se existir
//		try ( BufferedWriter bw = new BufferedWriter( new FileWriter(path2, true) ) ) {
			for (String line : lines) {
				System.out.println(line);
				//bw.append(line +"\n"); Ou
				//bw.write(line + "\n"); Ou
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();;
		}
		
		System.out.println();
		System.out.println("Filtrando pastas/folders");
		System.out.println();
		
		sc = new Scanner(System.in);
		
		System.out.print("Enter a folders path? ");
		String strPath = sc.next();
		
		File path3 = new File(strPath);
		
		///////////////////////////////
		File[] folders = path3.listFiles(File::isDirectory);
		
		System.out.println();
		System.out.println("List FOLDERS:\n");
		for (File folder : folders) {
		  System.out.println(folder);
		}
		
		/////////////////////////
		File[] files = path3.listFiles(File::isFile);
		System.out.println();
		System.out.println("List FILES:\n");
		for (File file2 : files) {
			  System.out.println(file2);
			}
		
		System.out.println();
		System.out.println("Create subPasta:\n");
		
		boolean sucess = new File(strPath+"\\aula").mkdir();
		System.out.println("Folder created with successfully!!! " + sucess);
		
		System.out.println();
		System.out.println("Other informations files:\n");
		System.out.print("Enter a fileName? ");
		String fileName = sc.next();
		
		File file4 = new File(fileName);
		
		System.out.println("getName: " + file4.getName()); // nome do arquivo
		System.out.println("getParent: " + file4.getParent()); // Somente o caminho
		System.out.println("getPath: " + file4.getPath()); // Caminho completo do arquivo

		sc.close();
	}
}