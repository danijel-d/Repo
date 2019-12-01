package domaci;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_1_11292019 {

	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Dete d1 =new Dete("Milan","Mitic",14,20);
		Dete d2 = new Dete("Dusan","Duskic",12,21);
		Dete d3 = new Dete("Marija", "Maric",11,22);
		
		
		
		int d;
		int o;
		System.out.println("Broj klikera: "+d1.ispisi());
		d1.dodajKliker();
		System.out.println("Broj klikera: "+d1.ispisi());
		System.out.println("Dodajte Milanu jos klikera: ");
		d=sc.nextInt();
		d1.dodajKlikere(d);
		System.out.println("Broj klikera: "+d1.ispisi());
		System.out.println("Oduzmite neki kliker :");
		o=sc.nextInt();
		d1.oduzmiKlikere(o);
		System.out.println("Broj klikera: "+d1.ispisi());
		
		Dete dete = new Dete();
		dete.dodaj(d1, d2, d3);
		
		
		
		System.out.println("Srednji Broj godina : ");
		dete.dodjidoPod();
		
		
	}
		
		
	
		
	}


