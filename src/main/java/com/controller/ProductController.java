package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String saveProudct(ProductEntity productEntity) { // bean //dto
		System.out.println(productEntity.getName());
		System.out.println(productEntity.getPrice());
		System.out.println(productEntity.getQty());

		productRepo.save(productEntity);

		return "NewProduct";
	}

	@GetMapping("/listproducts")
	public String listProducts(Model model) {

		List<ProductEntity> products = productRepo.findAll();
		model.addAttribute("list", products);
		return "ListProducts";
	}

	@GetMapping("/deleteproduct")
	public String deleteProduct(@RequestParam("productId") Integer productId) {
		productRepo.deleteById(productId);
		return "redirect:/listproducts";// jsp
	}

	@GetMapping("/viewproduct")
	public String viewProduct(@RequestParam("productId") Integer productId,Model model) {
		Optional<ProductEntity> productOptional = productRepo.findById(productId);

		if (productOptional.isPresent()) {
			ProductEntity product = productOptional.get();
			model.addAttribute("product",product);
			return "ViewProduct";
		} else {
			return "redirect:/listproducts";// jsp
		}

	}

}
