/*Execício para treinamento dos fundamentos de composição e enumerado
 * 
 * Enunciado : Faça um programa para ler os dados do cliente, após isso ler os dados de um 
 * pedido com N items (n informado pelo usuário). depois mostrar o sumário do pedido.
 * */



package exercicioComposição;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.Enum.OrderStatus;


public class Main {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter client data");
		System.out.print("Name: ");
		String name = le.nextLine();
		System.out.print("Email: ");
		String email = le.nextLine();
		System.out.print("Birth date: ");
		String birthDate = le.nextLine();
		LocalDate data = LocalDate.parse(birthDate, fmt1);
		Client client = new Client(name, email, data);
		System.out.println("");
		
		System.out.println("enter the order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(le.nextLine().toUpperCase());
		
		System.out.print("How many items to this order:  ");
		int n = le.nextInt();
		le.nextLine();
		System.out.println("");

		
		LocalDateTime dataCompra = LocalDateTime.now();
		
		Order order = new Order(dataCompra, status, client);
		
		for(int i = 0; i<n; i++) {
			System.out.println("Enter the #"+(i+1)+" item data");
			System.out.print("Product name: ");
			String nameProduct = le.nextLine();
			System.out.print("product price: ");
			double priceProduct = le.nextDouble();
			System.out.print("Quantity: ");
			int quantity = le.nextInt();
			le.nextLine();
			Product product;
			OrderItem item = new OrderItem(quantity, product = new Product(nameProduct, priceProduct) );
			order.additem(item);
			System.out.println("");

			
		}
		
		System.out.println("Order sumary: ");
		System.out.println(order);
		
	}

}
