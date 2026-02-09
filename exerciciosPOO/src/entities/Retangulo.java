package entities;

public class Retangulo {
	public double largura;
	public double altura;
	
	public double area() {
		double area = largura * altura;
		return area;
		
	}
	
	public double perimetro() {
		double perimetro = largura + altura;
		return perimetro;
	}
	
	public double diagonal() {
		double diagonal = Math.sqrt((Math.pow(altura, 2)) + (Math.pow(largura, 2)));
		return diagonal;
	}
	
	

		
		
	}

