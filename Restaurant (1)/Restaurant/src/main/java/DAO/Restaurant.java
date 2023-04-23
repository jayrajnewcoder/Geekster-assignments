package DAO;

public class Restaurant {
	
	private String id;
	
	private String restaurantName;
	
	private String restaurantAdress;
	
	private Double restaurantRating;

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String id, String restaurantName, String restaurantAdress, Double restaurantRating) {
		super();
		this.id = id;
		this.restaurantName = restaurantName;
		this.restaurantAdress = restaurantAdress;
		this.restaurantRating = restaurantRating;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantAdress() {
		return restaurantAdress;
	}

	public void setRestaurantAdress(String restaurantAdress) {
		this.restaurantAdress = restaurantAdress;
	}

	public Double getRestaurantRating() {
		return restaurantRating;
	}

	public void setRestaurantRating(Double restaurantRating) {
		this.restaurantRating = restaurantRating;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", restaurantName=" + restaurantName + ", restaurantAdress=" + restaurantAdress
				+ ", restaurantRating=" + restaurantRating + "]";
	}
	
	

}
