package com.example.flazon_api;

import jakarta.persistence.*;

@Entity
@Table(name= "product")
public class Product {

	@Id 	
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id; 
	
	private int cost;
	
	private String name;
	
	private int discount; 
	
	
	private String product_Image_url; 
	
	private int category_id;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getProduct_Image_url() {
		return product_Image_url;
	}

	public void setProduct_Image_url(String product_Image_url) {
		this.product_Image_url = product_Image_url;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
