import java.util.Scanner;


import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);
		System.out.print("quantas pessoas alugarão os quartos ");
		int n = le.nextInt();
		le.nextLine();
		
		Quartos[] vet = new Quartos[10];
		
		for(int i = 0;i<vet.length; i++) {
			vet[i] = new Quartos();
		}
		
		for(int i = 0; i < n; i++ ) {
			System.out.print("qual o nome do ocupante: ");
			String nome = le.nextLine();
			System.out.print("qual email do ocupante: ");
			String email = le.nextLine();
			System.out.print("Qual quarto o ocupante vai ocupar: ");
			int quarto = le.nextInt();
			le.nextLine();
			vet[quarto].setNome(nome);
			vet[quarto].setEmail(email);
			vet[quarto].setOcupado(true);
		}

		
		for(int i = 0;i<vet.length; i++) {
			System.out.printf("\nQuarto n°%d\n",i);
			System.out.print(vet[i]);
			System.out.printf("%n");
			
		}
	
		
		
				
		
		
				
		le.close();
		
	}

}


/*
 *exercicio 1 
 * System.out.print("Digite quantos números deseja ler: "); int n =
 * le.nextInt(); int[] numeros = new int[n];
 * 
 * for(int i = 0; i<numeros.length; i++) {
 * System.out.print("Digite um número: "); numeros[i] = le.nextInt(); }
 * 
 * for(int i = 0; i<numeros.length; i++) { if (numeros[i] < 0) {
 * System.out.println(numeros[i]); } }
 */



/*
 * exercicio 2 
 * System.out.print("Quantos números deseja escrever: "); int n = le.nextInt();
 * 
 * double[] numeros = new double[n]; for(int i = 0; i < numeros.length; i++) {
 * System.out.print("Digite um número: "); numeros[i] = le.nextDouble(); }
 * 
 * for(int i = 0; i < numeros.length; i++) { System.out.print(" " +numeros[i] +
 * " "); } System.out.println(" "); double soma = 0; for(int i = 0; i <
 * numeros.length; i++) { soma += numeros[i]; }
 * System.out.println("A soma dos números é: "+soma);
 * 
 * double media = soma / n;
 * 
 * System.out.println("A média dos números é: "+media);
 */




/*
 *ex 3
 * System.out.print("Digite a qauntidade de pessoas: "); int n = le.nextInt();
 * Pessoas[] pessoas = new Pessoas[n];
 * 
 * for (int i = 0; i < pessoas.length ; i++) {
 * System.out.print("Digite o nome: "); le.nextLine(); String nome =
 * le.nextLine(); System.out.print("Digite a idade: "); int idade =
 * le.nextInt(); System.out.print("Digite a altura: "); double altura =
 * le.nextDouble(); pessoas [i] = new Pessoas(nome, idade, altura); }
 * 
 * for (int i = 0; i <pessoas.length ; i++) { System.out.println(pessoas[i]); }
 * 
 * double media = 0.00;
 * 
 * for (int i = 0; i <pessoas.length ; i++) { media += pessoas[i].getAltura(); }
 * media /= n; System.out.printf("A altura média é: %.2f\n",media);
 * 
 * int menores = 0; for (int i = 0; i <pessoas.length ; i++) {
 * if(pessoas[i].getIdade() <= 16) { menores++; } }
 * 
 * double aux = ((double) menores / n) * 100;
 * 
 * 
 * System.out.printf("Os menores de 16 anos são %.2f%%\n",aux);
 * System.out.println("os menores são");
 * 
 * for (int i = 0; i <pessoas.length ; i++) { if(pessoas[i].getIdade() <= 16) {
 * System.out.println(pessoas[i]); } }
 */


/*
 * exercicio 4 
 * int n = le.nextInt(); int[] numeros = new int[n];
 * 
 * for(int i = 0; i < numeros.length ; i++) { numeros[i] = le.nextInt(); }
 * 
 * for(int i = 0; i < numeros.length ; i++) {
 * System.out.println("Número digitado: "+numeros[i]); }
 * 
 * System.out.println("Números pares"); for(int i = 0; i < numeros.length ; i++)
 * { if(numeros[i] % 2 == 0) { System.out.print(" "+numeros[i]+" "); } }
 */


/*
 *exercicio 5 
 * int n = le.nextInt();
 * 
 * double[] numeros = new double[n];
 * 
 * for (int i = 0; i < numeros.length; i++) { numeros[i] = le.nextDouble(); }
 * System.out.println("Numerps digitados"); for (int i = 0; i < numeros.length;
 * i++) { System.out.printf("Número %.2f\n",numeros[i]); }
 * 
 * double aux = numeros[0]; int posmaior = 0; for (int i = 0; i <
 * numeros.length; i++) { if(numeros[i] > aux) { aux = numeros[i]; posmaior = i;
 * } }
 * 
 * System.out.println("O maior núumero é: "+aux);
 * System.out.println("A posição é: "+posmaior);
 */



/*
 * exercicio 6 
 * int n = le.nextInt();
 * 
 * int[] vect1 = new int[n]; int[] vect2 = new int[n]; int[] vect3 = new int[n];
 * 
 * 
 * System.out.println("Digite os números do vetor 1"); for(int i = 0; i <
 * vect1.length; i++) { vect1[i] = le.nextInt(); }
 * 
 * System.out.println("Digite os números do vetor 2"); for(int i = 0; i <
 * vect2.length; i++) { vect2[i] = le.nextInt(); }
 * 
 * System.out.println("Numeros digitados no vetor 1"); for(int i = 0; i <
 * vect1.length; i++) { System.out.println(vect1[i]); }
 * 
 * System.out.println("Numeros digitados no vetor 2"); for(int i = 0; i <
 * vect2.length; i++) { System.out.println(vect2[i]); }
 * 
 * for(int i = 0; i < vect3.length; i++) { vect3[i] = vect1[i] + vect2[i]; }
 * 
 * System.out.println("Soma dos vetores 1 e 2"); for(int i = 0; i <
 * vect3.length; i++) { System.out.println(vect3[i]); }
 */

/*
 * exercico 7
 * double[] numeros = new double[n];
 * 
 * System.out.println("Digite os números do vetor: "); for(int i = 0; i <
 * numeros.length; i++) { numeros[i] = le.nextDouble(); }
 * 
 * double media = 0.00; for(int i = 0; i < numeros.length; i++) { media +=
 * numeros[i]; }
 * 
 * media /= n; System.out.println("A média do vetor é: "+media);
 * 
 * System.out.println("elementos abaixo da média:"); for(int i = 0; i <
 * numeros.length; i++) { if(numeros[i] < media) {
 * System.out.println(numeros[i]); } }
 */

/*
 * exercicio 8
 * int[] numeros = new int[n];
 * 
 * for(int i = 0; i < numeros.length; i++) { numeros[i] = le.nextInt(); }
 * 
 * System.out.println("números do vetor"); for(int i = 0; i < numeros.length;
 * i++) { System.out.println(numeros[i]);; }
 * 
 * int mediaPares = 0; int qtdPares = 0; for(int i = 0; i < numeros.length; i++)
 * { if(numeros[i] % 2 == 0) { mediaPares += numeros[i]; qtdPares++; } }
 * 
 * if(qtdPares != 0) { mediaPares /= qtdPares;
 * System.out.println("A média dos pares é: "+mediaPares); } else {
 * System.out.println("Não existem numeros pares"); }
 */


/*
 * exercicio 9
 * MaisVelho[] vect = new MaisVelho[n]; for(int i = 0; i < vect.length; i++) {
 * System.out.print("Digite o nome: "); le.nextLine(); String name =
 * le.nextLine(); System.out.print("Digite a idade: "); int idade =
 * le.nextInt(); vect[i] = new MaisVelho(name, idade); }
 * 
 * for(int i = 0; i < vect.length; i++) { System.out.println(vect[i]); }
 * 
 * MaisVelho maisVelho = vect[0]; for(int i = 0; i < vect.length - 1; i++) {
 * if(vect[i].getIdade() > vect[i+1].getIdade()) { maisVelho = vect[i]; } }
 * 
 * System.out.print("O mais velho é "+maisVelho.getNome());
 * System.out.print(" com "+maisVelho.getIdade()+ " anos");
 * 
 * 
 * 
 * 
 */



/*
 * exercicio 10
 * Aprovados[] vect = new Aprovados[n];
 * 
 * for(int i = 0; i < vect.length; i++) {
 * System.out.print("Digite o nome do "+(i+1)+"° Aluno: "); le.nextLine();
 * String nome = le.nextLine(); System.out.print("Digite a 1° nota: "); double
 * nota1 = le.nextDouble(); System.out.print("Digite a 2° nota: "); double nota2
 * = le.nextDouble(); vect[i] = new Aprovados(nome, nota1, nota2);
 * vect[i].calculaMedia(); }
 * 
 * for(int i = 0; i < vect.length; i++) { System.out.println(vect[i]); }
 */




/*
 *ex 11
 * Dados[] vect = new Dados[n];
 * 
 * for(int i = 0; i < vect.length; i++) { System.out.print("Digite o nome: ");
 * String nome = le.nextLine(); System.out.print("Digite a altura: "); double
 * altura = le.nextDouble(); System.out.print("Digite o genero (f) ou (m): ");
 * boolean genero = false; le.nextLine(); String genero1 = le.nextLine();
 * if(genero1.equalsIgnoreCase("f")) { genero = true; }else { genero = false; }
 * vect[i] = new Dados(nome, altura, genero); vect[i].genero();
 * System.out.println("");
 * 
 * 
 * }
 * 
 * double maiorAltura = vect[0].getAltura(); double menorAltura =
 * vect[0].getAltura(); double mediaalturaMuheres = 0.00; int qtdmulheres = 0;
 * 
 * 
 * for(int i = 0; i < vect.length - 1; i++) { if(vect[i].getAltura() >
 * vect[i+1].getAltura()) { maiorAltura = vect[i].getAltura(); } }
 * 
 * for(int i = 0; i < vect.length - 1; i++) { if(vect[i].getAltura() <
 * vect[i+1].getAltura()) { menorAltura = vect[i].getAltura(); } }
 * 
 * for(int i = 0; i < vect.length; i++) { if(vect[i].isGenero() == true) {
 * qtdmulheres++; } }
 * 
 * for(int i = 0; i < vect.length; i++) { if(vect[i].isGenero() == true) {
 * mediaalturaMuheres += vect[i].getAltura(); } }
 * 
 * mediaalturaMuheres /= qtdmulheres;
 * 
 * 
 * 
 * for(int i = 0; i < vect.length; i++) { System.out.println(vect[i]); }
 * 
 * System.out.println("A maior altura é: "+maiorAltura);
 * System.out.println("A menor altura é: "+menorAltura);
 * System.out.println("A média de altura das mulheres é"+mediaalturaMuheres);
 * System.out.println("A quantidade de mulhers é: "+qtdmulheres);
 */