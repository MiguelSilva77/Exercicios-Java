/*Exercicios exception
 * exercícios focados em tratamento de exception utilizando o método try catch*/



import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);
		
		System.out.println("Enter account data");

		try {
				System.out.print("Number account: ");
				int number = le.nextInt();
				le.nextLine();
				System.out.print("Holder: ");
				String holder = le.nextLine();
				System.out.print("Initial Balance: ");
				Double balance = le.nextDouble();
				System.out.print("Withdraw limit: ");
				Double withdraw = le.nextDouble();
				
				Account account = new Account(number, holder, balance, withdraw);
				
				System.out.print("Enter the amount of withdraw: ");
				Double amount = le.nextDouble();
				account.withdraw(amount);
			}
		
		catch (InputMismatchException e) {
			System.out.print("Invalid character");
		}
		catch (Exception e){
			System.out.print("Account Exception: "+e.getMessage());
		}
		
		
			
			
			
		
	}

}
