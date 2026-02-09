package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private int number; 
	private LocalDate data;
	private double totalValue;
	
	public Contract(){
	}
	
	public Contract(int number, LocalDate data, double totalValue) {
		this.number = number;
		this.data = data;
		this.totalValue = totalValue;
	}
	
	List<Installment> installments = new ArrayList<>();
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	
	public List<Installment> getLista(){
		return installments;
	}
	
	
	
}
