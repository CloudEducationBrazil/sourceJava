package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		String a = "Maria";
		String b = "Juju";
		
		// equals
		System.out.println(a.equals(b));
		System.out.println(b.equals(a));
		
		// hashcode
		System.out.println();
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

		System.out.println();
		// Class Client
		Client cli1 = new Client("Maria", "maria@gmail.com");		
		Client cli2 = new Client("Maria", "maria@gmail.com");
		 	   
		 System.out.println(cli1.hashCode());		 
		 System.out.println(cli2.hashCode());
		 System.out.println("They are the same, " + cli1.equals(cli2)); // S�o Iguais
		 
		 // N�o comparar objetos desta forma, pois a compara��o � feita pela refer�ncia
		 // na mem�ria HEAP, e n�o pelo conte�do.
		 System.out.print("Are different, ");
		 System.out.print(cli1 == cli2); // False
		 
		 String s1 = "Julia";
		 String s2 = "Julia";
		 
		 System.out.println();
		 System.out.println();
		 // Testa a igualdade pelo conte�do, mem�ria est�tica.
		 System.out.println(s1 == s2); // true

		 String s3 = new String("Julia");
		 String s4 = new String("Julia");
		 
		 System.out.println();
		 // Testa a igualdade pela refer�ncia, mem�ria HEAP.
		 System.out.println(s3 == s4); // false
	}
}