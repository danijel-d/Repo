import java.util.Scanner;

public class Zadatak_1_11222019 {

	
	public static Double proizvod3realna(Double a1, Double a2, Double a3) {
		double proizvod = a1 * a2 * a3;
		return proizvod;
	}
	
	
	public static Double minimum3realna(Double a1, Double a2, Double a3) {
		double min = a1;
		if (a2<min) min = a2;
		if (a3<a1 && a3<a2) min = a3;
		return min;
	}
	
	
	
	public static void main(String[] args) {
		// Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve metode(u mainu).
		// Prva metoda vraca proizvod unetih brojeva. Druga metoda ispisuje najmanji od unesenih
		// brojeva.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi prvi realni br: ");
		Double a1 = sc.nextDouble();
		System.out.println("Unesi drugi realni br: ");
		Double a2 = sc.nextDouble();
		System.out.println("Unesi treci realni br: ");
		Double a3 = sc.nextDouble();
		
		
		
		// slanje 3 realna broja u metodu proizvod3realna
		System.out.println("Proizvod je: " + proizvod3realna(a1, a2, a3));
		
		
		// slanje 3 realna broja u metodu min3realna
		System.out.println("Minimum je: " + minimum3realna(a1, a2, a3));
			
	}

}
