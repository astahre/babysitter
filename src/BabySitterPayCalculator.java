import java.util.Scanner;


public class BabySitterPayCalculator {

	public static void main(String[] args) {
		String outputMessage = "test";
		System.out.println("Enter the starting hour of your shift:");
		Scanner scanner = new Scanner(System.in);
		int inputInTime = scanner.nextInt();
		String inTime = String.format("%02d", inputInTime);
		System.out.println("AM or PM");
		String aMpM = scanner.next().toUpperCase();
		String timeIn = inTime + " " + aMpM;
		outputMessage = timeIn;
		System.out.println(outputMessage);
		scanner.close();
	}
}
