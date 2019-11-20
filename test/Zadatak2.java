package testovi;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		/*
		 * Ukoliko kupac kupi robu u iznosu većem od 1500 dinara, dobija 10% popusta, a
		 * ukoliko kupi robu u iznosu većem od 7000 dinara dobija 20% popusta. Napisati
		 * program koji će za uneti iznos odabrane robe ispisati koliko zapravo treba
		 * platiti.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Upišite iznos za plaćanje :");
		Double a;
		a = sc.nextDouble();
		while (sc.hasNextDouble() && a>0) {
			//

			if (a > 1500 && a <= 7000) {
				a = a - a / 10;
				System.out.println("Treba platiti : \n" + a);
			} else if (a > 7000) {
				a = a - a * 2 / 10;
				System.out.println("Treba platiti : \n" + a);
			} else {

				System.out.println("Treba platiti : \n"+ a);
			}
		}

		System.out.println("Uneli ste slovo, startujete ponovo program");
	}
}
