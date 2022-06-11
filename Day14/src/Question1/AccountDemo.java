package Question1;

public class AccountDemo {

	public static void main(String[] args) {
		
		Account account=new Account();
		account.setAccountNumber("12345657");
		
		account.deposit(1100);
		try {
			account.withdraw(1500);
			
			
			
		}catch(InsufficientFundsException in){
			System.out.println("Invalid");
		}
		

	}

}
