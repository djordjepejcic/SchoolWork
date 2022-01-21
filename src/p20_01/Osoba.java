package p20_01;

public class Osoba {
//	Kreirati klasu Osoba koja od atributa ima:
//	ime i prezime
//	jmbg
//	konstuktor sa parametrima
//	metodu stampaj koja stampa podatke u formatu
//	ime prezime, jmbg

	protected String imeIPrezime;
	protected String jmbg;

	public Osoba() {

	}

	public Osoba(String imeIPrezime, String jmbg) {
		this.imeIPrezime = imeIPrezime;
		this.jmbg = jmbg;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public void stampajOsobu() {
		System.out.println(this.getImeIPrezime() + ", " + this.getJmbg());
	}
}
