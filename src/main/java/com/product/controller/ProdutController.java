package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entities.Product;
import com.product.service.ProductServices;
@RestController
@RequestMapping("/product")
public class ProdutController {

	@Autowired
	private ProductServices productServices;
	
	@PostMapping
	public Product saveProduct(@RequestBody Product product) {
		return this.productServices.addOrUpdate(product);
	}
	@GetMapping
	public List<Product> getAllProduct(){
		return this.productServices.getAllProduct();
	}
	
	@PutMapping("/{id}")
	public Product updateProdut(@PathVariable int id, @ModelAttribute Product product) {
		product.setId(id);
		return this.productServices.addOrUpdate(product);
	}
	
	@DeleteMapping("/{id}")
	public boolean deteProduct(@PathVariable int id) {
		this.productServices.deleteById(id);
		return true;
		
	}
	@GetMapping("/{id}")
	public Product getSingleProduct(@PathVariable int id) {
		return this.productServices.getById(id);
	}
	
}
