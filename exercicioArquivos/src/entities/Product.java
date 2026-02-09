package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
	}

	public Product(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public double totalPrice() {
		double totalPrice = price * quantity;
		return totalPrice;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(", ");
		sb.append(String.format("%.2f",totalPrice()));
		return sb.toString();
	}
	
	
	
	
	

}
