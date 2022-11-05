import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double armutKg = 2.14, elmaKg = 3.67, domateKg = 1.11, muzKg = 0.95, patlicanKg = 5;

		double armut, elma, domates, muz, patlican;

		double armutTop, elmaTop, domatesTop, muzTop, patlicanTop;

		System.out.println("Armut kac kilo?:");
		armut = input.nextDouble();

		System.out.println("Elma kac kilo?:");
		elma = input.nextDouble();

		System.out.println("Domates kac kilo?:");
		domates = input.nextDouble();

		System.out.println("Muz kac kilo ? :");
		muz = input.nextDouble();

		System.out.println("Patlican kac kilo? :");
		patlican = input.nextDouble();

		armutTop = armut * armutKg;
		elmaTop = elma * elmaKg;
		domatesTop = domates * domateKg;
		muzTop = muz * muzKg;
		patlicanTop = patlican * patlicanKg;

		double toplam = (armutTop + elmaTop + domatesTop + muzTop + patlicanTop);
		System.out.println("Odenecek toplam tutar: " + toplam);
	}

}
