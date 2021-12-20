package curs5;

import java.util.Scanner;

public class Curs5Tema1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int attempts = 0;

		String corectUser = "TestUser";
		int validPassword = 1234;

		String user;
		int pass;

		do {

			System.out.println("Enter a user: ");
			user = scan.next();

			System.out.println("Enter a password: ");
			pass = scan.nextInt();

			attempts = attempts + 1;

			if ((user.equalsIgnoreCase(corectUser) && pass == validPassword)) {
				System.out.println("Login Sucessful");
			} else {
				System.out.println("Login Error");
			}

			if (((user.equalsIgnoreCase(corectUser) && pass == validPassword) == false) && attempts > 2) {
				System.out.println("Maximum attempts reached. User blocked");
			}

		} while (((user.equalsIgnoreCase(corectUser) && pass == validPassword) == false) && (attempts < 3));

	}

}
