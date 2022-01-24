package p24_01;

public class Kuca extends Objekat {
//	Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu, 
//	konstuktore, gettere i setter
//	porez racuna po formuli: koeficijent * povrsina.
//	prepisati metodu stampaj tako da stampa sve podatke vezane za kucu

	private int brojClanovaDomacinstva;
	
	public Kuca(String adresa, double povrsina, int zona, int brojClanovaDomacinstva) {
		super(adresa, povrsina, zona);
		this.brojClanovaDomacinstva = brojClanovaDomacinstva;

	}

	public int getBrojClanovaDomacinstva() {
		return brojClanovaDomacinstva;
	}

	public void setBrojClanovaDomacinstva(int brojClanovaDomacinstva) {
		this.brojClanovaDomacinstva = brojClanovaDomacinstva;
	}

	@Override
	public double porez() {
		return koeficijentZone() * super.getPovrsina();
	}

	@Override
	public void print() {
		System.out.println("TIP OBJEKTA: KUCA");
		System.out.println("Broj clanova domacinstva: " + this.getBrojClanovaDomacinstva());
		System.out.println("Povrsina objekta: " + this.getPovrsina());
		System.out.println("Adresa: " + this.getAdresa());
		System.out.println("Zona: " + this.getZona());
		System.out.println("Porez: " + porez() + " din.");
		System.out.println();
	}

}
