package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entities.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductServices {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product addOrUpdate(Product product) {
		return this.productRepository.save(product);
	}
	
	public boolean deleteById(int id) {
		
		this.productRepository.deleteById(id);
		return true;
	}
	public List<Product> getAllProduct(){
		return this.productRepository.findAll();
	}
	
	public Product getById(int id) {
		return this.productRepository.findById(id).get();
	}

}
