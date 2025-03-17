package com.edstem.product.inventory.Entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "quantity_discounts")
public class QuantityDiscounts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "Please Enter Min Quantity")
	@Column(nullable = false, name = "min_quantity")
	private Integer minQuantity;
	
	@NotEmpty(message = "Please Enter Discount Percentage")
	@Column(nullable = false, name = "discount_percentage")
	private Double discountPercentage;

	public QuantityDiscounts() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getMin_quantity() {
		return minQuantity;
	}

	public void setMin_quantity(Integer min_quantity) {
		this.minQuantity = min_quantity;
	}

	public Double getDiscount_percentage() {
		return discountPercentage;
	}

	public void setDiscount_percentage(Double discount_percentage) {
		this.discountPercentage = discount_percentage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(discountPercentage, id, minQuantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuantityDiscounts other = (QuantityDiscounts) obj;
		return Objects.equals(discountPercentage, other.discountPercentage) && Objects.equals(id, other.id)
				&& Objects.equals(minQuantity, other.minQuantity);
	}

	@Override
	public String toString() {
		return "Quantity_Discounts [id=" + id + ", min_quantity=" + minQuantity + ", discount_percentage="
				+ discountPercentage + "]";
	}

}
