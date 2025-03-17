package com.edstem.product.inventory.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.edstem.product.inventory.Entity.PriceCalculation;
import com.edstem.product.inventory.Entity.ProductPrice;
import com.edstem.product.inventory.service.PriceCalculationService;

@SpringBootTest
public class DiscountCalculationLogicTest {
	@Autowired
	private PriceCalculationService priceCalculationService;

	@Test
	public void getDiscountCalculationLogicTest() {
		PriceCalculation priceCalculation1 = new PriceCalculation("ABC123", 5, "SPRING25", "PREMIUM");
		PriceCalculation priceCalculation2 = new PriceCalculation("ABC123", 5, "SPRING25", "PREMIUM");

		ProductPrice productPrice1 = priceCalculationService.priceCalculation(priceCalculation1);
		ProductPrice productPrice2 = priceCalculationService.priceCalculation(priceCalculation2);
		
		assertEquals(productPrice1.getTotalSavings(), productPrice2.getTotalSavings());
		
	}
}