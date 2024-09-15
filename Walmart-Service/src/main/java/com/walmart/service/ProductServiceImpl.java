package com.walmart.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.walmart.dao.ProductRepo;
import com.walmart.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<Product> getAllProducts() {
		
		return productRepo.findAll();
	}

	@Override
	public List<Product> getAllProductByType(String name) {

		List<Product> list = productRepo.findAll();

		return list.stream().filter(obj -> obj.getProductType().equalsIgnoreCase(name)).collect(Collectors.toList());

	}

	@Override
	public List<Product> getAllProductByRating(int rating) {
		List<Product> list = productRepo.findAll();

		return null;
				//list.stream().filter(obj -> obj.getRating() == rating).collect(Collectors.toList());

	}

	@Override
	public List<Product> getAllProductByPrice(int price) {
		List<Product> list = productRepo.findAll();

		return list.stream().filter(obj -> obj.getPrice() <= price).collect(Collectors.toList());

	}

}
