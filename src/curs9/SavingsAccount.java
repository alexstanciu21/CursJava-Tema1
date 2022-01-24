package curs9;

public class SavingsAccount extends Account {

	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
		setAccountNumber(accountNumber);
		setBalance(balance);
		setAccountOwner(accountOwner);
	}

	@Override
	public void withdraw(int withdrawSum) throws InsuficientFundsException {

		if (withdrawSum > getBalance()) {
			System.out.println("The amount you entered is greated than the available balance: " + getBalance());
			System.out.println("Thank you for using our ATM!");
			throw new InsuficientFundsException("Insuficient funds for transaction");
		} else {
			double newBalance = getBalance() - withdrawSum;
			System.out.println("Please pick your money!");
			System.out.println("Your new balance is: " + newBalance);
			System.out.println("Thank you for using our ATM!");
		}

	}

}
