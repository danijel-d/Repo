package domaci;

import java.util.ArrayList;
import java.util.Scanner;

public class Dete {

	private int brgodina ;
	private String ime;
	private String prezime;
	private int   brklikera;
	
	/*
	 * Napraviti metodu koja ce ispisivati broj klikera 
	 * i metodu koja ispisuje prosecan broj decjih godina
	 * (ako imamo troje dece, broj prosecnih godina za njih
	 *  troje; ako imamo dvoje racunamo prosecne godine za
	 *   to dvoje) .
	 */
	
	
	public Dete( String ime, String prezime, int brgodina, int brklikera) {
		this.ime = ime;
		this.prezime = prezime;
		this.brgodina = brgodina;
		this.brklikera=brklikera;
	}
	


	public void setBrklikera(int brklikera) {
		this.brklikera = brklikera;
	}

	public void dodajKliker() {
		brklikera++;
	}
	public int dodajKlikere(int d) {
		return brklikera+=d;
		
	}
	
	public void oduzmiKlikere() {
		brklikera--;
	}
	public void oduzmiKlikere(int o) {
		brklikera-=o;
	}
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String ispisi(){
		return ime + " "+ brklikera;
	}
	
	public int getBrgodina() {
		return brgodina;
	}

	public void setBrgodina(int brgodina) {
		this.brgodina = brgodina;
	}
	
	ArrayList<Dete> deca;
	
	
	public   Dete (){
		deca= new ArrayList<Dete>();
	
	}
	public void dodaj(Dete d1, Dete d2, Dete d3) {
		deca.add(d1);
		deca.add(d2);
		deca.add(d3);
		}

	public Dete dodjidoPodataka(String ime) {
		for (int i=0; i< deca.size(); i++) {
			Dete d = deca.get(i);
			if (d.getIme().equals(ime)){
				return d;
			}
		}
		return null;
	}
	
	
	public void dodjidoPod() {
		double srednjibr = 0;
		for (int i=0; i< deca.size(); i++) {
			Dete d = deca.get(i);
			deca.get(i).getBrgodina();
			//System.out.println(deca.get(i).getBrgodina());
			srednjibr+= deca.get(i).getBrgodina();
			//System.out.println();
		}
		int ukupanbrd = deca.size();
		System.out.println(srednjibr/ukupanbrd);
		
	}
	

	
}
