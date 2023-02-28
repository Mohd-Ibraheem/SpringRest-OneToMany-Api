package com.product.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String category_1;
	private String category_2;
	private String category_3;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory_1() {
		return category_1;
	}
	public void setCategory_1(String category_1) {
		this.category_1 = category_1;
	}
	public String getCategory_2() {
		return category_2;
	}
	public void setCategory_2(String category_2) {
		this.category_2 = category_2;
	}
	public String getCategory_3() {
		return category_3;
	}
	public void setCategory_3(String category_3) {
		this.category_3 = category_3;
	}
	public Brand(int id, String category_1, String category_2, String category_3) {
		super();
		this.id = id;
		this.category_1 = category_1;
		this.category_2 = category_2;
		this.category_3 = category_3;
	}
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Brand [id=" + id + ", category_1=" + category_1 + ", category_2=" + category_2 + ", category_3="
				+ category_3 + "]";
	}
	
	
	

}
