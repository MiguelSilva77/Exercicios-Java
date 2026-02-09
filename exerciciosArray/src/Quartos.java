
public class Quartos {
	private String nome; 
	private String email;
	private boolean ocupado;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	public String toString(){
		if(this.ocupado == false) {
			return "Quarto vaago";
		} else {
			return "Quarto ocupado, "
					+"Nome: "
					+getNome()
					+", Email: "
					+getEmail();
		}
	}

}
