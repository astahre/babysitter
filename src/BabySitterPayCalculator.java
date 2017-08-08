import java.util.Scanner;


public class BabySitterPayCalculator {

	public static void main(String[] args) {
		String outputMessage = "test";
		System.out.println("Enter the starting hour of your shift:");
		Scanner scanner = new Scanner(System.in);
		int inputInTime = scanner.nextInt();
		String inTime = String.format("%02d", inputInTime);
		outputMessage = inTime;
		System.out.println(outputMessage);
	}
}
