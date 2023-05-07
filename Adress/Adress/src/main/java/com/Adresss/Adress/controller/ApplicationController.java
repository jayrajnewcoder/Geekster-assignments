package com.Adresss.Adress.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Adresss.Adress.model.Order;
import com.Adresss.Adress.model.Product;
import com.Adresss.Adress.model.User;
import com.Adresss.Adress.service.ApplicationService;

@RestController
@RequestMapping(path="/api/")
public class ApplicationController {
	
	@Autowired
	private ApplicationService applicationService;
	
	@GetMapping("getOrder/{id}")
	private Order getOrder(@PathVariable("id") Integer orderId) {
		return applicationService.getOrder(orderId);
	}
	
	@GetMapping("getUser/{id}")
	private User getUser(@PathVariable("id") Integer userId) {
		return applicationService.getUser(userId);
	}

	@PostMapping("createUser")
	private User createUser(@RequestBody User user) {
		return applicationService.addUser(user);
	}
	
	@PostMapping("addProduct")
	private Product creteProduct(@RequestBody Product product) {
		return applicationService.addProduct(product);
	}
	
	@PostMapping("placeOrder/{uid}/{pid}/{aid}")
	private Order placeOrder(@PathVariable("uid") Integer userId,@PathVariable("pid") Integer productId,@PathVariable("aid") Integer adressId) {
		return applicationService.placeOrder(userId, productId, adressId);
	}
	
	@DeleteMapping("deleteProduct/{id}")
	private String deleteproduct(@PathVariable("id") Integer productid) {
		return applicationService.deleteProduct(productid);
	}
	
	@GetMapping("getProducts/{category}")
	private List<Product> getProductsByCategory(@PathVariable("category") String category){
		return applicationService.getProductsBasedOnCategory(category);
	}
}
