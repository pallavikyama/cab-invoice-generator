package com.blz.invoicegenerator;

public class InvoiceGenerator {

	private static final double COST_PER_KM = 10.0;
	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_FARE = 5.0;

	public double calculateFare(double distance, int time) {
		double totalFare = distance * COST_PER_KM + time * COST_PER_TIME;
		if (totalFare < MINIMUM_FARE)
			totalFare = MINIMUM_FARE;
		return totalFare;
	}
}