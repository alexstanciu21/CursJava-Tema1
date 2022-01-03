package curs6;

public class Curs6Tema3 {

	public static void main(String[] args) {

		String[] myStringArray = { "Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion" };

		System.out.println("Nume duplicat: ");

		for (int i = 0; i < myStringArray.length; i++) {

			for (int j = i + 1; j < myStringArray.length; j++) {

				if (myStringArray[i] == myStringArray[j])
					System.out.println(myStringArray[j]);

			}

		}
	}
}
