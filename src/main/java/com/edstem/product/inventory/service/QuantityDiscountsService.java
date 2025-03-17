package com.edstem.product.inventory.service;

import org.springframework.stereotype.Service;

import com.edstem.product.inventory.Entity.QuantityDiscounts;
import com.edstem.product.inventory.repository.QuantityDiscountsRepository;

@Service
public class QuantityDiscountsService {

	private QuantityDiscountsRepository repository;

	QuantityDiscountsService(QuantityDiscountsRepository repository) {
		this.repository = repository;
	}

	public Double getQuantityDiscount(int quantity) {
		QuantityDiscounts quantityDiscounts = repository.findByMinQuantity(quantity);
		if (!(quantityDiscounts == null)) {
			return quantityDiscounts.getDiscount_percentage();
		}
		return 0.0;

	}
}
