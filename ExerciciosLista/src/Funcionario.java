
public class Funcionario {
	private int id;
	private String name;
	private double salario;
	
	public Funcionario(int id, String name, double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public double getSalario() {
		return salario;
	}
	
	public void aumentaSalario(double aumento) {
		salario += salario * aumento / 100;
	}
	
	public String toString() {
		return "ID : "
				+getId()
				+"\n"
				+"nome: "
				+getName()
				+"\n"
				+"salario"
				+getSalario()
				+"%n";
	}

}
