package ucionica;

import java.util.Scanner;

public class Zadatak_1_11282019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Polaznik p1 = new Polaznik("Milica", "Milic", 1, "Asus");
		Polaznik p2 = new Polaznik("Vladimir", "Vlatkovic", 2, "toshiba");
		Polaznik p3 = new Polaznik("Svetlana", "Svetlic", 3, "lenovo");
		Polaznik p4 = new Polaznik("Svetlana", "Svetlic", 4, "dell");
		Polaznik p5 = new Polaznik("Teodora", "Petrovic", 5, "lenovo");
		Polaznik p6 = new Polaznik("Viktor", "Cvetic", 6, "toshiba");
		Polaznik p7 = new Polaznik("Milenko", "Jovanovic", 7, "macbook");
		Polaznik p8 = new Polaznik("Sara", "Petric", 8, "apple");
		Polaznik p9 = new Polaznik("Milos", "Delic", 9, "dell");
		Polaznik p10 = new Polaznik("Gordana", "Lenovic", 10, "lenovo");

		System.out.println(p1.ispis());
		System.out.println(p2.ispis());
		System.out.println(p3.ispis());
		System.out.println(p4.ispis());
		System.out.println(p5.ispis());
		System.out.println(p6.ispis());
		System.out.println(p7.ispis());
		System.out.println(p8.ispis());
		System.out.println(p9.ispis());
		System.out.println(p10.ispis());

		Laptop laptop = new Laptop();

		laptop.dodaj(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
	
		System.out.println();
		System.out.println("Unesi naziv brenda laptopa \nda se vide imena korisnika \n npr. Dell : ");

		String marka = sc.nextLine().toLowerCase();
		laptop.imeMarke(marka);
	}

}
