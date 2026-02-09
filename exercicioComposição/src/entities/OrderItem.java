package entities;

public class OrderItem {
	private int quantity;
	private double price;
	
	private Product product;
	
	public OrderItem() {
	}

	public OrderItem(int quantity, Product product) {
		this.quantity = quantity;
		this.price = product.getPrice();
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}


	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	public double subTotal() {
		double sum = price * quantity;
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product);
		sb.append("Quantity: ");
		sb.append(getQuantity() + ", ");
		sb.append("Subtotal: $");
		sb.append(String.format("%.2f", subTotal()));
		return sb.toString();
	}
	
	
	
	
}
