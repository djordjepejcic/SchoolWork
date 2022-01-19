package p18_01;

public class Zadatak1 {

	public static void main(String[] args) {
//		1.Zadatak
//
//		Kreirati klasu Sastojak koja ima:
//		naziv
//		cenu
//		gettere i settere
//		konstruktore
//		metodu za stampanje koja stampa  podatke u formatu:
//		naziv - cena.din
//			
//		Kreirati klasu Pasta koja ima:
//		niz sastojaka
//		metodu za dodavanje sastojka
//		(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
//		defaultni konstruktor
//		metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//		metodu za stampu koja stampa podatke u formatu:
//		Pasta je sa sastojcima:
//		naziv - cena.din
//		naziv - cena.din
//		naziv - cena.din
//		Cena paste je cena.din
//
//		U glavnom programu kreirati objekte i testirati funkcionalnosti 

		Sastojak sastojak_1 = new Sastojak("makarone", 50);
		Sastojak sastojak_2 = new Sastojak("4 sira", 120);
		Sastojak sastojak_3 = new Sastojak("slanina", 100);
		Sastojak sastojak_4 = new Sastojak("kutija", 20);

		Pasta pasta_1 = new Pasta();

		pasta_1.dodajSastojak(sastojak_1);
		pasta_1.dodajSastojak(sastojak_2);
		pasta_1.dodajSastojak(sastojak_3);
		pasta_1.dodajSastojak(sastojak_4);

		pasta_1.stampajPastu();
	}

}
