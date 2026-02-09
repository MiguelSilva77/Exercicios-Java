/*exercício focado em implmentação das interfaces Set
 * 
 * Enunciado:
 * Em um portal de cursos online, cada usuário possui um código único, representado por um número inteiro.

 *Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se matricular em quantos cursos quiser.
 * Assim, o número total de alunos de um instrutor não é simplesmente a soma dos alunos de todos os cursos que ele possui, 
 * pois pode haver alunos repetidos em mais de um curso.

 *O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.

 *Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a quantidade total de alunos dele, 
 *jconforme exemplo.*/


import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);
		Set<Students> students = new HashSet<>(); 
		
		System.out.print("How many students for course A? ");
		int studentsA = le.nextInt();
		
		for(int i = 0; i < studentsA ;i++) {
			System.out.print("Student "+ (i+1)+"# code:");
			int code = le.nextInt();
			students.add(new Students(code));
		}
		System.out.println();
		
		System.out.print("How many students for course A? ");
		int studentsB = le.nextInt();
		
		for(int i = 0; i < studentsB ;i++) {
			System.out.print("Student "+ (i+1)+"# code:");
			int code = le.nextInt();
			students.add(new Students(code));
		}
		System.out.println();
		
		System.out.print("How many students for course A? ");
		int studentsC = le.nextInt();
		
		for(int i = 0; i < studentsC ;i++) {
			System.out.print("Student "+ (i+1)+"# code:");
			int code = le.nextInt();
			students.add(new Students(code));
		}
		System.out.println();
		
		System.out.print("Total students: "+students.size());
	}

}
