package application;

public class ForEachWrapper {

	public static void main(String[] args) {
		String[] palavras = new String[] { "maria", "julia", "josy", "heleno" };

		// Impreess�o 1
		System.out.println("Impress�o 1 for:");
		for (int x = 0; x < palavras.length; x++) {
			System.out.println(palavras[x]);
		}
		
		System.out.println();
		
		// Impreess�o 2
		System.out.println("Impress�o 2 foreach:");
		for (String word : palavras) { // Objeto
			System.out.println(word);
		}
	}
}
