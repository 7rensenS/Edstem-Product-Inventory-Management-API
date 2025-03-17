package com.edstem.product.inventory.Entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "price-calculation")
public class PriceCalculation {

	@Id
	@NotEmpty(message = "Please Enter Product ID")
	private String productId;

	@Column
	@Min(value = 1, message = "Value Must be >= 1")
	private Integer quantity;

	@Column
	private String promoCode;

	@Column
	private String userType;

	public PriceCalculation() {
	}
	
	

	public PriceCalculation(@NotEmpty(message = "Please Enter Product ID") String productId,
			@Min(value = 1, message = "Value Must be >= 1") Integer quantity, String promoCode, String userType) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		this.promoCode = promoCode;
		this.userType = userType;
	}



	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId, promoCode, quantity, userType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PriceCalculation other = (PriceCalculation) obj;
		return Objects.equals(productId, other.productId) && Objects.equals(promoCode, other.promoCode)
				&& Objects.equals(quantity, other.quantity) && Objects.equals(userType, other.userType);
	}

	@Override
	public String toString() {
		return "Price_Calculation [productId=" + productId + ", quantity=" + quantity + ", promoCode=" + promoCode
				+ ", userType=" + userType + "]";
	}

}
