package p17_01;

public class ViberReakcija {
//	Kreirati klasu ViberReakcija koja ima:
//	emoji (moze da bude sunglases, heart, smile, like ili sad)
//	korisnika koji je reagovao

	private String reakcija;
	private ViberKorisnik reaktor;

	public ViberReakcija() {

	}

	public String getReakcija() {
		return reakcija;
	}

	public void setReakcija(String reakcija) {
		this.reakcija = reakcija;
	}

	public ViberKorisnik getReaktor() {
		return reaktor;
	}

	public void setReaktor(ViberKorisnik reaktor) {
		this.reaktor = reaktor;
	}

}
