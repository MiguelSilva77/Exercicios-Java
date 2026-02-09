package entities;

public class ImportProduct extends Product {
	private Double customsFee;


	public ImportProduct() {
		super();
	}


	public ImportProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}


	public Double getCustomsFee() {
		return customsFee;
	}


	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	
	public Double totalPrice() {
		double totalPrice = price + customsFee;
		return totalPrice;
	}
	
	@Override
	public String priceTag(){
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" $ ");
		sb.append(String.format("%.2f",totalPrice()));
		sb.append(" (Custons fee: $");
		sb.append(String.format("%.2f", customsFee));
		sb.append(")");
		return sb.toString();
		
		
	}
	
	
}