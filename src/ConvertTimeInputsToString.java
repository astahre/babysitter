
public class ConvertTimeInputsToString {

	public static String convertInputs(int hour, String ampm) {
		String convertedHour = String.format("%02d %s", hour, ampm.toUpperCase());
		return convertedHour;
	}

}
