package com.Adresss.Adress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Adresss.Adress.model.Adress;
import com.Adresss.Adress.model.Order;
import com.Adresss.Adress.model.Product;
import com.Adresss.Adress.model.User;
import com.Adresss.Adress.repository.AdressRepository;
import com.Adresss.Adress.repository.OrderRepository;
import com.Adresss.Adress.repository.ProductRepository;
import com.Adresss.Adress.repository.UserRepository;

@Service
public class ApplicationService {

	@Autowired
	private AdressRepository adressRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public User addUser(User user) {
		userRepository.save(user);
		return user;
	}
	
	public Product addProduct(Product product) {
		productRepository.save(product);
		return product;
	}
	
	public Order placeOrder(Integer userId,Integer productId,Integer adressId) {
		User user = userRepository.findById(userId).get();
		Product product = productRepository.findById(productId).get();
		Adress adress = adressRepository.findById(adressId).get();
		Order order = new Order();
		order.setUser(user);
		order.setProduct(product);
		order.setAdress(adress);
		order.setProductQuantity(1200);
		orderRepository.save(order);
		return order;
	}
	
	public User getUser(Integer userId) {
		return userRepository.findById(userId).get();
	}
	
	public 	Order getOrder(Integer orderid) {
		return orderRepository.findById(orderid).get();
	}
	
	public String deleteProduct(Integer productId) {
		try {
			Product product = productRepository.findById(productId).get();
			productRepository.delete(product);
			return "SUCCESS";
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return "FAILED";
		}
	}
	
	public List<Product> getProductsBasedOnCategory(String category){
		return productRepository.findByCategory(category);
	}
}
