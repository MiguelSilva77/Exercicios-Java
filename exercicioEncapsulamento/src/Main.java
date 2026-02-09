import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);
		
		System.out.println("Vamos cadastrar sua conta");
		System.out.print("Cadastre o número da sua conta: ");
		int numero = le.nextInt();
		String zz = le.nextLine();
		
		System.out.print("Cadastre seu nome: ");
		String nome = le.nextLine();
		
		Conta conta = new Conta(numero, nome);
		
		System.out.print("Gostaria de fazer um deposito inicial? (s) (n): ");
		String decisao = le.next();
		
		int p = 1;
		while (p == 1) {
			switch (decisao) {
			case "s":
				System.out.print("Qual o valor do deposito? ");
				double deposito = le.nextDouble();
				conta.deposito(deposito);
				p = 2;
				break;
			case "n":
				conta.updatedConta();
				p = 2;
				break;
			default:
				System.out.println("caractere invalido, por favor digite novamente!!!");

			}
		}

		System.out.print("Entre com o valor do depósito: ");
		double deposito = le.nextDouble();
		conta.deposito(deposito);
		
		System.out.print("Entre com o valor do saque: ");
		double saque = le.nextDouble();
		conta.saque(saque);
		
		
		
		le.close();
		
		
	}

}
