// exercicios de estrutura de repetição

public static void main(String[]args) {
	Scanner le = new Scanner(System.in);
	int result = 1;
	int n = le.nextInt();
	for(int i = 1; i <= n; i++) {
		result *= i;
	}
	System.out.println(result);
	
	
	
	
}







/*ex 1 
 * int senha = 2002; int x = le.nextInt();
 * 
 * 
 * while (x != 2002) { System.out.println("Acesso Negado"); x = le.nextInt();
 * 
 * }
 * 
 * System.out.println("Acesso Autorizado");
 */



/* 
 *ex 2
 * int x = le.nextInt(); int y = le.nextInt();
 * 
 * while (x != 0 && y != 0) {
 * 
 * if (x > 0 && y > 0) { System.out.println("Primeiro quadrante"); } else if (x
 * < 0 && y > 0) { System.out.println("Segundo quadrante"); } else if (x < 0 &&
 * y < 0) { System.out.println("Terceiro quadrante"); } else {
 * System.out.println("Quarto quadrante"); }
 * 
 * x = le.nextInt(); y = le.nextInt();
 * 
 * }
 */



/*
 * 
 *exercicio 3
 * int gasolina = 0; int alcool = 0; int disel = 0; int x = le.nextInt();
 * 
 * while(x != 4) { switch(x) { case 1: gasolina++ ; break; case 2: alcool++ ;
 * break; case 3: disel++ ; break; default:
 * System.out.println("Digite um código válido"); break; } x = le.nextInt();
 * 
 * } System.out.println("Muito Obrigado");
 * System.out.println("Gasolina: "+gasolina);
 * System.out.println("Alcool: "+alcool); System.out.println("Disel: "+disel);
 */  



/* ex 4 
 * int x = le.nextInt();
 * 
 * for(int i = 0; i <= x; i++) { if(i % 2 == 1) { System.out.println(i); } }
 */





/*
 * ex 5 
 * int n = le.nextInt(); int in = 0; int out = 0;
 * 
 * for(int i = 0; i < n; i++) { int y = le.nextInt(); if(y >= 10 && y <= 20) {
 * in++; }else { out++; }
 * 
 * }
 * 
 * System.out.println("IN: "+in); System.out.println("OUT: "+out);
 */



/*
 * ex 6
 * int n = le.nextInt();
 * 
 * for(int i = 0; i < n; i++) { double a = le.nextDouble(); double b =
 * le.nextDouble(); double c = le.nextDouble(); double media = ((a * 2.0) + (b *
 * 3.0) + (c * 5.0)) / 10; System.out.printf("%.1f",media); }
 */


/*
 * ex 7
 * int n = le.nextInt(); int i = 0; for (i = 1; i <= n; i++) { if(n % i == 0) {
 * System.out.println(i); } }
 */


/*
 * ex 8
 * int n = le.nextInt(); for(int i = 1; i <= n; i++) { System.out.print(i +" ");
 * System.out.print(Math.pow(i, 2)+" "); System.out.println(Math.pow(i, 3));
 * 
 * }
 * 
 */


/*
 * ex 9
 * for(int i = 0; i < n; i++) { int a = le.nextInt(); int b = le.nextInt(); if
 * (b != 0) { double result = (double) a / b; System.out.printf("%.1f",result);
 * }else { System.out.println("Divisão impossível"); } }
 */