package p24_01;

public class Zgrada extends Objekat {
//	Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//	broj stanova
//	konstuktore, gettere i setter
//	porez racuna po formuli koeficijent * povrsina * broj stanova
//	prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu

	private int brojStanova;

	public Zgrada(String adresa, double povrsina, int zona, int brojStanova) {
		super(adresa, povrsina, zona);
		this.brojStanova = brojStanova;
	}

	public int getBrojStanova() {
		return brojStanova;
	}

	public void setBrojStanova(int brojStanova) {
		this.brojStanova = brojStanova;
	}

	@Override
	public double porez() {
		return koeficijentZone() * this.getBrojStanova();
	}

	@Override
	public void print() {
		System.out.println("TIP OBJEKTA: ZGRADA");
		System.out.println("Broj stanova: " + this.getBrojStanova());
		System.out.println("Povrsina objekta: " + this.getPovrsina());
		System.out.println("Adresa: " + this.getAdresa());
		System.out.println("Zona: " + this.getZona());	
		System.out.println("Porez: " + porez() + " din.");
		System.out.println();
	}

	
}
