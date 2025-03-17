package com.edstem.product.inventory.Entity;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "promo_codes")
public class PromoCodes {
	@Id
	private String code;
	
	@NotEmpty(message = "Please Enter Discount Percentage")
	@Column(nullable = false, name = "discount_percentage")
	private Double discountPercentage;
	
	@Column
	private Boolean active;
	
	@Column(name = "valid_until")
	private LocalDate validUntil;

	public PromoCodes() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getDiscount_percentage() {
		return discountPercentage;
	}

	public void setDiscount_percentage(Double discount_percentage) {
		this.discountPercentage = discount_percentage;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public LocalDate getValid_until() {
		return validUntil;
	}

	public void setValid_until(LocalDate valid_until) {
		this.validUntil = valid_until;
	}

	@Override
	public int hashCode() {
		return Objects.hash(active, code, discountPercentage, validUntil);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PromoCodes other = (PromoCodes) obj;
		return Objects.equals(active, other.active) && Objects.equals(code, other.code)
				&& Objects.equals(discountPercentage, other.discountPercentage)
				&& Objects.equals(validUntil, other.validUntil);
	}

	@Override
	public String toString() {
		return "Promo_Codes [code=" + code + ", discount_percentage=" + discountPercentage + ", active=" + active
				+ ", valid_until=" + validUntil + "]";
	}

}
