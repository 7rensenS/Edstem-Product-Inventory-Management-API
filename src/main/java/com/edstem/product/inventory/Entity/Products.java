package com.edstem.product.inventory.Entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "products")
public class Products {

	@Id
	private String id;

	@NotEmpty(message = "Please Enter Product Name")
	@Column(nullable = false)
	private String name;

	@Column
	private String description;

	@NotEmpty(message = "Please Enter Product Base Price")
	@Column(nullable = false, name = "base_price")
	private Double basePrice;

	@Column
	private String category;

	@NotEmpty(message = "Please Enter Available Quantity")
	@Column(nullable = false, name = "available_quantity")
	private Integer availableQuantity;

	public Products() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getBase_price() {
		return basePrice;
	}

	public void setBase_price(Double base_price) {
		this.basePrice = base_price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getAvailable_quantity() {
		return availableQuantity;
	}

	public void setAvailable_quantity(Integer available_quantity) {
		this.availableQuantity = available_quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(availableQuantity, basePrice, category, description, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(availableQuantity, other.availableQuantity) && Objects.equals(basePrice, other.basePrice)
				&& Objects.equals(category, other.category) && Objects.equals(description, other.description)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", description=" + description + ", base_price=" + basePrice
				+ ", category=" + category + ", available_quantity=" + availableQuantity + "]";
	}

}
