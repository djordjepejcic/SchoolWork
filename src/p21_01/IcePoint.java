package p21_01;

public class IcePoint extends Proizvod {
//	Kreirati klasu IcePoint koja nasledjuje klasu Proizvod i koja ima:
//	tip sladoleda (vanila, cokolada)
//	atribut koji kaze da li je mali ice point ili veliki (promenljiva tipa boolean)
//	override uje metodu koja ukupnu cenu racuna:
//	ako je mali ice point na cenu svih dodataka doda 100
//	ako je veliki ice point cenu svih dodataka doda 130
//	override uje metodu stampaj da stampa sve podatke

	private String tipSladoleda;
	private boolean maliVeliki;

	public IcePoint() {
		super();
	}

	public IcePoint(String tipSladoleda, boolean maliVeliki) {
		super();
		this.tipSladoleda = tipSladoleda;
		this.maliVeliki = maliVeliki;
	}

	@Override
	public double RacunajUkupnuCenu() {
		return maliVeliki ? (cenaSvihSastojaka() + 100) : (cenaSvihSastojaka() + 130);
	}

	@Override
	public void print() {
		System.out.print("Tip sladoleda: " + this.tipSladoleda.toUpperCase());
		if (maliVeliki) {
			System.out.print(" || Mali sladoled.");
		} else {
			System.out.print(" || Veliki sladoled.");
		}
		System.out.println();
		for (int i = 0; i < nizSastojka.size(); i++) {
			nizSastojka.get(i).print();
		}
		System.out.println();
		System.out.println("Cena svih sastojaka: " + RacunajUkupnuCenu() + "din.");
		System.out.println();
	}

}
