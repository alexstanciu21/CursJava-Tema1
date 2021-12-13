package curs4;

import java.util.Scanner;

public class ForHomework1 {

	public static void main(String[] args) {

		int num;
		int sum = 0;
		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Please enter number " + i + ": ");

			num = scan.nextInt();
			sum += num;
		}

		System.out.println("The sum of the numbers is: " + sum);

	}
}
