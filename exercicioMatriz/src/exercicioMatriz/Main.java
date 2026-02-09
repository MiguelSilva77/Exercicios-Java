package exercicioMatriz;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);
		
		System.out.print("Digite quantas linhas terá a matriz: ");
		int n = le.nextInt();
		System.out.print("Digite quantas colunas terá a matriz: ");
		int m = le.nextInt();
		le.nextLine();
		
		int[][] mat = new int[n][m];
		
		System.out.println("Digite os números da matriz");
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				mat[i][j] = le.nextInt();
			}
		}
		
		System.out.println("Digite um número para procurar na matriz: ");
		int procura = le.nextInt();
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if(mat[i][j] == procura) {
					System.out.println("Posição do número "+procura+ " "+i+","+j);
					if(i > 0) {
						System.out.println("cima "+mat[i-1][j]);
					}
					if(j <m-1) {
						System.out.println("direita "+mat[i][j+1]);
					}
					if(i <n-1) {
						System.out.println("baixo "+mat[i+1][j]);
					}
					if(j > 0) {
						System.out.println("esquerda "+mat[i][j-1]);

					}



				}
			}
		}
	

	}

}
