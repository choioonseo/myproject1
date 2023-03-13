package Team;

public class RestaurantVO {

	private int foodno;
	private String photo;
	private String name;
	private String location;
	private int score;
	private String 	category;
	
	public int getFoodno() {
		return foodno;
	}
	public void setFoodno(int foodno) {
		this.foodno = foodno;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "RestaurantVO [foodno=" + foodno + ", photo=" + photo + ", name=" + name + ", location=" + location
				+ ", score=" + score + ", category=" + category + "]";
	}
	
}