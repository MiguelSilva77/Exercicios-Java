// exercicio para scan (ler teclado)
import java.util.Scanner;
public static void main(String[]args) {
	Scanner le = new Scanner(System.in);
	double pi = 3.14159;

	System.out.print("Digite os valors: ");
	double a = le.nextDouble();
	double b = le.nextDouble();
	double c = le.nextDouble();
	
	double triangulo = (a * c)/2;
	double circulo = pi * (Math.pow(c,2));
	double trapezio = ((a+b)*c)/2;
	double quadrado = Math.pow(b,2);
	double retangulo = a * b; 
	
	System.out.println("Triangulo: "+triangulo);
	System.out.println("Circulo: "+circulo);
	System.out.println("Trapezio: "+trapezio);
	System.out.println("Quadrado: " +quadrado);
	System.out.println("Retangulo: " +retangulo);

	
	
	
	
	

	
	
}



//exercicio 1
/*Scanner le = new Scanner(System.in);
System.out.print("Digite o primeiro valor: ");
int x = le.nextInt();
System.out.print("Digite o segundo valor: ");
int y = le.nextInt();
int resultado = x + y;
System.out.printf("A soma de %d e %d é %d",x,y,resultado);*/


// exercício 2
/*double pi = 3.14159;
System.out.print("Digite o valor do raio de um circulo: ");
double raio = le.nextDouble();
double area = pi * (Math.pow(raio,2));
System.out.println("A area do circulo é "+area);*/


// exercicio 3
/*System.out.print("Digite primeiro o valor:");
int a = le.nextInt();
System.out.print("Digite segundo o valor:");
int b = le.nextInt();
System.out.print("Digite terceiro o valor:");
int c = le.nextInt();
System.out.print("Digite quarto o valor:");
int d = le.nextInt();

int resultado = (a*b) - (c*d);
System.out.println("o resultado é: "+resultado);*/


/*
 * exercicio 4
 * System.out.print("Digite o código do funcionário: "); int code =
 * le.nextInt(); System.out.print("Digite as horas do funcionário: "); double
 * horas = le.nextDouble();
 * System.out.print("Digite o valor da hora do funcionário: "); double valor =
 * le.nextDouble(); double salario = horas * valor;
 * System.out.println("Funcionário "+code);
 * System.out.println("salario = U$"+salario);
 */




/*
 * exercicio 5
 * System.out.println("Digite as infromações da peça: "); int code =
 * le.nextInt(); int qtd = le.nextInt(); double preco = le.nextDouble(); double
 * result = (double) preco * qtd;
 * 
 * System.out.println("Digite as infromações da peça 2: "); int code1 =
 * le.nextInt(); int qtd1 = le.nextInt(); double preco1 = le.nextDouble();
 * double result1 = (double) preco1 * qtd1;
 * 
 * double resultTotal = result + result1;
 * 
 * System.out.println("O valor total é "+resultTotal);
 */

