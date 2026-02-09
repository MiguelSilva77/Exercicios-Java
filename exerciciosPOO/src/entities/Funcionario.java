package entities;

public class Funcionario {
	public String nome;
	public double salario;
	public double imposto = 1000.00;
	
	public void dados() {
		System.out.println("Funcionário: " + nome + ", R$: "+(salario - imposto));
	}
	
	public double aumentaSalario(double porcentagem) {
		salario += salario * (porcentagem / 100.00);
		return salario;
	}	
}
