
public class Dados {
	private String nome;
	private double altura;
	private boolean genero;
	
	public Dados(String nome, double altura, boolean genero) {
		this.nome = nome;
		this.altura = altura;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setaltura(double altura) {
		this.altura = altura;
	}

	public boolean isGenero() {
		return genero;
	}

	public void setGenero(boolean genero) {
		this.genero = genero;
	}
	
	public String genero() {
		if(this.genero == false) {
			return "masculino";
		}else {
			return "feminino";
		}
	}
	
	
	public String toString() {
		return "Dados inseridos"
				+", Nome: "
				+getNome()
				+", Altura"
				+getAltura()
				+", Genero: "
				+genero();
		
	}
	

}
