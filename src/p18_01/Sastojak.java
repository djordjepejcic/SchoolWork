package p18_01;

public class Sastojak {
//	Kreirati klasu Sastojak koja ima:
//	naziv
//	cenu
//	gettere i settere
//	konstruktore
//	metodu za stampanje koja stampa  podatke u formatu:
//	naziv - cena.din

	private String naziv;
	private double cena;

	public Sastojak() {

	}

	public Sastojak(String naziv, double cena) {
		super();
		this.naziv = naziv;
		this.cena = cena;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public void stampajSastojak() {
		System.out.println(this.getNaziv() + " - " + this.getCena() + "din.");
	}
}
