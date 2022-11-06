
public class Main {

	public static void main(String[] args) {

		int counter = 0;
		for (int number = 2; number <= 100; number++) {
			// I print the numbers from 1 to 100 by checking whether the remainder of the
			// division by mod is 0 or not.
			int control = 0;
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					control = 1;
					break;
				}
			}
			if (control == 0) {
				System.out.print(number + "\n");
				counter++;
			}
		}
	}
}
