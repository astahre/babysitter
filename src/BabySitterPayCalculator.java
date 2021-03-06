import java.util.Scanner;


public class BabySitterPayCalculator {
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		new BabySitterPayCalculator().run();
	}

	private void run() {
		String timeIn = enterTimeIn();
		String timeOut = enterTimeOut();
		String bedtime = enterBedtime();
		String outputMessage = FindOutputsForDisplay.findOutputs(timeIn, timeOut, bedtime);
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
	
	private String enterTimeOut() {
		System.out.println("Enter the ending hour of your shift:");
		int inputOutTime = scanner.nextInt();
		System.out.println("AM or PM");
		String aMpM = scanner.next();
		String timeOut = ConvertTimeInputsToString.convertInputs(inputOutTime, aMpM);
		return timeOut;
	}
	
	private String enterBedtime() {
		System.out.println("Enter the bedtime:");
		int inputBedtime = scanner.nextInt();
		System.out.println("AM or PM");
		String aMpM = scanner.next();
		String bedtime = ConvertTimeInputsToString.convertInputs(inputBedtime, aMpM);
		return bedtime;
	}
}
