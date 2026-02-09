package entities;

public class IndividualPerson extends Person{

	private Double healthSpent;
	
	public IndividualPerson() {
		super();
	}
	
	public IndividualPerson(String name, Double annualIncome, Double healthSpent) {
		super(name, annualIncome);
		this.healthSpent = healthSpent;
	}
	
	public Double getHealthSpent() {
		return healthSpent;
	}

	public void setHealthSpent(Double healthSpent) {
		this.healthSpent = healthSpent;
	}
	
	Double tax;

	@Override
	public Double calculateTax() {
		if(annualIncome < 20000.00) {
			tax = (annualIncome * 0.15) - (healthSpent * 0.5);
			return tax;
		}else {
			tax = (annualIncome * 0.25) - (healthSpent * 0.5);
			return tax;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" $ ");
		sb.append(String.format("%.2f", tax));
		return sb.toString();
	}
	
}
