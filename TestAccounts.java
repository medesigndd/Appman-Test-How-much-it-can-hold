package Ass12;

public class TestAccounts {
	public static void main(String[] args) {
		//declare an instance of Account and OverdraftAccount
		Account account = new Account("Bob Jones", 3, 0, 4.5);
		OverdraftAccount overDraftAccount = new OverdraftAccount("Bob Jones", 3, 0, 4.5, -1000);
		
		//deposit 5000 from each
		account.deposit(5000);
		overDraftAccount.deposit(5000);
		
		//withdraw 7000 from each
		account.withdraw(7000);
		overDraftAccount.withdraw(7000);
		
		//print out each
		System.out.println(account);
		System.out.println(overDraftAccount);
	}
}
