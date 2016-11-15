package com.blacktierental.springapp.domain;
import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;

public class ProductTests {

	private Product product;
	
	@Before
	public void setUp() throws Exception{
		product = new Product();
	}
	
	@Test
	public void testSetAndGetDescription() {
		String testDescription = "aDescription";
		assertNull(product.getDescription());
		product.setDescription(testDescription);
		assertEquals(testDescription, product.getDescription());
	}
	
	@Test
	public void testSetAndGetPrice(){
		double testPrice = 100.00;
		assertEquals(0, 0, 0);
		product.setPrice(testPrice);
		assertEquals(testPrice, product.getPrice(),0);
	}

}
