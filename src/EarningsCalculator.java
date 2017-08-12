
public class EarningsCalculator {

	public static long calculateEarnings(long hoursPerPayrate, long hoursPerPayrate2, long hoursPerPayrate3) {
		long regularWages = hoursPerPayrate * 12;
		long postBedtimeWages = hoursPerPayrate2 * 8;
		long postMidnightWages = hoursPerPayrate3 * 16;
		
		return regularWages + postBedtimeWages + postMidnightWages;
	}

}
