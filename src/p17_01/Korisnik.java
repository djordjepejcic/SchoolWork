package p17_01;

public class Korisnik {
//	Kreirati klasu Korisnik koja ima:
//	ime i prezime 
//	tip licence (basic/pro/premium)
//	konstruktore. Po difoltu korisnik ima basic licencu.
//	gettere i settere za sve atribute, sem za tip licence koja ne moze da se menja
//	metodu pretplati se koja postavlja licencu u zavisnosi od uplacene sume:
//	ako je uplata 100, postavlja licencu na “pro”
//	ako je uplata 150, postavlja licencu na “premium”
//	Metoda kao parametar prima vrednost uplate $100 ili $150
//	metodu ponisti pretplatu koja postavlja licencu na basic
//	metodu koja vraca maksimalnu duzinu trajanja video poziva u zavisnosti od licence
//	ako je basic, vraca 40min
//	ako je pro, vraca 240min
//	ako je  premium, vraca 1440min
//	metodu za stampu koja stampa u formatu:
//	ime i prezime

	private String imeIPrezime;
	private String tipLicence;

	public Korisnik() {
		this.tipLicence = "basic";
	}

	public Korisnik(String imeIPrezime) {
		this.setImeIPrezime(imeIPrezime);
		this.tipLicence = "basic";
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getTipLicence() {
		return tipLicence;
	}

	public void pretplati(int uplata) {
		if (uplata == 100) {
			this.tipLicence = "pro";
		} else if (uplata == 150) {
			this.tipLicence = "premium";
		}
	}

	public void ponistiPretplatu() {
		this.tipLicence = "basic";
	}

	public int duzinaTrajanjaPoziva() {
		if (this.tipLicence.equalsIgnoreCase("basic")) {
			return 40;
		} else if (this.tipLicence.equalsIgnoreCase("pro")) {
			return 240;
		} else {
			return 1440;
		}
	}

	public void print() {
		System.out.println(this.imeIPrezime);
	}
}
