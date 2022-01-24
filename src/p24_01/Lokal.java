package p24_01;

public class Lokal extends Objekat {
//	Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//	konstuktore
//	porez racuna po formuli koeficijent * povrsina * 1.3
//	prepisati metodu stampaj tako da stampa sve podatke vezane za lokal

	public Lokal(String adresa, double povrsina, int zona) {
		super(adresa, povrsina, zona);
	}

	@Override
	public double porez() {
		return koeficijentZone() * super.getPovrsina() * 1.3;
	}
	
	@Override
	public void print() {
		System.out.println("TIP OBJEKTA: LOKAL");
		System.out.println("Povrsina objekta: " + this.getPovrsina());
		System.out.println("Adresa: " + this.getAdresa());
		System.out.println("Zona: " + this.getZona());
		System.out.println("Porez: " + porez() + " din.");
		System.out.println();
	}

}
