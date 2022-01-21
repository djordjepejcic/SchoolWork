package p20_01;

public class Paket {
//	Kreirati klasu Paket koja ima:
//	naziv paketa
//	ime i prezime korisnika
//	mesecnu cenu
//	ugovorna obaveza
//	brzina interneta za download
//	brzina interneta za upload
//	getere, setere i konstuktore koji su logicni (brzine interneta nije moguce menjati kao i naziv paketa)
//	metodu produzi ugovor koja produzava ugovor za 12 meseci
//	metodu koja vraca broj meseci koliko korisnik ima po dinar. Uvek vraca nulu
//	metodu za stampu koja stampa podatke u formatu:
//	ime i prezime korisnika
//	naziv paketa - brzina download/brzina upload - ugovorna obaveza
//	cena

	protected String nazivPaketa;
	protected String imeIPrezimeKorisnika;
	protected double cena;
	protected int mesecnaObaveza;
	protected int brzinaDOwnload;
	protected int brzinaUpload;

	public Paket() {
	}

	public Paket(String nazivPaketa, String imeIPrezimeKorisnika, double cena, int mesecnaObaveza, int brzinaDOwnload,
			int brzinaUpload) {
		this.nazivPaketa = nazivPaketa;
		this.imeIPrezimeKorisnika = imeIPrezimeKorisnika;
		this.cena = cena;
		this.mesecnaObaveza = mesecnaObaveza;
		this.brzinaDOwnload = brzinaDOwnload;
		this.brzinaUpload = brzinaUpload;
	}

	public String getNazivPaketa() {
		return nazivPaketa;
	}

	public int getBrzinaDOwnload() {
		return brzinaDOwnload;
	}

	public int getBrzinaUpload() {
		return brzinaUpload;
	}

	public String getImeIPrezimeKorisnika() {
		return imeIPrezimeKorisnika;
	}

	public void setImeIPrezimeKorisnika(String imeIPrezimeKorisnika) {
		this.imeIPrezimeKorisnika = imeIPrezimeKorisnika;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public int getMesecnaObaveza() {
		return mesecnaObaveza;
	}

	public void setMesecnaObaveza(int mesecnaObaveza) {
		this.mesecnaObaveza = mesecnaObaveza;
	}

	public void produziUgovor() {
		this.mesecnaObaveza = this.getMesecnaObaveza() + 12;
	}

	public int kolikoMeseciZaDinar(int x) {
		return x;
	}

	public void stampaj() {
		System.out.println(this.getImeIPrezimeKorisnika());
		System.out.println(this.getNazivPaketa() + " - " + this.getBrzinaDOwnload() + "/" + this.getBrzinaUpload()
				+ " - " + this.getMesecnaObaveza());
		System.out.println(this.getCena());
		System.out.println();
	}
}
