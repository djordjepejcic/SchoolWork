package p21_01;

public class Pica extends Proizvod {
//	Kreirati klasu Pica koja nasledjuje klasu Proizvod i koja ima:
//	cena podloge
//	override uje metodu koja ukupnu racuna cenu tako sto na cenu 
//	svih dodataka doda i cenu podloge
//	override uje metodu stampaj da stampa sve podatke

	private double cenaPodloge;

	public Pica() {

	}

	public Pica(double cenaPodloge) {
		super();
		this.cenaPodloge = cenaPodloge;
	}

	@Override
	public double RacunajUkupnuCenu() {
		return cenaSvihSastojaka() + this.cenaPodloge;
	}

	@Override
	public void print() {
		System.out.println("PICA: ");
		for (int i = 0; i < nizSastojka.size(); i++) {
			nizSastojka.get(i).print();
		}
		System.out.println("Cena podloge: " + this.cenaPodloge);
		System.out.println();
		System.out.println("Cena svih sastojaka: " + RacunajUkupnuCenu() + "din.");
		System.out.println();
	}
}
