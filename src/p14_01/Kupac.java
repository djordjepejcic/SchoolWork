package p14_01;

public class Kupac {
//	Kreirati klasu Kupac koja ima:
//	ime i prezime
//	clansku kartu
//	gettere i settere, clanska karta ne moze da se menja
//	konstruktore
//	metodu stampaj koja stampa u formatu
//	ime i prezime - broj kartice

	private String imePrezime;
	private ClanskaKartica clanskaKartica;
	
	public Kupac () {
		
	}
	
	public Kupac (String imePrezime) {
		this.imePrezime = imePrezime;
	}
	
	public String getImePrezime () {
		return this.imePrezime;
	}
	 
	public void setImePrezime (String imePrezime) {
		this.imePrezime = imePrezime;
	}
	
	public ClanskaKartica getClanskaKartica () {
		return this.clanskaKartica;
	}
	
	public void setClanskaKartica (ClanskaKartica clanskaKartica) {
		this.clanskaKartica = clanskaKartica;
	}
	
	public void stampaj () {
		System.out.println(getImePrezime() + " - " + this.clanskaKartica.getBrojKartice());
		
	}
}
