package com.walmart.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table
public class Product implements Serializable {

	@Id
	private Integer id;
	@Column
	private String title;
	@Column
	private String description;
	@Column
	@JsonProperty("category")
	private String productType;
	@Column
	private double price;
	@Column
	@Embedded
	private Rating rating;
	@Column
	@JsonProperty("image")
	private String productImageUrl;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Product(Integer id, String title, String description, String productType, double price, Rating rating,
			String productImageUrl) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.productType = productType;
		this.price = price;
		this.rating = rating;
		this.productImageUrl = productImageUrl;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", description=" + description + ", productType="
				+ productType + ", price=" + price + ", rating=" + rating + ", productImageUrl=" + productImageUrl
				+ "]";
	}

	

}
