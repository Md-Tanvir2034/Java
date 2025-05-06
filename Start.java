public class Start{
	public static void main(String[] args){
		Account a1 = new Account("11111","Abdul Karim",20000,3.5);
		a1.showDetails();
		
		Savings s1 = new Savings("22222","Abdul Kamal",30000,4.5);
		s1.showDetails();
	
		s1.deposit(10000);
		s1.withdraw(5000);
		s1.withdraw(35000);
		s1.withdraw(5000);
		s1.showDetails();
		
		OverDraft od1 = new OverDraft("33333","Jamal",40000,1.5,15000);
		od1.showDetails();
		od1.withdraw(55000);
		od1.showDetails();
		od1.deposit(10000);
		od1.showDetails();
	}
}