package com.edstem.product.inventory.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edstem.product.inventory.Entity.PriceCalculation;
import com.edstem.product.inventory.Entity.ProductPrice;
import com.edstem.product.inventory.service.PriceCalculationService;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/api/products")
public class PriceCalculationController {

	private PriceCalculationService service;

	PriceCalculationController(PriceCalculationService service) {
		this.service = service;
	}
	
	@PostMapping("/price-calculation")
	public ProductPrice priceCalculation(@Valid @RequestBody PriceCalculation price_Calculation) {
		return service.priceCalculation(price_Calculation);
	}

}
