package application;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("MATRIZ");
		
	    int[][] matriz = new int[3][3];
	    
	    // matriz.length -- Qtd de Linhas
	    // matriz[l].length -- Qtd Colunas
	    // github.com/acenelio/matrix1-java	   
	    // github.com/acenelio/matrix1-java2
	    
	    for ( int l = 0; l < matriz.length; l++) {
	    	for ( int c = 0; c < matriz[l].length; c++ ) {
	    		System.out.print("Enter witch element of Matriz [" + l + "," + c + "]? ");
	    		matriz[l][c] = sc.nextInt();	    		
	    	}
	    }

	    // Impressão da Matriz
	    System.out.println();
	    System.out.println("Impressão da Matriz");
	    for ( int l = 0; l < matriz.length; l++) {
	    	System.out.println();
	    	for ( int c = 0; c < matriz[l].length; c++ ) {
	    		System.out.print("Element of Matriz [" + l + "," + c + "] = ");
	    		System.out.print(matriz[l][c] + " ");   		
	    	}
	    }	 
	    
	    // Diagonal Principal
	    System.out.println();	    
	    System.out.println();
	    System.out.println("Main Diagonal");
	    for ( int l = 0; l < matriz.length; l++) {
	    	System.out.println();
	    	for ( int c = 0; c < matriz[l].length; c++ ) {
	    		if ( l == c ) {
		    		System.out.print("Element of Matriz [" + l + "," + c + "] = ");
		    		System.out.print(matriz[l][c] + " ");   
	    		}
	    	}
	    }	    
	    
	    // Elementos Negativos da Matriz
	    System.out.println();
	    System.out.println();	  
	    System.out.println("Numbers Negativos of Matriz");
	    int contElementsNegative = 0;
	    for ( int l = 0; l < matriz.length; l++) {
	    	for ( int c = 0; c < matriz[l].length; c++ ) {
	    		if ( matriz[l][c] < 0 ) {
		    		System.out.print("Element of Matriz [" + l + "," + c + "] = ");
		    		System.out.print(matriz[l][c] + " ");       	
		    		contElementsNegative++;
	    		}
	    	}
	    }
	    
	    System.out.println();
	    System.out.print("Quantity elements negative " + contElementsNegative);
	    sc.close();
	}
}
