package vezbanje18nov;

import java.util.Scanner;

public class Zadatak11 {
	/* Napisati program koji od korisnika 
 * trazi da unese koliko na testu ima pitanja. 
 Zatim, koristeci metodu, ucitava ime i 
 prezime studenta, kao i da li je za svako 
 pitanje odgovor koji je student dao tacan 
 ili netacan. Napraviti ( i na odgovarajucem mestu pozvati)  metodu 
kojoj je povratna vrednost String 
i ispisati poruku koja daje informaciju o
 tome da li je student pao ili polozio ispit, 
 kao i koliko ima tacnih odgovora.
(Polozio je ako ima vise od 50%)
Ukoliko student nije polozio,
 napisati koliko poena mu fali da bi ocena bila prelazna.
 Moguce je iskoristiti metodu iz prethodne tacke
   i dopuniti je.*/
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Unesite koliko na testu ima pitanja :");
			String[] test;
			while (!sc.hasNextInt()) {
				System.out.println("Uneli ste slovo unesite ponovo: ");
				sc.next();
			}
			int n = sc.nextInt();
			if (n == 0) {
				System.out.println("Nema logike uneti '0' pitanja, probajte ponovo :");
				n = sc.nextInt();
			}
			if (n < 0) {
				System.out.println("Nema logike unositi negativan broj pitanja,\nunesite pozitivan 								broj:");				
			n = sc.nextInt();			}
			test = new String[n];
			System.out.println(n);
			unesiImePrstudenta(test);
			proveratesta(test);
			System.out.println("Unesite 'stop' za prekid programa ili bilo koji karakter za dalje ");
		}
		while (!sc.next().equals("stop"));
	}

	public static String[] unesiImePrstudenta(String[] test) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ime studenta : ");
		String ime = sc.nextLine();
		System.out.println("Unesite prezime studenta : ");
		String prezime = sc.nextLine();
		System.out.println("Unesite odgovore studenta SA 'tacan' i 'netacan' ");
		for (int i = 0; i < test.length; i++) {
			System.out.println("Pitanje br." + (i + 1));
			test[i] = sc.nextLine();
		}
		return test;
	}

	public static void proveratesta(String[] test) {
		int brojtacnih;
		int i;

		int brojNetacnih;
		String tacan = "tacan";
		for (i = 0, brojtacnih = 0, brojNetacnih = 0; i < test.length; i++) {
			if (test[i].equals(tacan)) {
				brojtacnih++;
			} else {
				brojNetacnih++;
			}
		}
		System.out.println("Broj tacnih : " + brojtacnih);
		System.out.println("Broj Netacnih : " + brojNetacnih);
		int brojpoena;
		brojpoena = 51 - 100 * brojtacnih / test.length;

		if (brojtacnih <= brojNetacnih) {

			System.out.println("Student nije prosao test, potrebno mu je jos " + brojpoena + " poena da polozi test");
		} else {

			System.out.println("Student je polozio test");
		}
	}

}
