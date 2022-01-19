package p18_01;

public class Zadatak2 {

	public static void main(String[] args) {
//		2.Zadatak
//		Kreirati klasu Reakcija koja ima 
//		tip reakcije (smajli, like, srce)
//		ime i prezime korisnika koji je reagovao 
//		gettere, settere i konstruktore
//	
//		Kreirati klasu FacebookPost koja ima:
//		ime i prezime korisnika koji je stavio oglas
//		tekst objave
//		niz reakcija
//		metodu reaguj, koja dodaje reakciju u niz
//		(modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post (tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
//		Primer: Milan - lajkuje
//			 Nemanja - lajkuje
//			 Milan - daje srce
//		Post ima lajk od Nemanje i srce od Milana.
//		privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//		metodu stampaj koja stampa podatke u formatu:
//		ime i prezime
//		tekst objave
//		Smajli 10 | Like 15 | Srce 2

		Reakcija srce = new Reakcija("srce", "Djordje Pejcic");
		Reakcija smajli = new Reakcija("smajli", "Djordje Pejcic");
		Reakcija like = new Reakcija("lajk", "Marko Markovic");
		Reakcija srce_1 = new Reakcija("srce", "Mika Mikic");
		
		FacebookPost post_1 = new FacebookPost("Luka Lukic", "Super si.");
		
		post_1.reaguj(srce);
		post_1.reaguj(smajli);
		post_1.reaguj(like);
		post_1.reaguj(srce_1);
		
		post_1.print();
	}

}
