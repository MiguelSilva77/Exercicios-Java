package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment{
	
	private LocalDate dueDate;
	private double amount;
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	
	public Installment(LocalDate dueDate, double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(dueDate.format(fmt1));
		sb.append(" - ");
		sb.append(amount);
		return sb.toString();
		
	}
	
	
	
	
	
	
	

}
