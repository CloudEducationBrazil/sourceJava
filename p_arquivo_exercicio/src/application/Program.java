package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// https://github.com/acenelio/files1-java
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Outra Opção para Base de Produtos
		List<Product> listSource = new ArrayList<Product>();
		listSource.add(new Product("TV LED", 1290.99, 1));
		listSource.add(new Product("Video Game Chair", 350.50, 3));
		listSource.add(new Product("Iphone X", 900.00, 2));
		listSource.add(new Product("Samsung Galaxy 9", 850.00, 2));
		
		System.out.println("Enter a name of file? ");
		String fileName = sc.next();

		// Gerando o arquivo de entrada. Base de dados Produto.txt ou similar
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
			bw.write("TV LED,1290.99,1");
			bw.newLine();

			bw.write("Video Game Chair,350.50,3");
			bw.newLine();

			bw.write("Iphone X,900.00,2");
			bw.newLine();

			bw.write("Samsung Galaxy 9,850.00,2");
			
			// File sourceFile
			System.out.println();
			System.out.println("List of Products Source:");
			for (Product productSource : listSource) {
				System.out.println(productSource);
			}			
			
			bw.close();
			
			try (BufferedReader br = new BufferedReader(new FileReader(fileName))){

				String fileNameOut = "c:\\temp\\out\\produto.csv";
			
				// System.out.println("Enter file path: ");
				// String sourceFileStr = sc.nextLine();

				// File sourceFile = new File(sourceFileStr);
				// String sourceFolderStr = sourceFile.getParent();
				
				new File("c:\\temp\\out").mkdir();
				
				try (BufferedWriter bw2 = new BufferedWriter(new FileWriter(fileNameOut))) {
					String line3 = br.readLine();
					String[] lines = line3.split(",");
					
					List<Product> listTarget = new ArrayList<Product>();
					
					//System.out.println();
					//for (String line : lines) {
					//	System.out.println(line);
					//}

					while (line3 != null) {
						String nameProduct = lines[0];
						double priceProduct = Double.parseDouble(lines[1]);
						int quantityProduct = Integer.parseInt(lines[2]);
						
						listTarget.add(new Product(nameProduct, priceProduct * quantityProduct, quantityProduct));

						//if ( quantityProduct > 1 ) {
							lines[1] = String.valueOf(priceProduct * quantityProduct);
						//}
						
						for (int x = 0; x < lines.length - 1; x++) {
							bw2.write( x !=  1? lines[x] + ",": String.format("%.2f", priceProduct * quantityProduct));
						}

						bw2.newLine();
						line3 = br.readLine();
						
						if ( line3 != null) {
							lines = line3.split(",");
						}
					}
					
					// File targetFile
					System.out.println();
					System.out.println("List of Products Target:");
					for (Product productTarget : listTarget) {
						System.out.println(productTarget);
					}
					
				  bw2.close();
				} catch (IOException e) {
					System.out.println("Error Writing new file: " + e.getMessage());
				}

				br.close();
				
				System.out.println("End of program!!!");
				
			} catch (IOException e) {
				System.out.println("Error reading close a file: " + e.getMessage());
			}
		}
		catch (IOException e) {
			System.out.println("Error writing file Product: " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}
		sc.close();
	}
}