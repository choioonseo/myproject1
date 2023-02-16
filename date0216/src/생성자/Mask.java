package 생성자;

public class Mask {
	
	String color;
	int price;
	int num;
	
	
	public Mask(String color, int price, int num) {
		this.color = color;
		this.price = price;
		this.num = num;
	}


	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", num=" + num + "]";
	}
	
	
	
}
