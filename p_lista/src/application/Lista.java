package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("maria");
		list.add("bob");
		list.add("alex");
		list.add("ana");
		list.add(2, "Julia");
		list.add("baboo");
		
		String fisrtName = list.stream().filter(x-> x.charAt(0) == 'a').findFirst().orElse(null);
		System.out.println("Primeiro Nome da Lista " + fisrtName);
		System.out.println();

		System.out.println(list.size());

		System.out.println("Lista Original");
		for (String nomes : list) {
			System.out.println(nomes);
		}

		System.out.println();
		System.out.println("Index bob:" + list.indexOf("bob"));	// quando encontra retorna a posição	
		System.out.println("Index juju:" + list.indexOf("juju")); // retorna -1 quando não encontra
		System.out.println();
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());
		System.out.println("Nova Lista Result");
		for (String nomes2 : result) {
			System.out.println(nomes2);
		}
		
		list.remove(3);
		list.remove("maria");
		
		System.out.println();
		System.out.println(list.size());

		System.out.println("Lista Alterada");
		for (String nomes : list) {
			System.out.println(nomes);
		}

		System.out.println();

		// Função Lambda que retorna um predicado
		list.removeIf(x -> x.charAt(0) == 'b');

		System.out.println("Lista removida com predicado");
		for (String nomes : list) {
			System.out.println(nomes);
		}

	}
}
