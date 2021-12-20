package curs5;

public class Curs5Tema2 {

	public static void main(String[] args) {

		int f1 = 0;
		int f2 = 1;
		int f3;
		int count = 9;

		System.out.print("Seria Fibonacci pentru 9 numere: " + f1 + " " + f2);

		for (int i = 2; i < count; i++) {

			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;

			System.out.print(" " + f3);

		}

//		int j = 2;
//		while (count > j) {
//			
//			j = j + 1;
//			
//			f3 = f1 + f2;
//			f1 = f2;
//			f2 = f3;
//			
//			System.out.print(" " + f3);
//		}

	}

}
