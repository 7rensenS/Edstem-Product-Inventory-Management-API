package com.edstem.product.inventory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edstem.product.inventory.Entity.PriceCalculation;

@Repository
public interface PriceCalculationRepository extends CrudRepository<PriceCalculation, String> {

}
