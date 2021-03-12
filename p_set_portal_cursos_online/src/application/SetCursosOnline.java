package application;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetCursosOnline {

	public static void main(String[] args) throws ParseException {
		// https://github.com/acenelio/set2-java
		
		Scanner sc = new Scanner(System.in);
		
		//Set<Integer> a = new HashSet<>();
		//Set<Integer> b = new HashSet<>();
		//Set<Integer> c = new HashSet<>();
		
		Set<Integer> set = new HashSet<Integer>();
		
		System.out.print("How many students for Curso A? ");
		int qtdAluCursoA = sc.nextInt();
		
		System.out.print("Enter student codes? ");
		System.out.println();
		for (int x = 0; x< qtdAluCursoA; x++) {
			int codAluCursoA = sc.nextInt();
			
			set.add(codAluCursoA);
		}

		System.out.print("How many students for Curso B? ");
		int qtdAluCursoB = sc.nextInt();
		
		System.out.print("Enter student codes? ");
		System.out.println();
		for (int x = 0; x< qtdAluCursoB; x++) {
			int codAluCursoB = sc.nextInt();
			
			set.add(codAluCursoB);
		}

		System.out.print("How many students for Curso C? ");
		int qtdAluCursoC = sc.nextInt();
		
		System.out.print("Enter student codes? ");
		System.out.println();
		for (int x = 0; x< qtdAluCursoC; x++) {
			int codAluCursoC = sc.nextInt();
			
			set.add(codAluCursoC);
		}
		
		//Set<Integer> total = new HashSet<>(a);
		//total.addAll(b);
		//total.addAll(c);	
		
		System.out.println();
		System.out.println("Total students: " + set.size());
		
		sc.close();
	}
}