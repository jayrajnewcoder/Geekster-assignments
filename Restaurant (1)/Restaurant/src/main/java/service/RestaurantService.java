package service;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.util.StringBuilderFormattable;
import org.hibernate.dialect.FirebirdDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.Restaurant;
import Repository.RestaurantRepository;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepository repository;
	
	List<Restaurant> list;
	public RestaurantService() {
		list = Arrays.asList(new Restaurant("123", "Restaurant1", "Mumbai", 3.2),
				new Restaurant("124", "Restaurant2", "Pune", 4.2),
				new Restaurant("125", "Restaurant3", "Ahemdabad", 3.8));
	}
	
	public Restaurant getRestaurant(String id) throws Exception {
		try {
			for(Restaurant restaurant : list) {
				if (restaurant.getId()==id){
					return restaurant;
				}
			}
			return null;
		} catch (Exception e) {
			throw new Exception("Something went wrong while gettig order");
		
		}
	}
	
	public List<Restaurant> getAllRestaurants(){
		return list;
	}
	
	public String addRestaurant(Restaurant restaurant) {
		int size = list.size();
		list.add(restaurant);
		int asize = list.size();
		if (size!=asize) {
			return "Added";
		}else {
			return "Not added";
		}	
	}
	
	public Restaurant updateRestaurant(String idString, Restaurant toBeUpdatedRestaurant) {
		Restaurant restaurant2 = null;
		for(Restaurant restaurant : list) {
			if (restaurant.getId()==idString){
				restaurant2 = restaurant;
			}
		}
		if (restaurant2==null) {
			return null;
		}
		restaurant2.setRestaurantAdress(toBeUpdatedRestaurant.getRestaurantAdress());
		restaurant2.setRestaurantName(toBeUpdatedRestaurant.getRestaurantName());
		restaurant2.setRestaurantRating(toBeUpdatedRestaurant.getRestaurantRating());
		return restaurant2;
	}
	
	public String deleteRestaurant(String id) {
		for(Restaurant restaurant : list) {
			if (restaurant.getId()==id){
				list.remove(id);
			}
		}
		return "Restaurant with ID "+id+" is removed";
	}

}
