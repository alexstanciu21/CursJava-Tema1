package curs6;

public class Curs6Tema2 {

	public static void main(String[] args) {

		String text1 = "Eu invat Java";

		char[] vocale = new char[5];
		vocale[0] = 'A';
		vocale[1] = 'E';
		vocale[2] = 'I';
		vocale[3] = 'O';
		vocale[4] = 'U';

		int counter = 0;

		char[] myAarray = text1.toCharArray();

		for (char ch : myAarray) {
			if (ch == vocale[0] || ch == 'a') {
				counter++;
			} else if (ch == vocale[1] || ch == 'e') {
				counter++;
			} else if (ch == vocale[2] || ch == 'i') {
				counter++;
			} else if (ch == vocale[3] || ch == 'o') {
				counter++;
			} else if (ch == vocale[4] || ch == 'u') {
				counter++;
			}
		}

		System.out.println("Vocale: " + counter);

	}

}
