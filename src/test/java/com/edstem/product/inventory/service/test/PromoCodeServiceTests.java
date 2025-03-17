package com.edstem.product.inventory.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.edstem.product.inventory.service.PromoCodesService;

@SpringBootTest
public class PromoCodeServiceTests {
	@Autowired
	private PromoCodesService promoCodesService;

	@Test
	public void getPromoCodeDiscountTest() {
		Double promoCodeDiscount = promoCodesService.getPromoCodeDiscount("SPRING25");
		assertEquals(25.0, promoCodeDiscount);
	}
}
