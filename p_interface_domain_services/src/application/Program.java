package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		// https://github.com/acenelio/interfaces1-java
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("************* System of RentCar *************");
		System.out.println();
		System.out.println("Enter rental data");

		System.out.println();
		System.out.print("Car Model? "); String carModel = sc.nextLine();
		System.out.print("Pickup. Enter start rental (dd/MM/yyyy HH:ss)? "); Date startRental = sdf.parse(sc.nextLine());
		System.out.print("Return. Enter finish rental (dd/MM/yyyy HH:ss)? "); Date finishRental = sdf.parse(sc.nextLine());
		
		CarRental carRental = new CarRental(startRental, finishRental, new Vehicle(carModel));
		
		System.out.println();
		System.out.print("Enter price per hour $? "); Double pricePerHour = sc.nextDouble();
		System.out.print("Enter price per day $? "); Double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService()); // taxService
		rentalService.processInvoice(carRental);
		
		System.out.println();
		System.out.println("INVOICE:");
		System.out.println("Basic payment $: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
		System.out.println("Tax $: " + String.format("%.2f", carRental.getInvoice().getTax()));
		System.out.println("Tota payment $: " + String.format("%.2f", carRental.getInvoice().totalPyament()));

		sc.close();
	}
}
