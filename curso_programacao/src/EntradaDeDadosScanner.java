import java.util.Scanner;

public class EntradaDeDadosScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String nome;
		System.out.print("Digite um nome? ");
		nome = sc.nextLine(); // nome composto ou next(); Nome simples
		
		System.out.println("Meu nome eh: " + nome + "\n");
		
		int num;
		System.out.print("Digite um número inteiro: ");
		num = sc.nextInt();
		System.out.println("O número informado foi: " + num + "\n");
		
		double altura;
		System.out.print("Digite uma altura: ");
		altura = sc.nextDouble();
		System.out.println("A altura digitada foi: " + altura + "\n");
		
		char sexo;
		System.out.print("Digite um sexo: ");
		sexo = sc.next().charAt(0);
		System.out.println("Sexo informado foi: " + sexo + "\n");
	
		String nome2;
		nome2 = sc.next(); // Para Nome composto, nextLine, senão dar ERRO
		int num2;
		num2 = sc.nextInt();
		System.out.println("Dados digitaods: ");
		System.out.println(nome2);
		System.out.println(num2);

		sc.close();
	}

}
