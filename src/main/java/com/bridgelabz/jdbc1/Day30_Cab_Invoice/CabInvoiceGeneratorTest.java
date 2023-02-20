package com.bridgelabz.jdbc1.Day30_Cab_Invoice;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
	@Test
    public void test() {
		CabInvoiceGenerator obj = new CabInvoiceGenerator();
        Assert.assertEquals(120.0,obj.getInvoice(10, 20,"R"), 0);
    }

    @Test
    public void test1() {
    	CabInvoiceGenerator obj = new CabInvoiceGenerator();    
    	Assert.assertEquals(240.0, obj.generateInvoiceAsPerUserID(5),0);
    }
    @Test
    public void test2() {
    	CabInvoiceGenerator obj = new CabInvoiceGenerator();
    	Assert.assertEquals(220.0,obj.getInvoice(10, 20,"P"), 0);
    }
}
