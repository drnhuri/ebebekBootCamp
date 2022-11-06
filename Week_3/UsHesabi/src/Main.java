import java.util.Scanner;

public class Main {

//I perform the operation in the method that I have defined as static and call it in main.	
	static int power(int a, int b) {
		if (a == 1 | b == 0)
			return 1;

		return power(a, b - 1) * a;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the base value: ");
		int a = input.nextInt();
		System.out.print("Enter the exponent: ");
		int b = input.nextInt();

		System.out.println("Result: " + power(a, b));
	}

}
