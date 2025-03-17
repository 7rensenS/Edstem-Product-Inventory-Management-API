package com.edstem.product.inventory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edstem.product.inventory.Entity.UserTypes;

@Repository
public interface UserTypesRepository extends CrudRepository<UserTypes, String> {

}
