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
import org.springframework.web.bind.annotation.RestController;

import com.product.entities.Brand;
import com.product.service.BrandServices;

@RestController
@RequestMapping("/brand")
public class BrandController {

	@Autowired
	private BrandServices brandServices;
	
	@PostMapping
	public Brand saveBrand(@RequestBody Brand brand) {
		return this.brandServices.saveBrand(brand);
	}
	@GetMapping
	public List<Brand> getAllBrand(){
		return this.brandServices.getAllBrand();
	}
	
	@PutMapping("/{id}")
	public Brand updateBrand(@PathVariable int id, @ModelAttribute Brand brand) {
		brand.setId(id);
		return this.brandServices.saveBrand(brand);
	}
	
	@DeleteMapping("/{id}")
	public boolean deteBrand(@PathVariable int id) {
		this.brandServices.deteleBrand(id);
		return true;
		
	}
	@GetMapping("/{id}")
	public Brand getSingleBrand(@PathVariable int id) {
		return this.brandServices.getById(id);
	}
	

}
