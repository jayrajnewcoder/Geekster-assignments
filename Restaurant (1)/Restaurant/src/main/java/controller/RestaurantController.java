package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DAO.Restaurant;
import service.RestaurantService;

@RestController
@RequestMapping(path = "/api")
public class RestaurantController {

	
	@Autowired
	private RestaurantService service;
	
	@GetMapping("/getRestaurant")
	private Restaurant getRestaurant(@PathVariable("id") String idString) throws Exception {
		return service.getRestaurant(idString);
	}
	
	@GetMapping("/getAllRestaurant")
	public List<Restaurant> getAllRestaurants(){
		return service.getAllRestaurants();
	}
	
	@PostMapping("/addRestaurant")
	public String addRestaurant(@RequestBody Restaurant restaurant) {
		return service.addRestaurant(restaurant);
	}
	
	@PutMapping("/updateRestaurant")
	public Restaurant updateRestaurant(@PathVariable("id") String id,@RequestBody Restaurant restaurant ) {
		return service.updateRestaurant(id, restaurant);
	}
	
	@DeleteMapping("/deleteRestaurant")
	public String deleteRestaurant(@PathVariable("id") String id) {
		return service.deleteRestaurant(id);
	}
	
	
}
