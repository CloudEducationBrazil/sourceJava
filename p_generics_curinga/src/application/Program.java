package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		// https://github.com/acenelio/generics3-java
		// https://github.com/acenelio/generics4-java
			
		// Nota: Pode instanciar o myInts direto com Arrays.asList
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		// Não é possível modificar a estrutura da list e sim o seu conteúdo
		//myInts.add(78);
		
		// Desta forma é possível é um ArrayList
		// ArrayList<Integer> list = new ArrayList<Integer>(myInts); 
		// list.add(78); 	
		// for (Integer integer : list) { System.out.println(integer); }

		printList(myInts);
		
		// Lista de Strings. É posssivel por causa do método está List<?>
		List<String> myStrs = Arrays.asList("Juju", "Josy", "Maria");
		System.out.println();
		printList(myStrs);
		
		String[] arrayDeStrings = new String[4];
        arrayDeStrings[0] = "Java";
        arrayDeStrings[1] = "C";
        arrayDeStrings[2] = "Scala";
        List<String> listaDeStrings = Arrays.asList(arrayDeStrings);
        
        System.out.println();
        System.out.println("Antes de inserir na última posição");
        for (String string : listaDeStrings) {
            System.out.println(string);
        }
        
        // Linha abiaxo, erro não é possível Lista 
        //listaDeStrings.add(".Net");
        
        // Ok, Vetor String
        arrayDeStrings[3] = ".Net";
        
        System.out.println();
        System.out.println("Depois da inserção");
        for (String string : listaDeStrings) {
            System.out.println(string);
        }		
	}

	// Upcasting de List<Integer> para List<?> // Generico
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}