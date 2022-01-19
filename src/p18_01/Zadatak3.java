package p18_01;

public class Zadatak3 {

	public static void main(String[] args) {
//		3.Zadatak(Za vezbanje)
//		Za potrebe google istorije potrebno je kreirati sledece klase.
//		Klasu HistoryPage koja ima:
//		naziv stranice
//		link do stranice 
//		vreme otvaranja stranice - sat i minut (2 atributa)
//		username i password sacuvani za ovu stranicu (kao objasnjene ovo su kao kolacici za neki sajt)
//		konstuktore koji su logicni
//		gettere i setter (username i password nemaju settere)
//		metodu sacuvaj kredencijale za ovu stranicu. Metoda kao parametre  prima username i password i setuje te atribute.
//		Metoda obrisi kolacice koja setuje username i password na null.
//		Metoda stampaj koja stampa podatke u formatu:
//		[datum] - [ naziv ]…[ link ] [Ako postoje kredencijali stampa se zvezdica pored linka]
//
//
//		Klasu History koja ima:
//		niz stranica koje su posecene
//		metoda otvori stranicu koja dodaje novi historypage u niz.
//		metodu obrisi prema linku - metoda koja iz niza izbacuje stranicu prema linku
//		metoda obrisi kolacice za link - metoda koja za homepage brise kolacice
//		metoda obrisi istoriju - metoda brise celu istoriju
//		metoda sacuvajKredencija - od parametara se prima naziv stranice i username i password koji se cuvaju.
//		metoda pogledajIstoriju - stampa sve posecene stranice
//		metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.
//		metoda obrisiSveKolaciceZaSadnjihSatVremena-  brise kolacice za strnaice koje su ucitane u zadnjih sat vremena. Metoda kao parametar prima trenutno vreme (sat i minut)

		HistoryPage page_1 = new HistoryPage("GOOGLE", "google.rs", 21, 10);
		HistoryPage page_2 = new HistoryPage("YAHOO", "yahoo.com", 21, 11);
		HistoryPage page_3 = new HistoryPage("FACEBOOK", "facebook.com", 21, 15);

		page_1.sacuvajKredencijale("djodjo1234", "1234");
		page_2.sacuvajKredencijale("djodjo124", "1245");
		page_3.sacuvajKredencijale("djokaca09", "klo897");

		History history_1 = new History();
		history_1.otvoriStranicu(page_1);
		history_1.otvoriStranicu(page_2);
		history_1.otvoriStranicu(page_3);

		history_1.obrisiPremaLinku("google.rs");
		history_1.obrisiKolacicePremaLinku("google.rs");
		history_1.obrisiIstoriju();
		history_1.obrisiSveKolacice();
		history_1.obrisiSveKolaciceZaSadnjihSatVremena(21, 17);

		history_1.pogledajIstoriju();

	}

}
