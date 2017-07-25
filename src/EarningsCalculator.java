
public class EarningsCalculator {

	public int calculateEarnings(int regularHours, int postBedtimeHours, int postMidnightHours) {
		int regularWages = regularHours * 12;
		int postBedtimeWages = postBedtimeHours * 8;
		int postMidnightWages = postMidnightHours * 16;
		
		return regularWages + postBedtimeWages + postMidnightWages;
	}

}
