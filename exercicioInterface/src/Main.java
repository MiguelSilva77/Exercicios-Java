/*exercicio focado no aprendizado e implementação de interfaces 
 * 
 * enunciado
 * Uma empresa deseja automatizar o processamento de seus contratos. O processamento de um contrato consiste em gerar 
 * as parcelas a serem pagas para aquele contrato, com base no número de meses desejado.

A empresa utilizbna um serviço de pagamento online para realizar o pagamento das parcelas. Os serviços de pagamento 
online tipicamente cobram um juro mensal, bem como uma taxa por pagamento. Por enquanto, o serviço contratado pela 
empresa é o do Paypal, que aplica juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.

Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato, e valor total do contrato). 
Em seguida, o programa deve ler o número de meses para parcelamento do contrato, e daí gerar os registros de parcelas a 
serem pagas (data e valor), sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela dois meses
 após o contrato e assim por diante. Mostrar os dados das parcelas na tela.*/



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner le = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato");
		System.out.print("Número: ");
		int numero = le.nextInt();
		le.nextLine();
		System.out.print("Data: ");
		String dataString = le.nextLine();
		LocalDate data = LocalDate.parse(dataString,fmt1);
		System.out.print("Valor: ");
		double valor = le.nextDouble();
		Contract contrato = new Contract(numero,data,valor);
		System.out.print("Entre com o número de parcelas: ");
		int parcelas = le.nextInt();
		ContractService service = new ContractService();
		service.porcessesContract(contrato,parcelas);
		
		
		System.out.printf("\nPARCELAS\n");
		
		for(Installment i:contrato.getLista()) {
			System.out.println(i);
		}
	}

}
