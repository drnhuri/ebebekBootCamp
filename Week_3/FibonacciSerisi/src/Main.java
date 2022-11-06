import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a Number:");

		int number = input.nextInt();
		int t1 = 0, t2 = 1;
		System.out.print(number + " Elemental Fibonacci Series: ");

		// It prints the numbers on the screen by adding them with the next number to
		// find the next number.
		for (int i = 1; i <= number; ++i) {
			System.out.print(t1 + "  ");

			int total = t1 + t2;
			t1 = t2;
			t2 = total;
		}
	}

}
