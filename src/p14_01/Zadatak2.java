package p14_01;

public class Zadatak2 {

	public static void main(String[] args) {
//		2.Zadatak
//		Kreirati klasu Korisnik koja ima
//		ime
//		prezime
//		gettere i settere za ime i prezime
//		konstuktore koje mislite da su vam potrebni
//		metoda koja stampa u formatu:
//		(ime) (prezime)
//
//		Kreirati klasu FacebookPost
//		opis
//		korisnik (referenca na korisnika koji je kreirao post)
//		konstrukore koje mislite da su vam potrebni
//		metoda print, stampa u formatu:
//		(ime) (prezime)
//		(opis post-a)
//
//		U main metodi, kreirati jedan facebook post i jednog 
//		korisnika i pozvati svaku od metoda

		FacebookPost post_1 = new FacebookPost("Tekst objave...");
		User dj = new User("Djordje", "Pejcic");
		post_1.setUser(dj);
		post_1.print();

	}

}
