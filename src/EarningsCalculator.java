
public class EarningsCalculator {

	public int calculateEarnings(int regularHours, int postBedtimeHours, int k) {
		int regularWages = regularHours * 12;
		int postBedtimeWages = postBedtimeHours * 8;
		
		return regularWages + postBedtimeWages;
	}

}
