public class Account{
	private String accountNumber;
	private String accountHolderName;
	protected double balance;
	private double interestRate;
	
	public Account(){}
	
	public Account(String accountNumber, String accountHolderName, double balance, double interestRate){
		setAccountNumber(accountNumber);
		setAccountHolderName(accountHolderName);
		setBalance(balance);
		setInterestRate(interestRate);
	}
	
	public void setAccountNumber(String accountNumber){
		if(accountNumber.length()>4){
			this.accountNumber = accountNumber;
		}
		else{
			System.out.println("Invalid Account Number");
		}
	}
	
	public String getAccountNumber(){
		return accountNumber;
	}
	
	public void setAccountHolderName(String accountHolderName){
		if(accountHolderName.length()>2){
			this.accountHolderName = accountHolderName;
		}
		else{
			System.out.println("Invalid Account Holder Name");
		}
	}
	
	public String getAccountHolderName(){
		return accountHolderName;
	}
	
	public void setBalance(double balance){
		if(balance>=0){
			this.balance = balance;
		}
		else{
			System.out.println("Invalid Balance Amount");
		}
	}
	
	public double getBalance(){return balance;}
	
	public void setInterestRate(double interestRate){
		if(interestRate>=0){
			this.interestRate = interestRate;
		}
		else{
			System.out.println("Invalid Interest Rate");
		}
	}
	public double getInterestRate(){
		return interestRate;
	}
	
	public void showDetails(){
		System.out.println("----------------------");
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Balance: "+balance);
		System.out.println("Interest Rate: "+interestRate);
		System.out.println("----------------------");
	}
	
}