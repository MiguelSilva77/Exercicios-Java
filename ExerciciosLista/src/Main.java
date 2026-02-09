import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Digite quanos funcionários deseja cadastrar: ");
		int n = le.nextInt();
		le.nextLine();
		
		List<Funcionario> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Funcionário *"+(i+1));
			System.out.print("Digite o id do funcionário: ");
			int id = le.nextInt();
			le.nextLine();
			System.out.print("Digite o nome do funcionario: ");
			String name = le.nextLine();
			System.out.print("Digite o salário do funcionário: ");
			double salario = le.nextDouble();
			System.out.printf("%n");
			Funcionario fun = new Funcionario(id, name, salario);
			list.add(fun);
		}
		
		System.out.print("Digite o id do funcionáro que vai receber aumento: ");
		int ida = le.nextInt();
		Funcionario fun = list.stream().filter(x -> x.getId() == ida).findFirst().orElse(null);
		if(fun == null) {
			System.out.println("ID não encontrado");
		} else {
			System.out.print("Digite a porcentagem de aumento: ");
			double aumento = le.nextDouble();
			fun.aumentaSalario(aumento);
		}
		
		System.out.println("Lista de funcionários");
		System.out.println(list);
		
			
		
	}

}
