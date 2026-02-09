package entities;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public void passou(){
		double notaTotal = nota1 + nota2 + nota3;
		if (notaTotal  > 60.00) {
			System.out.println(nome);
			System.out.println("Passou com "+notaTotal);
		}else {
			System.out.println(nome);
			System.out.println("Não passou "+notaTotal);
			System.out.println("Faltaram "+(60.00 - notaTotal));
			
		}
		
	}
	
}
