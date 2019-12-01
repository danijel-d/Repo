package ucionica;

public class Polaznik {
	private String ime;
	private String prezime;
	private int id;
	private String marka;

	public Polaznik(String ime, String prezime, int id, String marka) {
		this.ime = ime;
		this.prezime = prezime;
		this.id = id;
		this.marka = marka;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getId() {
		return id;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String ispis() {
		return ime + "_" + prezime + "{" + id + "}";
	}
}
