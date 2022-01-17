package p17_01;

public class Zadatak2 {

	public static void main(String[] args) {
//		2.Zadatak
//		Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
//		ime i prezime
//		broj licne karte
//		jmbg
//		podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
//		konstuktore
//		gettere i settere, jmbg ne sme da se menja
//		metodu stampaj, koja stmpa podatke u formatu:
//		ime i prezime, broj licne karte
//
//		Kreirati klasu Ugovor koja ima:
//		godinu, dan i mesec sklapanja ugovora
//		osobu koja prodaje nekretninu (fizicko lice)
//		osobu koja kupuje nekretninu (fizicko lice)
//		cenu za koju se prodaje nekretnina
//		adresu nekretnine (ulica br., grad)
//		metodu koja vraca procenat zarade
//		za osobu koja je vec kupovale nekretninu preko agencije je 0.02 dok je za one koji nisu 0.03
//		metodu koja racuna zaradu agencije pri prodaji nekretninte koja ukljucujei poreze, takse i usluge agencije, prema formuli:
//		1000 + cena za koju se prodaje * procenat zarade
//		metodu koja stampa ugovor u formatu:
//		Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju (print prodavca) i (print kupca) o kupovini nekretnine (adresa) po ceni od (cena nekretnin) pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od (zarada agencije)

		FizickoLice kupac = new FizickoLice("Djordje Pejcic", "5214874", "0102998730030");
		FizickoLice prodavac = new FizickoLice("Milan Milovanovic", "2548999", "0505990785212");
		Ugovor ugovor_1 = new Ugovor("10.12.2021.", prodavac, kupac, 35000, "Bozidara Adzije 25/2");

		kupac.setDaLiSteVecKupovaliStan(true);
		ugovor_1.getKupac();
		ugovor_1.getProdavac();
		ugovor_1.printUgovor(); 
	}

}
