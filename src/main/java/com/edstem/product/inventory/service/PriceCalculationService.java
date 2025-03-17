package com.edstem.product.inventory.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edstem.product.inventory.Entity.AppliedDiscounts;
import com.edstem.product.inventory.Entity.PriceCalculation;
import com.edstem.product.inventory.Entity.ProductPrice;
import com.edstem.product.inventory.repository.PriceCalculationRepository;

@Service
public class PriceCalculationService {
	private PriceCalculationRepository priceCalculationRepository;
	private ProductsService productsService;
	private QuantityDiscountsService discountsService;
	private PromoCodesService promoCodesService;
	private UserTypesService typesService;

	public PriceCalculationService(PriceCalculationRepository priceCalculationRepository,
			ProductsService productsService, QuantityDiscountsService discountsService,
			PromoCodesService promoCodesService, UserTypesService typesService) {
		this.priceCalculationRepository = priceCalculationRepository;
		this.productsService = productsService;
		this.discountsService = discountsService;
		this.promoCodesService = promoCodesService;
		this.typesService = typesService;
	}

	public ProductPrice priceCalculation(PriceCalculation priceCalculation) {
		ProductPrice price = new ProductPrice();
		List<AppliedDiscounts> appliedDiscounts = new ArrayList<>();

		// SET PRODUCT ID
		price.setProductId(priceCalculation.getProductId());

		// SET ORGINAL PRICE
		Double productPrice = productsService.getBasePrice(priceCalculation.getProductId());
		price.setOriginalPrice(productPrice);

		// SET APPLIED DISCOUNTS
		Double totalDiscount = 0.0;
		Double quantityDiscount = 0.0;
		Double promocodeDiscount = 0.0;
		Double userTypeDiscount = 0.0;

		// FETCHING QUANTITY WISE DISCOUNT
		if (priceCalculation.getQuantity() > 0) {
			quantityDiscount = discountsService.getQuantityDiscount(priceCalculation.getQuantity());
		}

		// FETCHING PROMOCODE DISCOUNT
		if (!(priceCalculation.getPromoCode().isEmpty())) {
			promocodeDiscount = promoCodesService.getPromoCodeDiscount(priceCalculation.getPromoCode());
			appliedDiscounts.add(new AppliedDiscounts(priceCalculation.getPromoCode(), promocodeDiscount));
		}

		// FETCHING USER TYPE DISCOUNT
		if (!(priceCalculation.getUserType().isEmpty())) {
			userTypeDiscount = typesService.getUserTypeDiscount(priceCalculation.getUserType());
			appliedDiscounts.add(new AppliedDiscounts(priceCalculation.getUserType(), userTypeDiscount));
		}

		totalDiscount = quantityDiscount + promocodeDiscount + userTypeDiscount;

		// SET APPLIED DISCOUNT TO CLASS
		price.setAppliedDiscounts(appliedDiscounts);

		// SET TOTAL SAVINGS
		Double pointPersentageValue = totalDiscount / 100;
		Double totalSavings = productPrice * pointPersentageValue;
		price.setTotalSavings(totalSavings);

		// SET FINAL PRICE
		Double final_price = productPrice - totalSavings;
		price.setFinalPrice(final_price);

		return price;
	}

}
