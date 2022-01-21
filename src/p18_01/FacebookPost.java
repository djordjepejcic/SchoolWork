package p18_01;

import java.util.ArrayList;

public class FacebookPost {
//	Kreirati klasu FacebookPost koja ima:
//	ime i prezime korisnika koji je stavio oglas
//	tekst objave
//	niz reakcija
//	metodu reaguj, koja dodaje reakciju u niz
//	(modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post (tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
//	Primer: Milan - lajkuje
//		 Nemanja - lajkuje
//		 Milan - daje srce
//	Post ima lajk od Nemanje i srce od Milana.
//	privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//	metodu stampaj koja stampa podatke u formatu:
//	ime i prezime
//	tekst objave
//	Smajli 10 | Like 15 | Srce 2

	private String imeIPrezimeOglas;
	private String tekst;
	private ArrayList<Reakcija> listaReakcija = new ArrayList<Reakcija>();

	public FacebookPost() {

	}

	public FacebookPost(String imeIPrezimeOglas, String tekst) {
		this.imeIPrezimeOglas = imeIPrezimeOglas;
		this.tekst = tekst;
	}

	public String getImeIPrezimeOglas() {
		return imeIPrezimeOglas;
	}

	public void setImeIPrezimeOglas(String imeIPrezimeOglas) {
		this.imeIPrezimeOglas = imeIPrezimeOglas;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

//	metodu reaguj, koja dodaje reakciju u niz
//	(modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post (tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
//	Primer: Milan - lajkuje
//		 Nemanja - lajkuje
//		 Milan - daje srce
//	Post ima lajk od Nemanje i srce od Milana.
//	privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//	metodu stampaj koja stampa podatke u formatu:
//	ime i prezime
//	tekst objave
//	Smajli 10 | Like 15 | Srce 2

	public void reaguj(Reakcija reakcija) {
		for (int i = 0; i < listaReakcija.size(); i++) {
			if (listaReakcija.get(i).getImeIPrezimeReakcije().equals(reakcija.getImeIPrezimeReakcije())) {
				listaReakcija.remove(i);
			}
		}
		this.listaReakcija.add(reakcija);
	}

	private int brojReakcija(String tipReakcije) { // ovde prosledi tip reakcije a to je string
		int brojReakcija = 0;
		for (int i = 0; i < listaReakcija.size(); i++) {
			if (listaReakcija.get(i).getTipReakcije().equals(tipReakcije)) {
				brojReakcija++;
			}
		}
		return brojReakcija;
	}

//	Smajli 10 | Like 15 | Srce 2
	public void print() {
		System.out.println(this.getImeIPrezimeOglas());
		System.out.println(this.getTekst());
		System.out.print("| smajli " + this.brojReakcija("smajli") + " | srce " + this.brojReakcija("srce") + " | lajk "
				+ this.brojReakcija("lajk"));

	}

}
