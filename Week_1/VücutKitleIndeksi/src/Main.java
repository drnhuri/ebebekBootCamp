import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double kilo,boy, endeks;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Lutfen kilonuzu giriniz:  ");
        kilo = input.nextDouble();
        
        System.out.println("Lutfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();

        endeks = (kilo / (boy * boy));
        System.out.println("Vucut kitle indeksi: " + endeks);
	}

}
