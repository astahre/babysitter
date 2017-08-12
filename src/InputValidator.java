import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class InputValidator {

	public static boolean validateTime(String timeIn, String timeOut) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh a");
		LocalTime inTime = LocalTime.parse(timeIn, formatter );
		LocalTime earliestTimeIn = LocalTime.parse("05 PM", formatter );
		LocalTime outTime = LocalTime.parse(timeOut, formatter);
		LocalTime latestTimeOut = LocalTime.parse("04 AM", formatter);
		if (inTime.isBefore(earliestTimeIn) && inTime.isAfter(latestTimeOut)) {
			return false;
		}
		if (outTime.isAfter(latestTimeOut) && outTime.isBefore(earliestTimeIn)) {
			return false;
		}
		return true;
	}

	public static boolean validateAmPm(String ampm) {
		if (ampm == "AM" || ampm == "PM") {
			return true;			
		} else {
			return false;
		}
	}


}
