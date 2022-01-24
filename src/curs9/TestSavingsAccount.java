package curs9;

import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) throws InsuficientFundsException {

		Customer customer = new Customer("Alex", "Str. Unirii", "alex@unirii.com");
		SavingsAccount account = new SavingsAccount(1, 150, customer);
		Scanner scan = new Scanner(System.in);

		System.out.println("Hi " + customer.getName());

		System.out.println("Please enter the amount to withdraw: ");
		int withdrawSumValue = scan.nextInt();
		account.withdraw(withdrawSumValue);
	}

}
