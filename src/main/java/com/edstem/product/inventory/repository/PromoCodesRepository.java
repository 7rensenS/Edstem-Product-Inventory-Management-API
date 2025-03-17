package com.edstem.product.inventory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edstem.product.inventory.Entity.PromoCodes;

@Repository
public interface PromoCodesRepository extends CrudRepository<PromoCodes, String> {

}
