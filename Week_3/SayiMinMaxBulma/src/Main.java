import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
		int n, max = 1, min = 1, number;

		System.out.print("How many numbers will you enter?:");
		n = input.nextInt();
		
		//I take each number entered in order and compare
		for (int i = 1; i <= n; i++) {
			System.out.print(i + ". enter the number:");
			number = input.nextInt();
			if (i == 1) {
				max = number;
				min = number;
			} else if (number > max) {
				max = number;
			} else if (number < min) {
				min = number;
			}
		}
		System.out.println("Largest number:" + max);
		System.out.print("Smallest number:" + min);

	}

}
