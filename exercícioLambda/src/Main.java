/*Exercício focado em utilização de expressões lambdas
 * 
 * enunciado: 
 * Fazer um programa para ler os dados (nome, email e salário)
	de funcionários a partir de um arquivo em formato .csv.

	Em seguida mostrar, em ordem alfabética, o email dos
	funcionários cujo salário seja superior a um dado valor
	fornecido pelo usuário.

	Mostrar também a soma dos salários dos funcionários cujo
	nome começa com a letra 'M'.

	Veja exemplo na próxima página.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entites.Employee;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);
		List<Employee> emp = new ArrayList<>();
		String path = "C:\\ProjetosUdemy\\employee.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] vect = line.split(",");
				String name = vect[0];
				String email = vect[1];
				Double salary = Double.parseDouble(vect[2]);
				emp.add(new Employee(name,email,salary));
				line = br.readLine();
			}
			
			System.out.print("Enter the Salary: ");
			Double value = le.nextDouble();
			
			List<String> email = emp.stream()
			.filter(e -> e.getSalary() > value)
			.map(e -> e.getEmail())
			.sorted()
			.collect(Collectors.toList());
			
			email.forEach(System.out::println);
			
			Double sum = emp.stream()
					.filter(e -> e.getName().toUpperCase().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0.0 , (a,b) -> a + b);
			
			System.out.println("Sum of salary of people whose name starts with M: "+sum);
					
		}
		catch (IOException e){
			System.out.println("Error: "+e.getMessage());
		}
		
	
		
	}

}
