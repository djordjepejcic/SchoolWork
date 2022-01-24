package p21_01;

public class Dodatak {
//	Kreirati klasu Dodatak ili Sastojak kako hocete koja ima:
//	naziv dodatka
//	cenu dodatka
//	konstruktore, gettere i settere koji su vam potrebni
//	metodu stampaj koja stampa u formatu:
//	(dodatak)  (cena)

	private String nazivDodatka;
	private double cenaDodatka;

	public Dodatak() {

	}

	public Dodatak(String nazivDodatka, double cenaDodatka) {
		this.nazivDodatka = nazivDodatka;
		this.cenaDodatka = cenaDodatka;
	}

	public String getNazivDodatka() {
		return nazivDodatka;
	}

	public void setNazivDodatka(String nazivDodatka) {
		this.nazivDodatka = nazivDodatka;
	}

	public double getCenaDodatka() {
		return cenaDodatka;
	}

	public void setCenaDodatka(double cenaDodatka) {
		this.cenaDodatka = cenaDodatka;
	}

	public void print() {
		System.out.println("Dodatak: " + this.nazivDodatka + " || Cena: " + this.cenaDodatka + "din.");
	}
}
