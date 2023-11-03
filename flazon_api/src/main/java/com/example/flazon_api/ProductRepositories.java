package com.example.flazon_api;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositories extends JpaRepository<Product,Long>{
	
	public List<Product> findAll();
	
	public Product findById(int productId);
	
	
	

}
