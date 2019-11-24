

import java.util.Scanner;

public class Zadatak_1_11212019 {

	public static void main(String[] args) {
		/*
		 * Korisnik ucitava niz od N elemenata niza (koristiti posebnu metodu). Napisati
		 * zasebno 2 metode Prva metoda ispisuje elemente niza koji su deljivi sa 3
		 * Druga metoda ispisuje elemente niza koji su deljivi sa 5
		 * 
		 */
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Upisacete niz od N elemenata  ");
	int N;
		do {
			System.out.print("Unesite duzinu niza prvo: ");
			while (!sc.hasNextInt()) {
				System.out.print("To nije ocekivani rezultat, pokusajte ponovo: ");
				sc.next();
			}
			N = sc.nextInt();
			if (N == 0) System.out.print("Duzina niza ne moze biti 0. ");
			if (N < 0) System.out.print("Duzina ne moze biti negativna. ");
			
			if (N == 1) System.out.println("Nema smisla kreirati niz od jednog broja, ali ok, kako hoces");
			int[] niz = nizNelemenata(N);
			deljivisa5(niz);
			deljivisa3(niz);
		} while (N <= 0);

			
			
			
	}	
		
	

	public static int[] nizNelemenata(int N) {
		int[] niz = new int[N];

		Scanner s = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			niz[i] = s.nextInt();
			
			}
		return niz;
		}
		
	

	public static void deljivisa5(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 5 == 0) {
				System.out.println("Deljiv sa 5 : "+niz[i] + " ");
			}
		else {
			System.out.println("Nije deljiv sa 5 :"
					+ " " +niz[i] + " ");
		}
	}

	
	
	}
	
	public static void deljivisa3(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 3 == 0) {
				System.out.println("Deljiv sa 3 : "+niz[i] + " ");
			}
		else {
			System.out.println("Nije deljiv sa 3 :"
					+ " " +niz[i] + " ");
		}
	}

	
	
	}

}
