package entities;

public class CompanyPerson extends Person

{

	private Integer employeeNumber;
	
	public CompanyPerson() {
		super();
	}
	
	
	public CompanyPerson(String name, Double annualIncome, Integer employeeNumber) {
		super(name, annualIncome);
		this.employeeNumber = employeeNumber;
	}
	

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}


	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	Double tax;


	@Override
	public Double calculateTax() {
		if(employeeNumber < 10) {
			tax = annualIncome * 0.16;
			return tax;
		}else {
			tax = annualIncome * 0.14; 
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
