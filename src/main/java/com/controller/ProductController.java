package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.ProductEntity;
import com.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	ProductRepository productRepo;
	
	@GetMapping("/newproduct")
	public String newProduct() {
		System.out.println("ProductController::newProduct()");
		return "NewProduct";
	}
	
	@PostMapping("/saveproduct")
	public String saveProudct(ProductEntity productEntity) {
		System.out.println(productEntity.getName());
		System.out.println(productEntity.getPrice());
		System.out.println(productEntity.getQty());
		
		productRepo.save(productEntity);
		
		return "NewProduct"; 
	}
}
