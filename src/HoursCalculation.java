import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class HoursCalculation {

	public long[] calculateHours(String inTime, String outTime, String bedTime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh a");
		LocalTime timeIn = LocalTime.parse(inTime, formatter );
		LocalTime timeOut = LocalTime.parse(outTime, formatter);
		LocalTime midnight = LocalTime.parse("12 AM", formatter);
		LocalTime latestTimeOut = LocalTime.parse("04 AM", formatter);
		Duration regularHours = Duration.between(timeIn, timeOut);
		long[] hoursPerPayrate = {regularHours.toHours(), 0, 0};
		if (bedTime != null) {
			LocalTime timeBed = LocalTime.parse(bedTime, formatter);
			Duration postBedtimeHours = Duration.between(timeBed, timeOut);
			regularHours = Duration.between(timeIn, timeBed);
			hoursPerPayrate[0] = regularHours.toHours();
			
			if (timeOut.isAfter(midnight) && timeOut.isBefore(latestTimeOut)) {
				Duration postMidnightHours = Duration.between(midnight, timeOut);
				postBedtimeHours = Duration.between(timeBed, midnight);
				hoursPerPayrate[2] = postMidnightHours.toHours();
			}
			hoursPerPayrate[1] = Math.floorMod(postBedtimeHours.toHours(), 24);
		}
		return hoursPerPayrate;
	}



}
