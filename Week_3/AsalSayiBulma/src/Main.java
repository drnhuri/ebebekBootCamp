import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter number: ");
	        int number = input.nextInt();
	        int counter = 0;
	        
	        for(int i = 2; i < number; i++)
	        {
	            if(number % i == 0) {
	            	counter++;
	            }
	        }
	        if(counter == 0) {
	            System.out.println(number + " Is a prime number.");
	        }
	        else {
	            System.out.println(number + " Is not a prime number.");
	        }
	}

}
