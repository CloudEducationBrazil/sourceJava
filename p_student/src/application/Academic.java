package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Academic {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		
		System.out.println("Assessment Student"); // Avaliação do Estudante
		System.out.println();

		System.out.print("Name? ");
		aluno.name = sc.nextLine();

		System.out.print("Grade AV1? ");
		aluno.av1 = sc.nextDouble();

		System.out.print("Grade AV2? ");
		aluno.av2 = sc.nextDouble();

		System.out.print("Grade AV3? ");
		aluno.av3 = sc.nextDouble();
	
		aluno.calculationOfAverage();
		aluno.finalGrade();
		aluno.missingPoints();
		
		System.out.println();
		System.out.print(aluno);

		sc.close();
	}
}
