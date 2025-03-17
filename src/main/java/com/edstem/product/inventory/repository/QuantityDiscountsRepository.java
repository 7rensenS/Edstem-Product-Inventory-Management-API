package com.edstem.product.inventory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edstem.product.inventory.Entity.QuantityDiscounts;

@Repository
public interface QuantityDiscountsRepository extends CrudRepository<QuantityDiscounts, Long> {

	QuantityDiscounts findByMinQuantity(int quantity);

}
