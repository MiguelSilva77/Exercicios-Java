package exercicioAbstract;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyPerson;
import entities.IndividualPerson;
import entities.Person;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);
		List <Person> list = new ArrayList<>();
		
		
		System.out.print("Enter number of tax players: ");
		int n = le.nextInt();
		le.nextLine();
		
		for(int i = 0; i<n; i++) {
			System.out.println("Enter player #"+(i+1)+" data");
			System.out.print("Individual or company (i/c) ");
			char personType = le.next().charAt(0);
			le.nextLine();
			System.out.print("Name: ");
			String name = le.nextLine();
			System.out.print("Annual income: ");
			Double annualIncome = le.nextDouble();
			if(personType == 'i') {
				System.out.print("Health Spent: ");
				double healthSpent = le.nextDouble();
				Person person = new IndividualPerson(name, annualIncome, healthSpent);
				list.add(person);
				System.out.println();
			}else {
				System.out.print("Numbers of employee: ");
				int employeeNumber = le.nextInt();
				le.nextLine();
				Person person = new CompanyPerson(name, annualIncome, employeeNumber);
				list.add(person);
				System.out.println();
			}
		}
		
		Double totalTax = 0.0;
		
		System.out.println();
		System.out.println("Tax paid: ");
		for(Person p: list) {
			totalTax += p.calculateTax();
			System.out.println(p);
		}
		
		System.out.println("Total tax $"+totalTax);
	}

}
