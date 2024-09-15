package com.walmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.model.Product;
import com.walmart.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(value="/getAllProducts")
	public List<Product> getAllProducts(){
		
		List<Product> allProducts = productService.getAllProducts();
	
		return allProducts;
	}
	
	@GetMapping("/getAllProductByType/{name}")
	public ResponseEntity<List<Product>> getAllProductByType(@PathVariable String name){
	
		List<Product> list = productService.getAllProductByType(name);
		
		if(list.size()>0) {
			return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<List<Product>>(list, HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping("/getAllProductByRating/{rating}")
	public ResponseEntity<List<Product>> getAllProductByRating(@PathVariable String rating){
		
		try {
			int rate=Integer.parseInt(rating);
			
		} catch (Exception e) {
			return new ResponseEntity(null, HttpStatus.NOT_ACCEPTABLE);
		}
		
		return null;
	}
	
	@GetMapping(value="/getAllProductByPrice/{price}")
	public ResponseEntity<List<Product>> getAllProductByPrice(@PathVariable String price){
		
		try {
			int rate=(int)Double.parseDouble(price);
			
		} catch (Exception e) {
			return new ResponseEntity(null, HttpStatus.NOT_ACCEPTABLE);
		}
		
		return null;
	}
	

}
