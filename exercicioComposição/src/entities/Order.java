package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.Enum.OrderStatus;

public class Order {
	private LocalDateTime moment;
	private OrderStatus status;
	
	private Client client;
	private List <OrderItem> itens = new ArrayList<>(); 
	
	
	
	

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItens() {
		return itens;
	}

	public void additem(OrderItem iten) {
		itens.add(iten);
	}
	
	public void removeItem(OrderItem iten){
		itens.remove(iten);
	}
	
	public double totalValue() {
		double sum = 0.0;
		for (OrderItem it: itens) {
			sum += it.subTotal();
			}
		return sum;
	}
	
	DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMARY\n");
		sb.append("ORDER MOMENT : ");
		sb.append(moment.format(fmt2) +"\n");
		sb.append("ORDER STATUS : ");
		sb.append(status + "\n");
		sb.append(client +"\n");
		sb.append("ORDER ITENS \n");
		for (OrderItem it: itens) {
			sb.append(it + "\n");
		}
		sb.append("Total Price: $");
		sb.append(String.format("%.2f", totalValue()));
		return sb.toString();
	}
	
}
