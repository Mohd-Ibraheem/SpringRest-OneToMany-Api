package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.entities.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
	

}
