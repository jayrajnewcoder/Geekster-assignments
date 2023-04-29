package com.example.User.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.User.DAO.User;
import com.example.User.Repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	
	List<User> list;
	public UserService() {
		list = Arrays.asList(new User(123l,"Diptesh" , "2022-01-08", "jayrajpawar001@gmail.com", "919637422297", "21-090-2312", "1214"));
	}
	
	public User getRestaurant(Long id) throws Exception {
		try {
			for(User users : list) {
				if (users.getUserId()==id){
					return users;
				}
			}
			return null;
		} catch (Exception e) {
			throw new Exception("Something went wrong while gettig order");
		
		}
	}
	
	public List<User> getAllRestaurants(){
		return list;
	}
	
	public String addRestaurant(User restaurant) {
		int size = list.size();
		list.add(restaurant);
		int asize = list.size();
		if (size!=asize) {
			return "Added";
		}else {
			return "Not added";
		}	
	}
	
	public User updateRestaurant(Long idString, User toBeUpdatedRestaurant) {
		User restaurant2 = null;
		for(User restaurant : list) {
			if (restaurant.getUserId()==idString){
				restaurant2 = restaurant;
			}
		}
		if (restaurant2==null) {
			return null;
		}
		restaurant2.setDate(toBeUpdatedRestaurant.getDate());
		restaurant2.setDateOfBirth(toBeUpdatedRestaurant.getDateOfBirth());
		restaurant2.setEmail(toBeUpdatedRestaurant.getEmail());
		restaurant2.setPhoneNumber(toBeUpdatedRestaurant.getPhoneNumber());
		restaurant2.setTime(toBeUpdatedRestaurant.getTime());
		restaurant2.setUserName(toBeUpdatedRestaurant.getUserName());

		return restaurant2;
	}
	
	public String deleteRestaurant(Long id) {
		for(User restaurant : list) {
			if (restaurant.getUserId()==id){
				list.remove(id);
			}
		}
		return "User with ID "+id+" is removed";
	}
}
