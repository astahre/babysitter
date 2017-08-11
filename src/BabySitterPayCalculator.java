import java.util.Scanner;


public class BabySitterPayCalculator {
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		new BabySitterPayCalculator().run();
	}

	private void run() {
		String outputMessage = "test";
		String timeIn = enterTimeIn();
		outputMessage = timeIn;
		System.out.println(outputMessage);
		scanner.close();
		
	}

	private String enterTimeIn() {
		System.out.println("Enter the starting hour of your shift:");
		int inputInTime = scanner.nextInt();
		System.out.println("AM or PM");
		String aMpM = scanner.next();
		String timeIn = ConvertTimeInputsToString.convertInputs(inputInTime, aMpM);
		return timeIn;
	}
}
