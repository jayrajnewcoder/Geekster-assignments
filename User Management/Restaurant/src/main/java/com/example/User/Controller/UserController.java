package com.example.User.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.User.DAO.User;
import com.example.User.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	
	@GetMapping("/getUser/{userId}")
	private User getUser(@PathVariable("userId") Long userId) throws Exception {
		return service.getRestaurant(userId);
	}
	
	@GetMapping("/getAllUser")
	public List<User> getAllUser(){
		return service.getAllRestaurants();
	}
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		return service.addRestaurant(user);
	}
	
	@PutMapping("/updateUserInfo")
	public User updateUserInfo(@PathVariable("id") Long id,@RequestBody User restaurant ) {
		return service.updateRestaurant(id, restaurant);
	}
	
	@DeleteMapping("/deleteUser")
	public String deleteUser(@PathVariable("id") Long id) {
		return service.deleteRestaurant(id);
	}
}
