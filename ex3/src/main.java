/* exercicios de estrutura condicional
*/

import java.util.Scanner;

public static void main(String[]args) {
	 Scanner le = new Scanner(System.in);
	 System.out.print("Digite um número: ");
	 int x = le.nextInt();
	 String dia = "";
	 
	 switch(x){
		 case 1: dia = "Domingo" ; break;
		 case 2: dia = "Segunda" ; break;
		 case 3: dia = "Terça" ; break;
		 case 4: dia = "Quarta" ; break;
		 case 5: dia = "Quinta" ; break;
		 case 6: dia = "Sexta" ; break;
		 case 7: dia = "Sabado" ; break;
		 default: dia = "Valor inválido"; break;
		 }
	 
	 System.out.println("O dia é  "+dia);
	 
	 
		
	 
		
		 
		 
	 }




/* exercicio 1 
 * System.out.print("Digite um número: ");; int x = le.nextInt();
 * 
 * if(x>=0) { System.out.print("O número é positivo"); } else {
 * System.out.print("O número é negativo"); }
 */


/* exercicio 2 
 * System.out.print("Digite um número: "); int x = le.nextInt();
 * 
 * if (x % 2 == 0) { System.out.print("O número é par"); }else {
 * System.out.print("o número é impar"); }
 */


/*
 * exercicio 3
 * System.out.print("Digite o primeiro número: "); int x = le.nextInt();
 * System.out.print("Digite o segundo número: "); int y = le.nextInt();
 * 
 * if(x % y == 0 || y % x == 0) { System.out.print(x + " e " + y +
 * " São multiplos "); } else { System.out.print(x + " e " + y +
 * " Não são multiplos ");
 * 
 * }
 */



/*
 * exercicio 4 
 * Scanner le = new Scanner(System.in);
 * System.out.print("Digite a hora inicial: "); int x = le.nextInt();
 * System.out.print("Digite a hora final: "); int y = le.nextInt(); int result;
 * 
 * if (x < y) { result = y - x; } else { result = (y + 24) - x; }
 * 
 * System.out.println("O jogo durou "+result+ " horas");
 */


/*
 * exercicio 5 
 * double cachoQuente = 4.00; double xSala = 4.50; double xBac = 5.00; double
 * torra = 2.50; double refri = 1.00; double result;
 * 
 * System.out.print("Digite o código do produto: "); int cod = le.nextInt();
 * System.out.print("Digite a quantidade de produtos: "); int qtd =
 * le.nextInt();
 * 
 * if(cod == 1) { result = cachoQuente * qtd; } else if(cod == 2) { result =
 * xSala * qtd; } else if(cod == 3) { result = xBac * qtd; }else if(cod == 4) {
 * result = torra * qtd; }else { result = refri * qtd; }
 * 
 * System.out.printf("O preço total é R$%.2f",result);
 */


/*
 * exercicio 6
 * System.out.print("Digite um valor: "); double x = le.nextDouble();
 * 
 * if(x >= 0.0 && x <= 25.0) {
 * System.out.println("O valor está no intervalo [0, 25]"); } else if(x > 25.0
 * && x <= 50.0) { System.out.println("O valor está no intervalo [25, 50]"); }
 * else if(x > 50.0 && x <= 75.0) {
 * System.out.println("O valor está no intervalo [50, 75]"); } else if(x > 75.0
 * && x <= 100.0) { System.out.println("O valor está no intervalo [75, 100]"); }
 * else { System.out.println("O valor está fora do intervalo"); }
 */

/*
 * exercicio 7
 * System.out.print("Digite as coordenadas de x: "); double x = le.nextDouble();
 * System.out.print("Digite as coordenadas de y: "); double y = le.nextDouble();
 * 
 * if (x > 0.0 && y > 0.0) { System.out.print("As coordenadas estão no Q1"); }
 * else if (x < 0.0 && y > 0.0) {
 * System.out.print("As coordenadas estâo no Q2"); } else if (x < 0.0 && y <
 * 0.0) { System.out.print("As coordenadas estão no Q3"); } else if (x > 0.0 &&
 * y < 0.0) { System.out.print("As coordenadas estão no Q4"); } else {
 * System.out.print("As coordenadas esão na origem"); }
 */


/*
 * exercicio 8
 * System.out.print("Digite seu salário: "); double salario = le.nextDouble();
 * double imposto = 0.0;
 * 
 * if(salario < 2000.0) { imposto = 0.0; } else if (salario <= 3000.0) { imposto
 * = (salario - 2000.0) *0.08; } else if (salario <= 4500.0) { imposto =
 * (salario - 3000.0) *0.18 + (1000.0 * 0.08); } else if (salario > 4500.0) {
 * imposto = (salario - 4500.0) * 0.28 + (1500.0 * 0.18) + (1000.0 * 0.08); }
 * 
 * if(imposto <= 0.0) {
 * System.out.println("Parabés você não precisa pagar porra nenhuma KRL"); }
 * else { System.out.printf("Si fudeu!!!!! vai ter que pagar R$%.2f de imposto "
 * ,imposto); }
 */




