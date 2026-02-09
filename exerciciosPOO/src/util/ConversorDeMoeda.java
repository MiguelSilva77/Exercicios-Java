package util;

public class ConversorDeMoeda {
	
	public static double valor(double dolar, double quatidade) {
		double valor = dolar * quatidade;
		return valor;
	}
	
	public static double iof(double valor) {
		double iof = valor * 0.06;
		return iof;
	}
	
	public static double total (double valor, double iof) {
		double total = valor + iof;
		return total;
	}
}
