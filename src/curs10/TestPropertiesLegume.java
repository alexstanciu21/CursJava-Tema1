package curs10;

import java.io.IOException;
import java.util.Scanner;

public class TestPropertiesLegume {

	public static void main(String[] args) throws IOException {

		PropertiesLegumeProcessor propLegume = new PropertiesLegumeProcessor();
		AvailableStockLegume availableStock = new AvailableStockLegume();

		Scanner scan = new Scanner(System.in);
		boolean stock = true;

		while (stock) {
			System.out.println("Ce leguma ai vrea sa cumperi?");
			String leguma = scan.next();

			if (stock == availableStock.verifyStock(leguma)) {
				propLegume.readProperties(leguma);
				break;
			} else {
				System.out.println("Nu vindem aceasta leguma!");
			}

		}
	}
}