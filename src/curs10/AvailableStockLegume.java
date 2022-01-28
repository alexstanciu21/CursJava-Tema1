package curs10;

public class AvailableStockLegume {

	String[] legume = { "cartof", "morcov", "varza", "ardei" };

	boolean found = false;

	public boolean verifyStock(String searchedValue) {

		for (String x : legume) {
			if (x.contentEquals(searchedValue) || x.equalsIgnoreCase(searchedValue)) {
				found = true;
				break;
			}
		}
		return found;

	}

}
