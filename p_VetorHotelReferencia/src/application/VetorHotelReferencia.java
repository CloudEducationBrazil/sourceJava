package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class VetorHotelReferencia {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int qtdPeoples = sc.nextInt();
		
		Rent[] room = new Rent[10];
		
		for ( int x = 0; x < qtdPeoples; x++) {
			sc.nextLine();
			
			System.out.println();
			System.out.println("Rent #" + x + ":");
			
			System.out.print("Enter name? ");
			String name = sc.nextLine();
			
			System.out.print("Enter Email? ");
			String email = sc.nextLine();
			
			System.out.print("Enter room [0..9]? ");
			int whatRoom = sc.nextInt();
			
			while ( whatRoom < 0 || whatRoom > 9 ) {
				System.out.print("Enter room [0..9]? ");
				whatRoom = sc.nextInt();
			}
			
			System.out.print("Enter price? ");
			double price = sc.nextDouble();
			
			room[whatRoom] = new Rent(name, email, whatRoom, price);
		}
		
		// Impressão das Hospedagens
		System.out.println();
		System.out.println("Busy Rooms:");
		System.out.println();
		
		for ( int x = 0; x < room.length; x++) {
			if ( room[x] != null ) {
				System.out.println("Name: "  + room[x].getName());
				System.out.println("Email: " + room[x].getEmail());
				System.out.println("Room: "  + room[x].getRoom());
				System.out.println("Price: " + room[x].getPrice());
				
				System.out.println();
			}
		}
		sc.close();
	}
}
