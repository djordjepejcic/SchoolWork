package p10_01;

public class Racun {

	String brojracuna;
	String imeIPrezime;
	double stanje;

	public void stampaj() {
		System.out.println("Broj racuna: " + this.brojracuna);
		System.out.println("Ime i prezime: " + this.imeIPrezime);
		System.out.println("Stanje na racunu: " + this.stanje);

	}

	public double uplata(double uplata) {
		this.stanje = this.stanje + uplata;
		return this.stanje;
	}

}
