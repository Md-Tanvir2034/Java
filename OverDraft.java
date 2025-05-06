public class OverDraft extends Savings{
	private double limit;
	
	public OverDraft(){}
	public OverDraft(String accountNumber, String accountHolderName, double balance, double interestRate, double limit){
		super(accountNumber,accountHolderName,balance,interestRate);
		this.limit = limit;		
	}
	
	public void showDetails(){
		super.showDetails();
		System.out.println("Over Draft Limit: "+limit);
	}
	
	public void withdraw(double amount){
		if(amount>0 && amount <= balance+limit){
			balance -= amount;
		}
		else{
			System.out.println("Invalid Withdraw Amount");
		}
	}
	
}