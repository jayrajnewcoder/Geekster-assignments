# Framework Used : springboot
# Language Used : Java
# Data Flow :
 Controller : 
  private Restaurant getRestaurant(@PathVariable("id") String idString) -> Get the single restaurant by ID
  public List<Restaurant> getAllRestaurants() -> Get all the restaurants by ID
  public String addRestaurant(@RequestBody Restaurant restaurant) -> Add the restaurant in the list
  public Restaurant updateRestaurant(@PathVariable("id") String id,@RequestBody Restaurant restaurant ) -> Update the restaurant with the ID with the given restaurant by 
                                                                                                            Restaurant restaurant
  	public String deleteRestaurant(@PathVariable("id") String id) -> Delete the restaurant matched with the ID 
  
 
