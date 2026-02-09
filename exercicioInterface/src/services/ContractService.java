package services;

import java.util.List;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	
	OnlinePaymantServices service = new PaypalServices();
	
	Contract contract = new Contract();


	public void porcessesContract(Contract contract, int months) {
		for(int i = 1; i <= months; i++ ) {
			double amount = contract.getTotalValue() / months;
			amount += service.interest(amount, i);
			amount += service.paymentFee(amount);
			contract.getLista().add(new Installment(contract.getData().plusMonths(i),amount));
		}
		
		
	}
	
	
}