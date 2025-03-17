package com.edstem.product.inventory.Entity;

import java.util.List;
import java.util.Objects;

public class ProductPrice {

	private String productId;
	private Double originalPrice;
	private Double finalPrice;
	private List<AppliedDiscounts> appliedDiscounts;
	private Double totalSavings;

	public ProductPrice() {
	}

	public ProductPrice(String productId, Double originalPrice, Double finalPrice,
			List<AppliedDiscounts> appliedDiscounts, Double totalSavings) {
		super();
		this.productId = productId;
		this.originalPrice = originalPrice;
		this.finalPrice = finalPrice;
		this.appliedDiscounts = appliedDiscounts;
		this.totalSavings = totalSavings;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(Double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public List<AppliedDiscounts> getAppliedDiscounts() {
		return appliedDiscounts;
	}

	public void setAppliedDiscounts(List<AppliedDiscounts> appliedDiscounts) {
		this.appliedDiscounts = appliedDiscounts;
	}

	public Double getTotalSavings() {
		return totalSavings;
	}

	public void setTotalSavings(Double totalSavings) {
		this.totalSavings = totalSavings;
	}

	@Override
	public int hashCode() {
		return Objects.hash(appliedDiscounts, finalPrice, originalPrice, productId, totalSavings);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductPrice other = (ProductPrice) obj;
		return Objects.equals(appliedDiscounts, other.appliedDiscounts) && Objects.equals(finalPrice, other.finalPrice)
				&& Objects.equals(originalPrice, other.originalPrice) && Objects.equals(productId, other.productId)
				&& Objects.equals(totalSavings, other.totalSavings);
	}

	@Override
	public String toString() {
		return "Product_Price [productId=" + productId + ", originalPrice=" + originalPrice + ", finalPrice="
				+ finalPrice + ", appliedDiscounts=" + appliedDiscounts + ", totalSavings=" + totalSavings + "]";
	}

}
