package p20_01;

public class Student extends Osoba {
//	Kreirati klasu Student koja nasledjuje klasu Osoba, 
//	koja od dodatnih atributa ima:
//	broj indeksa
//	dug za skolarinu 
//	konstuktor sa parametrima
//	metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//	Napisati implementaciju metode stampaj da stampa sve podatke o studentu

	private int brojIndeksa;
	private int dugZaSkolarinu;

	public Student() {
		super();
	}

	public Student(String imeIPrezime, String jmbg, int brojIndeksa, int dugZaSkolarinu) {
		super(imeIPrezime, jmbg);
		this.brojIndeksa = brojIndeksa;
		this.dugZaSkolarinu = dugZaSkolarinu;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public int getDugZaSkolarinu() {
		return dugZaSkolarinu;
	}

	public void setDugZaSkolarinu(int dugZaSkolarinu) {
		this.dugZaSkolarinu = dugZaSkolarinu;
	}

	public void uplatiSkolarinu(int uplata) {
		this.dugZaSkolarinu = this.getDugZaSkolarinu() - uplata;
		if (this.getDugZaSkolarinu() <= 0) {
			this.dugZaSkolarinu = 0;
		}
	}

	public void stampajSTudenta() {
		stampajOsobu();
		System.out.println("Broj indeksa: " + this.getBrojIndeksa());
		System.out.println("Dug za skolarinu: " + this.getDugZaSkolarinu());
		System.out.println();
	}

}
