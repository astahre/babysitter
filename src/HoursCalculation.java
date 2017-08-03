import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class HoursCalculation {

	public long[] calculateHours(String inTime, String outTime, String bedTime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh a");
		LocalTime timeIn = LocalTime.parse(inTime, formatter );
		LocalTime timeOut = LocalTime.parse(outTime, formatter);
		Duration regularHours = Duration.between(timeIn, timeOut);
		long[] hoursPerPayrate = {regularHours.toHours(), 0, 0};
		if (bedTime != null) {
			LocalTime timeBed = LocalTime.parse(bedTime, formatter);
			Duration postBedtimeHours = Duration.between(timeBed, timeOut);
			regularHours = Duration.between(timeIn, timeBed);
			hoursPerPayrate[0] = regularHours.toHours();
			hoursPerPayrate[1] = postBedtimeHours.toHours();
		}
		return hoursPerPayrate;
	}



}
