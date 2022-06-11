package Question1;

public class Account {

	
		String accountNumber;
		double Balance;

		
		public void deposit(double ammount) {
			setBalance( ammount);
		}
		public void withdraw(double ammount) throws InsufficientFundsException {
			double balance=getBalance();
			
			if(balance>ammount) {
				balance=(balance-ammount);
				System.out.println(balance);
				setBalance(balance);
			}else {
				InsufficientFundsException isfe=new InsufficientFundsException("Not sufficient amount");
				throw isfe;
			}
			
		}
		
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public double getBalance() {
			return Balance;
		}
		public void setBalance(double balance) {
			Balance = balance;
		}
		
}
