package p17_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

//	3.Zadatak
//	Kreirati klasu Sastojak koja ima:
//	naziv sastojka
//	cenu 
//	gettere i settere 
//	konstuktore
//
//	U glavnom programu kreirati 3 sastojka.
//	U glavnom programu kreirati niz sastojaka ucitavajuci ih od korisnika. Ucitavaju se N sastojaka i na kraju odstampati niz. Koristeci ArrayList-e

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite broj sastojaka: ");
		int n = s.nextInt();

		ArrayList<Sastojak> nizSastojaka = new ArrayList<Sastojak>();

		for (int i = 0; i < n; i++) {
			System.out.print("Unesite naziv: ");
			String naziv = s.next();
			System.out.print("Unesite cenu: ");
			double cena = s.nextInt();
			Sastojak sastojak_1 = new Sastojak(naziv, cena);
			nizSastojaka.add(sastojak_1);
		}
		
		System.out.println("Koji element zelite da obrisete sa liste? ");
		String removeElement = s.next();

		for (int i = 0; i < nizSastojaka.size(); i++) {
			if (nizSastojaka.get(i).getNaziv().equals(removeElement)) {
				nizSastojaka.remove(i);
			}
		}

		System.out.println();
		System.out.println("Sastojci: ");

		for (int i = 0; i < nizSastojaka.size(); i++) {
			System.out.println("Naziv: " + nizSastojaka.get(i).getNaziv());
			System.out.println("Cena: " + nizSastojaka.get(i).getCena());
		}
	}

}
