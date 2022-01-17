package p17_01;

public class ViberPoruka {
//	Kreirati klasu ViberPoruka koja ima:
//	tekst poruke
//	vreme kad je poslata poruka
//	korisnika koji je poslao poruku
//	korisnika kome je poslata poruka
//	gettere i setere i konstuktore
//	rekaciju na poruku
//	metodu prikazi koja stampa podatke o poruci u formatu:
//	From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
//	To: [Ime i prezime korisnika kome je poslata]
//	[Tekst poruke] : [reakcija] from [korisnik koji je reagovao]

	private String tekst;
	private String vremeKadJePorukaPoslata;
	private ViberKorisnik posaljioc;
	private ViberKorisnik primalac;
	private ViberReakcija reakcija;

	public ViberPoruka(String tekst, String vremeKadJePorukaPoslata, ViberKorisnik posaljioc, ViberKorisnik primalac,
			ViberReakcija reakcija) {
		this.tekst = tekst;
		this.vremeKadJePorukaPoslata = vremeKadJePorukaPoslata;
		this.posaljioc = posaljioc;
		this.primalac = primalac;
		this.reakcija = reakcija;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public String getVremeKadJePorukaPoslata() {
		return vremeKadJePorukaPoslata;
	}

	public void setVremeKadJePorukaPoslata(String vremeKadJePorukaPoslata) {
		this.vremeKadJePorukaPoslata = vremeKadJePorukaPoslata;
	}

	public ViberKorisnik getPosaljioc() {
		return posaljioc;
	}

	public void setPosaljioc(ViberKorisnik posaljioc) {
		this.posaljioc = posaljioc;
	}

	public ViberKorisnik getPrimalac() {
		return primalac;
	}

	public void setPrimalac(ViberKorisnik primalac) {
		this.primalac = primalac;
	}

	public ViberReakcija getReakcija() {
		return reakcija;
	}

	public void setReakcija(ViberReakcija reakcija) {
		this.reakcija = reakcija;
	}

//	metodu prikazi koja stampa podatke o poruci u formatu:
//	From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
//	To: [Ime i prezime korisnika kome je poslata]
//	[Tekst poruke] : [reakcija] from [korisnik koji je reagovao]

	public void prikazi() {
		System.out.println("From: " + this.getPosaljioc().getImeIPrezime() + " * ");
		if (this.getPosaljioc().isDaLiJeAktivan()) {
			System.out.print("Active Now ");
		} else {
			System.out.print("Not Active ");
		}
		System.out.print("at " + this.getVremeKadJePorukaPoslata());
		System.out.println();
		System.out.println("To: " + this.getPrimalac().getImeIPrezime());
		if (this.getReakcija() != null) {
			System.out.println(this.getTekst() + " : " + this.getReakcija().getReakcija() + " from "
					+ this.getReakcija().getReaktor().getImeIPrezime());
		} else {
			System.out.println(this.getTekst());
		}

	}
}
