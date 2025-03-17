package com.edstem.product.inventory.service;

import org.springframework.stereotype.Service;

import com.edstem.product.inventory.Entity.UserTypes;
import com.edstem.product.inventory.repository.UserTypesRepository;

@Service
public class UserTypesService {
	private UserTypesRepository typesRepository;

	public UserTypesService(UserTypesRepository typesRepository) {
		this.typesRepository = typesRepository;
	}

	public Double getUserTypeDiscount(String userType) {
		UserTypes userTypes = typesRepository.findById(userType).orElseThrow();
		return userTypes.getDiscount_percentage();
	}

}
