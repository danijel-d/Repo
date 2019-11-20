package testovi;

import java.util.Scanner;

public class Zadatak1 {

	/*
	 * Tražiti od korisnika da unese pozitivan broj N. Zatim učitavati N brojeva sa
	 * standardnog ulaza i ispisati vrednost najmanjeg unetog broja.
	 */

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite pozitivan broj: ");
		int n = sc.nextInt();
		int min=0;
		if (n<0) System.out.println("Uneta vrednost ne moze biti negativna");  // Uneta vrednost ne moze biti negativna, korisnik ne moze uneti -4 broja
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Unesite" + i + ". broj");
			int broj = sc.nextInt();
			if(i<2){
				min=broj;
			}
			else if (broj<min)
				min=broj;
						}
			System.out.println(min);
			/*switch (i) {
				case 1: min=broj;
						break;
				default:
						if(broj<min) {
						min=broj;
					}else {System.out.println("min je neki  broj " +min);
						
						};
						break;
			}; */
				}
	//System.out.println(min);	
			}

