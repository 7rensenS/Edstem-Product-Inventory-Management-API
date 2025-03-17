package com.edstem.product.inventory.service;

import org.springframework.stereotype.Service;

import com.edstem.product.inventory.Entity.Products;
import com.edstem.product.inventory.repository.ProductsRepository;

@Service
public class ProductsService {
	private ProductsRepository repository;

	public ProductsService(ProductsRepository repository) {
		this.repository = repository;
	}

	public Double getBasePrice(String productId) {
		Products products = repository.findById(productId).orElseThrow();
		return products.getBase_price();
	}
}
