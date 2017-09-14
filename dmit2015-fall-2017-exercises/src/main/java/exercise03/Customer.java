package exercise03;

public class Customer {
	
	private int id;
	private BankAccount savingAccount;
	private BankAccount checkingAccount;
	
	public void addSavingAccount() {
		savingAccount = new SavingsAccount();
	}
	
	public void addCheckingAccount() {
		checkingAccount = new CheckingAccount();
				
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BankAccount getSavingAccount() {
		return savingAccount;
	}

	public void setSavingAccount(BankAccount savingAccount) {
		this.savingAccount = savingAccount;
	}

	public BankAccount getCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(BankAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}


	
	

}
