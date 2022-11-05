import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int year;
        System.out.print("Yil Giriniz: ");
        year = input.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0 ){
                if(year % 400 == 0){
                    System.out.println(year+" bir artik yildir.");
                }else System.out.println(year+" bir artik yil degildir.");
            }else System.out.println(year+" bir artik yildir.");
        }
        else System.out.println(year+" bir artik yil degildir.");
	}

}
