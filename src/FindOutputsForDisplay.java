
public class FindOutputsForDisplay {

	public String findOutputs(String timeIn, String timeOut, String bedtime) {
		long[] hoursPerPayrate = HoursCalculation.calculateHours(timeIn, timeOut, bedtime);
		long earnings = EarningsCalculator.calculateEarnings(hoursPerPayrate[0], hoursPerPayrate[1], hoursPerPayrate[2]);
		String wages = String.valueOf(earnings);
		return "$" + wages;
	}

}
