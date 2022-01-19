package p18_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Pasta {
//	Kreirati klasu Pasta koja ima:
//	niz sastojaka
//	metodu za dodavanje sastojka
//	(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
//	defaultni konstruktor
//	metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//	metodu za stampu koja stampa podatke u formatu:
//	Pasta je sa sastojcima:
//	naziv - cena.din
//	naziv - cena.din
//	naziv - cena.din
//	Cena paste je cena.din
//
//	U glavnom programu kreirati objekte i testirati funkcionalnosti 

	Scanner s = new Scanner(System.in);

	private ArrayList<Sastojak> listaSastojaka = new ArrayList<Sastojak>();

	public Pasta() {

	}

	public double cenaPaste() {
		double cena = 0;
		for (int i = 0; i < listaSastojaka.size(); i++) {
			cena = cena + listaSastojaka.get(i).getCena();
		}
		return cena;
	}

	public void dodajSastojak(Sastojak sastojak) {
		this.listaSastojaka.add(sastojak);
	}

	public void stampajPastu() {
		System.out.println("Pasta sa sastojcima: ");
		for (int i = 0; i < listaSastojaka.size(); i++) {
			this.listaSastojaka.get(i).stampajSastojak();
		}
		System.out.println("Cena je: " + this.cenaPaste() + "din.");
	}

	public void brisiSastojak() {
		System.out.print("Unesite sastojak koji hocete da izbrisete: ");
		String removeElement = s.next();
		for (int i = 0; i < listaSastojaka.size(); i++) {
			if (listaSastojaka.get(i).getNaziv().equalsIgnoreCase(removeElement)) {
				listaSastojaka.remove(i);
			}
		}
	}

}
