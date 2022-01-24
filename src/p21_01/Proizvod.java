package p21_01;

import java.util.ArrayList;

public abstract class Proizvod {
//	Kreirati abstraktnu klasu Proizvod koja ima:
//	niz dodataka
//	metodu ubaciDodatak koja dodaje dodatak u niz
//	metodu koja vraca cenu svih dodataka koje ima proizvod
//	abstraktnu metodu ukupnu racunaj cenu 
//	abstraktnu metodu stampaj

	protected ArrayList<Dodatak> nizSastojka = new ArrayList<>();

	public void dodajSastojak(Dodatak sastojak) {
		nizSastojka.add(sastojak);
	}

	public double cenaSvihSastojaka() {
		double cenaSvihSastojaka = 0;
		for (int i = 0; i < nizSastojka.size(); i++) {
			cenaSvihSastojaka = cenaSvihSastojaka + nizSastojka.get(i).getCenaDodatka();
		}
		return cenaSvihSastojaka;
	}

	public abstract double RacunajUkupnuCenu();

	public abstract void print();

}
