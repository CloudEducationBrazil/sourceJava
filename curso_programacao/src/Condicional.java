import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int dia;
		
		System.out.println("Digite o dia? ");
		dia = sc.nextInt();
		
		// if; encadeamento
		if ( dia == 1) {
			System.out.println("Domingo");
		} else if ( dia == 2) {
			System.out.println("Segunda");
		} else if ( dia == 3) {
			System.out.println("Ter�a");
		} else if(dia == 4) {
			System.out.println("Quarta");
		} else if(dia == 5) {
			System.out.println("Quinta");
		} else if(dia == 6) {
			System.out.println("Sexta");
		} else if(dia == 7) {
			System.out.println("S�bado");
		} else {
			System.out.println("Dia Inv�lido");
		}
		
		String diaStr;
		
		// Switch
		switch ( dia ) {
		case 1: diaStr = "Domingo"; break;
		case 2: diaStr = "Segunda"; break;
		case 3: diaStr = "Ter�a"; break;
		case 4: diaStr = "Quarta"; break;
		case 5: diaStr = "Quinta"; break;
		case 6: diaStr = "Sexta"; break;
		case 7: diaStr = "S�bado"; break;
		default: diaStr = "Dia Inv�lido"; break;
		}

		System.out.println(diaStr);
		
		// Tern�rio
		String diaStr2 = (dia == 1) ? "Domingo" : (dia == 2) ? "Segunda" : (dia == 3) ? "Ter�a" : (dia == 4) ? "Quarta" : 
			             (dia == 5) ? "Quinta" : (dia == 6) ? "Sexta" : (dia == 7) ? "S�bado" : "Dia Inv�lido";
		
		System.out.println(diaStr2);
		
		// Vari�veis Cumulativas
		int cont1=0;
		cont1 += 2; // cont = cont +2;

		System.out.println(cont1);
		int cont2=0;
		cont2 -= 2;// cont = cont -1;
		System.out.println(cont2);
		
		int a=0;
		if ( a == 2 ) {

			a = 2;}

		System.out.println(a);
		
		sc.close();
	}
}
