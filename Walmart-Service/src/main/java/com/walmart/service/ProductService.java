package com.walmart.service;

import java.util.List;

import com.walmart.model.Product;

public interface ProductService {

	public List<Product> getAllProducts();
	
	public List<Product> getAllProductByType(String name);
	
	public List<Product> getAllProductByRating(int rating);
	
	public List<Product> getAllProductByPrice(int price);
	
	
}
