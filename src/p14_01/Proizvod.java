package p14_01;

public class Proizvod {
//	Kreirati klasu Proizvod koja ima
//	Naziv proizvoda
//	kupca/musteriju
//	cenu izrade proizvoda
//	gettere i settere
//	konstruktore
//	Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda 
//	po formuli:
//	cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//	Metodu za stampanje proizvoda u formatu:
//	naziv proizvoda - cena
//	ime i prezime - broj kartice

	String naziv;
	Kupac kupac;
	double cenaIzrade;
	ClanskaKartica clanskaKartica;

	public Proizvod() {

	}

	public Proizvod(String naziv, double cenaIzrade) {
		this.naziv = naziv;
		this.cenaIzrade = cenaIzrade;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getCenaIzrade() {
		return this.cenaIzrade;
	}

	public void setCenaIzrade(double cenaIzrade) {
		this.cenaIzrade = cenaIzrade;
	}

	public Kupac getKupac() {
		return this.kupac;
	}

	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}

	public double cena(double cenaIzrade) {
		return cenaIzrade * 1.9 * (100 - this.kupac.getClanskaKartica().getPopust()) / 100;
	}

	public void stampaj() {
		System.out.println(this.naziv + " - " + cena(cenaIzrade));
		this.kupac.stampaj();
	}

}
