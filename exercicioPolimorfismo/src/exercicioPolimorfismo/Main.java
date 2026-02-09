/*Ecer´ccio sobre Polimorfismo
 * enunciado: fazer um programa para ler dados de n produtos e exibir a etiqueta de preço de cada um
 * todo produto possui nome e preço, os importados possuem taxa de alfandega e os usados poissuem 
 * data de fabricação. estes dados devem ser colocados na etiueta do produto.*/


package exercicioPolimorfismo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>(); 
		
		System.out.print("Enter the number of products: ");
		int n = le.nextInt();
		le.nextLine();
		
		for(int i = 0; i<n; i++) {
			System.out.println("product #"+(i+1)+" data:");
			System.out.print("Commom, used or import: (c/u/i) ");
			char decision = le.next().charAt(0);
			System.out.print("Name: ");
			String name = le.next();
			System.out.print("price: ");
			double price = le.nextDouble();
			if(decision == 'c') {
				Product product = new Product(name, price);
				list.add(product);
			}else if (decision == 'i') {
				System.out.print("customs fee: ");
				double customsFee = le.nextDouble();
				Product product = new ImportProduct(name, price, customsFee);
				list.add(product);
			}else {
				System.out.print("Manufacture Date (dd/MM/yyyy) ");
				String manufactureDate = le.next(); 
				LocalDate data = LocalDate.parse(manufactureDate, fmt1);
				Product product = new UsedProduct(name, price, data);
				list.add(product);
				
			}
		}
		
		for (Product p: list) {
			System.out.println(p.priceTag());
		}
	}

}
