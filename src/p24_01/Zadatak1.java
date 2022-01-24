package p24_01;

public class Zadatak1 {

	public static void main(String[] args) {
//		Zadatak 1. 
//		Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi:
//		adresa (ulica i broj)
//		povrsina objekta
//		zona (1, 2 ili 3)
//		konstuktore, gettere i settere
//		metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
//		zona 1, koeficijent je 1.4
//		zona 2, koeficijent je 1.1
//		zona 3, koeficijent je 1.05
//		abstraktnu metodu koja racuna i vraca porez objekta
//		abstraktnu metodu stampaj 
//
//		Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu, 
//		konstuktore, gettere i setter
//		porez racuna po formuli: koeficijent * povrsina.
//		prepisati metodu stampaj tako da stampa sve podatke vezane za kucu
//
//		Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//		broj stanova
//		konstuktore, gettere i setter
//		porez racuna po formuli koeficijent * povrsina * broj stanova
//		prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu
//			
//		Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//		konstuktore
//		porez racuna po formuli koeficijent * povrsina * 1.3
//		prepisati metodu stampaj tako da stampa sve podatke vezane za lokal
//
//		Kreirati klasu PoreskaUprava koja za atribute ima:
//		ime grada u kom se nalazi
//		niz objekata
//		metodu dodaj objekat
//		metodu koja vraca objekat sa najvecim porezom
//		metodu koja vraca objekat sa najmanjim porezom
//		metodu koja racuna ukupan porez za ceo grad
//		metodu koja stampa sve objekte
//		U glavnom programu napraviti jednu poresku upravu i u nju dodati minimum 3 razlicita objekta i istestirati sve metode.

		Objekat objekat_1 = new Kuca("Kej Kej", 100, 1, 4);
		
		Objekat objekat_2 = new Zgrada("Kej Kej1", 50, 2, 10);
		
		Objekat objekat_3 = new Lokal("Kej Kej2", 25, 3);

		PoreskaUprava pu1 = new PoreskaUprava("Nis");
		
		pu1.dodajObjekat(objekat_1);
		pu1.dodajObjekat(objekat_2);
		pu1.dodajObjekat(objekat_3);
		
		pu1.printAll();
		
		System.out.println();
		System.out.println("Objekat sa najmanjim porezom je na adresi: " + pu1.najmanjiPorez().getAdresa());
		System.out.println();
		System.out.println("Objekat sa najvecim porezom je na adresi: " + pu1.najveciPorez().getAdresa());

	}

}
