package ucionica;

import java.util.ArrayList;

import domaci.Dete;

public class Laptop {
	private String marka;

	public String getMarka() {
		return marka;
	}

	ArrayList<Polaznik> polaznici;

	public Laptop() {
		polaznici = new ArrayList<Polaznik>();

	}

	public void dodaj(Polaznik p1, Polaznik p2, Polaznik p3, Polaznik p4, Polaznik p5, Polaznik p6, Polaznik p7,
			Polaznik p8, Polaznik p9, Polaznik p10) {
		polaznici.add(p1);
		polaznici.add(p2);
		polaznici.add(p3);
		polaznici.add(p4);
		polaznici.add(p5);
		polaznici.add(p6);
		polaznici.add(p7);
		polaznici.add(p8);
		polaznici.add(p9);
		polaznici.add(p10);

	}

	public void dodjidoMarkeLaptopa() {
		for (int i = 0; i < polaznici.size(); i++) {
			Polaznik p = polaznici.get(i);

			polaznici.get(i).getMarka();
			System.out.println(polaznici.get(i).getMarka());
		}
		System.out.println();
	}

	public void imeMarke(String marka) {
		for (int i = 0; i < polaznici.size(); i++) {
			Polaznik p = polaznici.get(i);
			if (polaznici.get(i).getMarka().equals(marka))

				System.out.println(polaznici.get(i).getIme());
		}
		System.out.println();
	}

	public void name() {

	}

}
