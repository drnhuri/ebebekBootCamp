import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int total = 0;

		System.out.print("Enter a number: ");
		int number = input.nextInt();

		// I am taking action to understand whether my number value entered into the
		// system is perfect.
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}

		// I print it to the screen according to the situation
		if (number == total) {
			System.out.println(number + " Is the perfect number.");
		} else {
			System.out.println(number + " It's not a perfect number.");
		}
	}

}
