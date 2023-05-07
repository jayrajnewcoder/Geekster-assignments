package com.Adresss.Adress.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Pattern(regexp = "^[a-zA-Z0-9]+$")
	@Column(name = "BRAND")
	private String name;
	
	@Pattern(regexp = "^[0-9]+$")
	@Column(name = "PRICE")
	private Integer price;
	
	@Pattern(regexp = "^[a-zA-Z0-9]+$")
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Pattern(regexp = "^[a-zA-Z0-9]+$")
	@Column(name = "CATEGORY")
	private String category;
	
	@Pattern(regexp = "^[a-zA-Z0-9]+$")
	@Column(name = "BRAND")
	private String brand;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Integer id, String name, Integer price, String description, String category, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.category = category;
		this.brand = brand;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", category=" + category + ", brand=" + brand + "]";
	}

	
}
