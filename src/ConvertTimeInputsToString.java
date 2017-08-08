
public class ConvertTimeInputsToString {

	public static String convertInputs(int hour, String ampm) {
		String convertedHour = String.format("%02d", hour);
		return convertedHour + " " + ampm.toUpperCase();
	}

}
