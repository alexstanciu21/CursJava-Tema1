package curs6;

import java.util.Scanner;

public class Curs6Tema1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sum = 0;

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Introduceti numarul " + i);
			numbers[i] = scan.nextInt();

			sum = sum + numbers[i];

		}

		System.out.println("Suma totala numerelor este: " + sum);

	}

}
