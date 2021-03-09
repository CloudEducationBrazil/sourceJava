package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxService taxService;
	
	public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		long instanteStart = carRental.getStart().getTime(); // Pega o valor em milisefgundos da data
		long instanteFinish = carRental.getFinish().getTime(); // Pega o valor em milisefgundos da data
		
		double hours = (double)(instanteFinish - instanteStart) / 1000 / 60 / 60; // Encontrar em segundos/Minutos/Hora
		
		// ceil arrendonda para cima
		double basicPayment = ( hours <= 12)? Math.ceil(hours) * pricePerHour: // Horas
			                  Math.ceil(hours / 24) * pricePerDay; // Dias
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
