package p17_01;

public class Zadatak3 {

	public static void main(String[] args) {
//		3. Zadatak (Za vezbanje)
//		Kreirati klasu ViberKorisnik koja ima:
//		ime i prezime
//		broj telefona
//		da li je trenutno aktivan (boolean)
//		gettere, settere, konstuktore
//
//		Kreirati klasu ViberPoruka koja ima:
//		tekst poruke
//		vreme kad je poslata poruka
//		korisnika koji je poslao poruku
//		korisnika kome je poslata poruka
//		gettere i setere i konstuktore
//		rekaciju na poruku
//		metodu prikazi koja stampa podatke o poruci u formatu:
//		From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
//		To: [Ime i prezime korisnika kome je poslata]
//		[Tekst poruke] : [reakcija] from [korisnik koji je reagovao]
//
//		POMOC: Trebace vam provera da li reakcija postoji to pravite u if-u
//		if (this.reakcija != null)
//
//		Kreirati klasu ViberReakcija koja ima:
//		emoji (moze da bude sunglases, heart, smile, like ili sad)
//		korisnika koji je reagovao
//		U mainu kreirati nekoliko poruka izmedju dva korisnika i postavite nekoliko reakcija na poruke.

		ViberKorisnik dj = new ViberKorisnik();
		ViberKorisnik j = new ViberKorisnik();
		ViberKorisnik m = new ViberKorisnik();

		dj.setImeIPrezime("Djordje");
		dj.setBrojTelefona("0618585645");
		dj.setDaLiJeAktivan(true);

		j.setImeIPrezime("Jelena");
		j.setBrojTelefona("0645897971");
		j.setDaLiJeAktivan(false);

		m.setImeIPrezime("Mihajlo");
		m.setBrojTelefona("063258987");
		m.setDaLiJeAktivan(true);

		ViberReakcija reakcija_1 = new ViberReakcija();
		reakcija_1.setReaktor(m);
		reakcija_1.setReakcija("sunglasses");

		ViberPoruka poruka_1 = new ViberPoruka("Javi se!!!", "12:38", dj, j, reakcija_1);

		poruka_1.prikazi();
	}

}
