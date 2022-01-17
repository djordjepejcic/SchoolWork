package p17_01;

public class Ugovor {
//	Kreirati klasu Ugovor koja ima:
//	godinu, dan i mesec sklapanja ugovora
//	osobu koja prodaje nekretninu (fizicko lice)
//	osobu koja kupuje nekretninu (fizicko lice)
//	cenu za koju se prodaje nekretnina
//	adresu nekretnine (ulica br., grad)
//	metodu koja vraca procenat zarade
//	za osobu koja je vec kupovale nekretninu preko agencije je 0.02 dok je za one koji nisu 0.03
//	metodu koja racuna zaradu agencije pri prodaji nekretninte koja ukljucujei poreze, takse i usluge agencije, prema formuli:
//	1000 + cena za koju se prodaje * procenat zarade
//	metodu koja stampa ugovor u formatu:
//	Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju (print prodavca) i (print kupca) o kupovini nekretnine (adresa) po ceni od (cena nekretnin) pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od (zarada agencije)

	private String datumSklapanajUgovora;
	private FizickoLice prodavac;
	private FizickoLice kupac;
	private int cena;
	private String adresa;

	public Ugovor() {

	}

	public Ugovor(String datumSklapanajUgovora, FizickoLice prodavac, FizickoLice kupac, int cena, String adresa) {
		this.datumSklapanajUgovora = datumSklapanajUgovora;
		this.prodavac = prodavac;
		this.kupac = kupac;
		this.cena = cena;
		this.adresa = adresa;
	}

	public String getDatumSklapanajUgovora() {
		return datumSklapanajUgovora;
	}

	public void setDatumSklapanajUgovora(String datumSklapanajUgovora) {
		this.datumSklapanajUgovora = datumSklapanajUgovora;
	}

	public FizickoLice getProdavac() {
		return prodavac;
	}

	public void setProdavac(FizickoLice prodavac) {
		this.prodavac = prodavac;
	}

	public FizickoLice getKupac() {
		return kupac;
	}

	public void setKupac(FizickoLice kupac) {
		this.kupac = kupac;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public double procenatZarade() {
		if (this.getKupac().isDaLiSteVecKupovaliStan()) {
			return 0.02;
		} else {
			return 0.03;
		}
	}

	public double zaradaAgencije() {
		return 1000 + this.getCena() * procenatZarade();
	}

	public void printUgovor() {
		System.out.println("Dana " + this.getDatumSklapanajUgovora() + "god sklopljen je ugovor izmedju ");
		this.getProdavac().print();
		System.out.println("o kupovini nekretnine " + this.getAdresa() + " po ceni od " + this.getCena()
				+ " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od "
				+ this.zaradaAgencije() + " EUR.");
	}
}
