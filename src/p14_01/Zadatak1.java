package p14_01;

public class Zadatak1 {

	public static void main(String[] args) {
//		1.Zadatak
//		Kreirati klasu Film koja ima:
//		naziv filma
//		iz koje godine je film 
//		konstruktore, gettere i settere koji su potrebni
//		metodu print koja stampa podatke u formatu
//		naziv filma, godina
//
//
//		Kreirati klasu Reziser koja ima:
//		ime i prezime rezisera
//		startost
//		konstruktore, gettere i settere koji su potrebni
//		metodu print koja stampa podatke u formatu
//		ime prezime, starost.god
//
//		U main metodi, kreirati jedan film i jednog rezisera i 
//		pozvati svaku od metoda

		
		Movie titanic = new Movie("Titanic", 1997);
		Director jamesCameron = new Director("James Cameron", 67);
		titanic.setDirector(jamesCameron);
		titanic.print();

	}

}
