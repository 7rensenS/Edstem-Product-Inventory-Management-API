package com.edstem.product.inventory.service;

import org.springframework.stereotype.Service;

import com.edstem.product.inventory.Entity.PromoCodes;
import com.edstem.product.inventory.repository.PromoCodesRepository;

@Service
public class PromoCodesService {
	private PromoCodesRepository promoCodesRepository;

	public PromoCodesService(PromoCodesRepository promoCodesRepository) {
		this.promoCodesRepository = promoCodesRepository;
	}

	public Double getPromoCodeDiscount(String promoCode) {
		PromoCodes promoCodes = promoCodesRepository.findById(promoCode).orElseThrow();
		if (promoCodes.getActive())
			return promoCodes.getDiscount_percentage();
		else
			return 0.0;
	}
}
