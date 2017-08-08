import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class InputValidator {

	public boolean validateTime(String timeIn, String timeOut) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh a");
		LocalTime inTime = LocalTime.parse(timeIn, formatter );
		LocalTime earliestTimeIn = LocalTime.parse("05 PM", formatter );
		LocalTime latestTimeOut = LocalTime.parse("04 AM", formatter);
		if (inTime.isBefore(earliestTimeIn) && inTime.isAfter(latestTimeOut)) {
			return false;
		}
		return true;
	}


}
