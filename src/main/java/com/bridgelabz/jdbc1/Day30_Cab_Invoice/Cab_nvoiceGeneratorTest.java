package com.bridgelabz.jdbc1.Day30_Cab_Invoice;

import org.junit.Assert;
import org.junit.Test;

public class Cab_nvoiceGeneratorTest {
	@Test
	public void calculateFareOfOneRide() {
		CabInvoiceGenerator obj = new CabInvoiceGenerator();
		double test = obj.calculateFare(10, 15);
		Assert.assertEquals(115.0, test, 0.0);
	}
}
