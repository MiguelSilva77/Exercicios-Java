
public class Conta {	
	private int numeroConta;
	private String nomeConta;
	private double saldoConta; 
	
	
	public Conta(int numeroConta, String nomeConta) {
		this.numeroConta = numeroConta;
		this.nomeConta = nomeConta;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getNomeConta() {
		return nomeConta;
	}
	
	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}
	
	public double getSaldoConta() {
		return saldoConta;
	}
	
	
	public double deposito(double valor) {
		this.saldoConta += valor;
		updatedConta();
		return getSaldoConta();
	}
	
	public void saque(double valor) {
		if (valor > this.saldoConta) {
			System.out.println("Saldo insuficiente!!");
			updatedConta();
		} else {
			this.saldoConta -= valor;
			this.saldoConta -= 5.00;
			updatedConta();
		}
	}
	
	public void updatedConta() {
		System.out.println("Atualição da conta");
		System.out.print("Número da conta: "+numeroConta);
		System.out.print(", Usuário da conta: "+nomeConta);
		System.out.println(", O saldo atual é: "+getSaldoConta());
		
	}
}
