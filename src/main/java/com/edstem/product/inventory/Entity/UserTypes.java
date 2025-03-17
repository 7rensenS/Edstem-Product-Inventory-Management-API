package com.edstem.product.inventory.Entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "user_types")
public class UserTypes {

	@Id
	private String type;
	
	@NotEmpty(message = "Please Enter Discount Percentage")
	@Column(nullable = false, name = "discount_percentage")
	private Double discountPercentage;

	public UserTypes() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getDiscount_percentage() {
		return discountPercentage;
	}

	public void setDiscount_percentage(Double discount_percentage) {
		this.discountPercentage = discount_percentage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(discountPercentage, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserTypes other = (UserTypes) obj;
		return Objects.equals(discountPercentage, other.discountPercentage) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "User_Types [type=" + type + ", discount_percentage=" + discountPercentage + "]";
	}

}
