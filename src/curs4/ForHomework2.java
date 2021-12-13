package curs4;

import java.util.Scanner;

public class ForHomework2 {

	public static void main(String[] args) {

		int num;
		int total = 1;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		num = scan.nextInt();

		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j < num; j++) {
				total = num * i;
			}

			System.out.println(num + " * " + i + " = " + total);

		}

	}

}
