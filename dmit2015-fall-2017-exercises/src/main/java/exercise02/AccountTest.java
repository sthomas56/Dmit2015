package exercise02;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void testAll() {
		Account currentAccount = new Account(1122, 100, "George");
		currentAccount.setAnnualInterestRate(1.5);
		currentAccount.deposit(30, "from mom");
		currentAccount.deposit(40, "from girlfriend");
		currentAccount.deposit(50,  "from ex-girlfriend");
		currentAccount.withdraw(5, "donation to red cross");
		currentAccount.withdraw(4, "coffee");
		currentAccount.withdraw(2, "candy");
		// check the account holder name
		assertEquals("George", currentAccount.getName());
		//check the interest rate
		assertEquals()
		//check the balance is 
		assertEquals()
		//check number of transactions is 6
		//check all 3 withdraw transactions
		//check all 3 deposit transactions
		
		
	}

}
