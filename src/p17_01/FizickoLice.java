package p17_01;

public class FizickoLice {
//	Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
//	ime i prezime
//	broj licne karte
//	jmbg
//	podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
//	konstuktore
//	gettere i settere, jmbg ne sme da se menja
//	metodu stampaj, koja stmpa podatke u formatu:
//	ime i prezime, broj licne karte

	private String imeIPrezime;
	private String brojLK;
	private String jmbg;
	private boolean daLiSteVecKupovaliStan;

	public FizickoLice(String imeIPrezime, String brojLK, String jmbg) {
		this.imeIPrezime = imeIPrezime;
		this.brojLK = brojLK;
		this.jmbg = jmbg;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getBrojLK() {
		return brojLK;
	}

	public void setBrojLK(String brojLK) {
		this.brojLK = brojLK;
	}

	public String getJmbg() {
		return jmbg;
	}

	public boolean isDaLiSteVecKupovaliStan() {
		return daLiSteVecKupovaliStan;
	}

	public void setDaLiSteVecKupovaliStan(boolean daLiSteVecKupovaliStan) {
		this.daLiSteVecKupovaliStan = daLiSteVecKupovaliStan;
	}

	public void print() {
		System.out.println(this.getImeIPrezime() + ", " + this.getBrojLK());
	}
}
