import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class FindOutputsForDisplay {

	public static String findOutputs(String timeIn, String timeOut, String bedtime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh a");
		LocalTime inTime = LocalTime.parse(timeIn, formatter );
		LocalTime earliestTimeIn = LocalTime.parse("05 PM", formatter );
		boolean valid = InputValidator.validateTime(timeIn, timeOut);
		if (valid) {
			long[] hoursPerPayrate = HoursCalculation.calculateHours(timeIn, timeOut, bedtime);
			long earnings = EarningsCalculator.calculateEarnings(hoursPerPayrate[0], hoursPerPayrate[1], hoursPerPayrate[2]);
			String wages = String.valueOf(earnings);
			return "$" + wages;
		} else if (inTime.isBefore(earliestTimeIn)) {
			return "The in time you have entered is too early, please run the calculator again with a valid time";
		} else {
			return "The out time you have entered is too late, please run the calculator again with a valid time";
		}
	}

}
