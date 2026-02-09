import java.util.Locale;


	public static void main(String[] args) {
		String product1 = "computer";
		String product2 = "office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.00 ;
		double price2 = 650.00;
		double measure = 53.234567;
		
		System.out.println("Products");
		System.out.printf("%s, witch pricer is $%.2f\n",product1,price1);
		System.out.printf("%s, witch pricer is $%.2f\n\n",product2,price2);
		System.out.printf("Record: %d years old, code %d and gender: %s\n\n",age,code,gender);
		System.out.printf("Measue with eight decimal places: %.8f\n\n",measure);
		System.out.printf("Rouded (three decimal places): %.3f\n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f\n",measure);

		

		
		
	

}