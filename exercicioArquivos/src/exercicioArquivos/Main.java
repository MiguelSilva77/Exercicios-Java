package exercicioArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		String path = "c:\\ProjetosUdemy\\file.txt" ;
		List<String> list = new ArrayList<>();
		Product product;
		List<Product> productList = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while(line != null) {
				list.add(line);
				line = br.readLine();
			}

		}
		catch (IOException e ){
			System.out.println("Error: "+ e.getMessage());
		}
		
		for(String e:list) {
			String[] products;
			products = e.split(",");
			String name = products[0];
			double price = Double.parseDouble(products[1]);
			int quantity = Integer.parseInt(products[2]);
			product = new Product(name,price,quantity);
			productList.add(product);
			
		}
		
		String pathOut = "c:\\ProjetosUdemy\\fileOut.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut))){
			for(Product p :productList) {
				bw.write(p.toString());
				bw.newLine();
			}
		}
		catch (IOException e ){
			System.out.println("Error: "+ e.getMessage());
		}
	}

}
