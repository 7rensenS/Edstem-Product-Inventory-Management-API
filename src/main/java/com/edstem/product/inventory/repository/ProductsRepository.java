package com.edstem.product.inventory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edstem.product.inventory.Entity.Products;

@Repository
public interface ProductsRepository extends CrudRepository<Products, String> {

}
