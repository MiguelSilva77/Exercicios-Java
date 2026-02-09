package exerciciosPOO;

import java.util.Locale;
import java.util.Scanner;
//import entities.Retangulo;
//import entities.Funcionario;
//import entities.Aluno;
import util.ConversorDeMoeda;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);
		System.out.print("Digite o valor do dolar: ");
		double dolar = le.nextDouble();
		System.out.print("Digite a quatidade de dolares: ");
		double quatidade = le.nextDouble();
		
		double valor = ConversorDeMoeda.valor(dolar, quatidade);
		double iof = ConversorDeMoeda.iof(valor);
		double total = ConversorDeMoeda.total(valor, iof);
		
		
		 System.out.println("O total a pagar é R$: "+total);
		 System.out.println("sendo que R$: "+iof+ " vai diretamente para o governo");
		 
		
		
		
		
		
		
		
		
		
		
		le.close();
	}

}




/*
 *exercicio 1 
 * Retangulo retangulo = new Retangulo();
 * System.out.print("Digite o valor da largura: "); retangulo.largura =
 * le.nextDouble(); System.out.print("Digite o valor da altura: ");
 * retangulo.altura = le.nextDouble();
 * 
 * System.out.println(retangulo.area());
 * System.out.println(retangulo.perimetro());
 * System.out.println(retangulo.diagonal());
 */


/*
* exercicio 2
 * Funcionario funcionario = new Funcionario();
 * System.out.println("Digite os dados do funcionário");
 * System.out.print("Nome: "); funcionario.nome = le.nextLine();
 * System.out.print("salario: "); funcionario.salario = le.nextDouble();
 * 
 * funcionario.dados();
 * 
 * System.out.print("Digite a porcentagem de aumento de salário: "); double
 * porcentagem = le.nextDouble(); funcionario.aumentaSalario(porcentagem);
 * funcionario.dados();
 */



/*
*
*exercicio 3
*System.out.println("Digite as informações do aluno"); Aluno aluno = new
* Aluno(); System.out.print("Nome: "); aluno.nome = le.nextLine();
* System.out.print("nota 1: "); aluno.nota1 = le.nextDouble();
* System.out.print("nota 2: "); aluno.nota2 = le.nextDouble();
* System.out.print("nota 3: "); aluno.nota3 = le.nextDouble();


aluno.passou();
*/