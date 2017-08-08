import java.util.Scanner;


public class BabySitterPayCalculator {

	public static void main(String[] args) {
		String outputMessage = "test";
		System.out.println("Enter the starting hour of your shift:");
		Scanner scanner = new Scanner(System.in);
		int inputInTime = scanner.nextInt();
		System.out.println("AM or PM");
		String aMpM = scanner.next();
		String timeIn = ConvertTimeInputsToString.convertInputs(inputInTime, aMpM);
		outputMessage = timeIn;
		System.out.println(outputMessage);
		scanner.close();
	}
}
