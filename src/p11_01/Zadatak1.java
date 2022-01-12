package p11_01;

public class Zadatak1 {

	public static void main(String[] args) {

		int ogranicenje = 50;
		int trenutniDatum = 6;
		int kolikoSeToci = 30;

		Auto opel = new Auto();

		opel.imeIPrezime = "Djordje Pejcic";
		opel.markaAutomobila = "Opel";
		opel.brojVrata = 5;
		opel.potrosnja = 6.7;
		opel.brzina = 120;
		opel.registracija = "NI-137-MI";
		opel.klima = true;
		opel.godProizvodnje = 2007;
		opel.doKadJeRegistrovan = 6;
		opel.kubikaza = 2500;
		opel.kapacitetRezervoara = 45;
		opel.trenutnaLitraza = 10;

		opel.stampa();

		opel.prekoracenje(ogranicenje);
		if (opel.prekoracenje(ogranicenje)) {
			System.out.println("Prekoracili ste brzinu!!!");
			System.out.println(
					"Prekoracili ste brzinu!!! Kazna shodno brzini voznje je: " + opel.novcanaKazna(ogranicenje));
		} else {
			System.out.println("Hvala Vam sto savesno vozite.");
			System.out.println("Hvala Vam sto vozite primerenom brzinom.");
		}

		opel.dodajGas();
		System.out.println("Ubrzali ste. Trenutna brzina je " + opel.brzina + "km/h.");
		opel.koci();
		System.out.println("Usporili ste ste. Trenutna brzina je " + opel.brzina + "km/h.");
		opel.potrosnjaAuta();
		System.out.println();
		System.out.println("Trenutna potrosnja je: " + opel.potrosnjaAuta() + "l / 100km.");

		if (opel.oldtimer()) {
			System.out.println("Automobil je oldtajmer.");
		} else {
			System.out.println("Automobil nije oldtajmer.");
		}

		if (opel.daLiJeIsteklaRegistracija(trenutniDatum)) {
			System.out.println("Registracija je aktivna.");
		} else {
			System.out.println("Registracija je istekla.");
			System.out.println("Cena za registraciju je: " + opel.cenaZaRegistraciju() + "din.");
		}

		System.out.println("Racun za gorivo je: " + opel.natociGorivo(kolikoSeToci) + " dinara.");

		System.out.println();
		System.out.println();

		Auto fiat = new Auto();

		fiat.imeIPrezime = "Djordje Pejcic";
		fiat.markaAutomobila = "Fiat Egea";
		fiat.brojVrata = 5;
		fiat.potrosnja = 8.7;
		fiat.brzina = 130;
		fiat.registracija = "NI-150-XI";
		fiat.klima = false;
		fiat.godProizvodnje = 1949;
		fiat.doKadJeRegistrovan = 2;
		fiat.kubikaza = 1900;
		fiat.kapacitetRezervoara = 40;
		fiat.trenutnaLitraza = 20;

		fiat.stampa();

		fiat.prekoracenje(ogranicenje);
		if (fiat.prekoracenje(ogranicenje)) {
			System.out.println("Prekoracili ste brzinu!!!");
			System.out.println(
					"Prekoracili ste brzinu!!! Kazna shodno brzini voznje je: " + fiat.novcanaKazna(ogranicenje));
		} else {
			System.out.println("Hvala Vam sto savesno vozite.");
			System.out.println("Hvala Vam sto vozite primerenom brzinom.");
		}

		fiat.dodajGas();
		System.out.println("Ubrzali ste. Trenutna brzina je " + fiat.brzina + "km/h.");
		fiat.koci();
		System.out.println("Usporili ste ste. Trenutna brzina je " + fiat.brzina + "km/h.");
		fiat.potrosnjaAuta();
		System.out.println();
		System.out.println("Trenutna potrosnja je: " + fiat.potrosnjaAuta() + "l / 100km.");

		if (fiat.oldtimer()) {
			System.out.println("Automobil je oldtajmer.");
		} else {
			System.out.println("Automobil nije oldtajmer.");
		}

		if (fiat.daLiJeIsteklaRegistracija(trenutniDatum)) {
			System.out.println("Registracija je aktivna.");
		} else {
			System.out.println("Registracija je istekla.");
			System.out.println("Cena za registraciju je: " + fiat.cenaZaRegistraciju() + "din.");
		}

		System.out.println("Racun za gorivo je: " + fiat.natociGorivo(kolikoSeToci) + " dinara.");

		System.out.println();
		System.out.println();
		if (opel.daLiIduIstomBrzinom(fiat)) {
			System.out.println("Automobili se krecu istom brzinom.");
		} else {
			System.out.println("Automobili se ne krecu istom brzinom.");
		}

	}

}
