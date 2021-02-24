package application;

public class ForEachWrapper {

	public static void main(String[] args) {
		String[] palavras = new String[] { "maria", "julia", "josy", "heleno" };

		// Impreessão 1
		System.out.println("Impressão 1 for:");
		for (int x = 0; x < palavras.length; x++) {
			System.out.println(palavras[x]);
		}
		
		System.out.println();
		
		// Impreessão 2
		System.out.println("Impressão 2 foreach:");
		for (String word : palavras) { // Objeto
			System.out.println(word);
		}
	}
}
