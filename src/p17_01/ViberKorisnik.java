package p17_01;

public class ViberKorisnik {
//	Kreirati klasu ViberKorisnik koja ima:
//	ime i prezime
//	broj telefona
//	da li je trenutno aktivan (boolean)
//	gettere, settere, konstuktore

	private String imeIPrezime;
	private String brojTelefona;
	private boolean daLiJeAktivan;

	public ViberKorisnik() {

	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public String getBrojTelefona() {
		return brojTelefona;
	}

	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}

	public boolean isDaLiJeAktivan() {
		return daLiJeAktivan;
	}

	public void setDaLiJeAktivan(boolean daLiJeAktivan) {
		this.daLiJeAktivan = daLiJeAktivan;
	}

}
