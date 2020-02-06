/**
 * This class represents a bank account whose current balance is a nonnegative
 * amount in US dollars.
 */
public class Account {

    public int balance;
    public Account parentAccount;

    /** Initialize an account with the given balance. */
    public Account(int balance) {
        this.balance = balance;
        this.parentAccount = null;
    }

   public Account(int balance, Account parentAccount) {
       this.balance = balance;
       this.parentAccount = parentAccount;
   }

    /** Deposits amount into the current account. */
    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("Cannot deposit negative amount.");
        } else {
            balance += amount;
        }
    }

    /**
     * Subtract amount from the account if possible. If subtracting amount
     * would leave a negative balance, print an error message and leave the
     * balance unchanged.
     */
    public boolean withdraw(int amount) {
        if (amount < 0) {
            System.out.println("Cannot withdraw negative amount.");
            return false;
        } else if (balance < amount) {
            System.out.println("Insufficient funds");
	    if (this.parentAccount != null) {
	    	this.parentAccount.withdraw(amount);
	   } else {
		return false;
}   
        } else {
            balance -= amount;
            return true;
        }
    }

    /**
     * Merge account other into this account by removing all money from other
     * and depositing it into this account.
     */
    public void merge(Account other) {
	int amount = other.balance;
	withdraw(amount);
	deposit(amount);	
    }
}
