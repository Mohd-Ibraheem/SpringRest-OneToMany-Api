package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entities.Brand;
import com.product.repository.BrandRepository;

@Service
public class BrandServices {
	
	@Autowired
	private BrandRepository brandRepository;
	
	public Brand saveBrand(Brand brand) {
		return this.brandRepository.save(brand);
	}
	
	public boolean deteleBrand(int id) {
		this.brandRepository.deleteById(id);
		return true;
	}
	public List<Brand> getAllBrand(){
		 return this.brandRepository.findAll();
	}
	
	public Brand getById(int id) {
		
		return this.brandRepository.findById(id).get();
	}

}
