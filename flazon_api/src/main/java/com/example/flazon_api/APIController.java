package com.example.flazon_api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("flazon_db")
public class APIController {
	
	@Autowired
	public  static ProductRepositories productRepo;
	
	APIController(ProductRepositories productRepo){
		APIController.productRepo = productRepo;
	}
	
		
	@GetMapping("productsList")
	public List<Product> getListOfProducts() {
		return productRepo.findAll();
	}
	
	@GetMapping("productsList/{productId}")
	public Product getTheProductbyId(@PathVariable int productId) {
		return productRepo.findById(productId);
	}

	
}
