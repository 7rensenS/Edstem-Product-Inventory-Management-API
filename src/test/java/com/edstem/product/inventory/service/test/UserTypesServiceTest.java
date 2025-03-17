package com.edstem.product.inventory.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.edstem.product.inventory.service.UserTypesService;

@SpringBootTest
public class UserTypesServiceTest {
	@Autowired
	private UserTypesService userTypesService;
	
	@Test
	public void getUserTypeDiscountTest() {
		Double userTypeDiscount = userTypesService.getUserTypeDiscount("PREMIUM");
		assertEquals(10.0, userTypeDiscount);
	}
}
