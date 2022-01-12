package p10_01;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		
		double uplata = 0;
		
		Racun dj = new Racun();

		dj.brojracuna = "840 - 1789666 - 80";
		dj.imeIPrezime = "Djordje Pejcic";
		dj.stanje = 200000;

		System.out.print("Unesite iznos za uplatu: ");
		
		uplata = s.nextDouble();
		
		dj.uplata(uplata);

		dj.stampaj();

		Racun j = new Racun();

		j.brojracuna = "840 - 1789666 - 890";
		j.imeIPrezime = "Jelena Pejcic";
		j.stanje = 0;

		System.out.print("Unesite iznos za uplatu: ");
		
		uplata = s.nextDouble();
		
		j.uplata(uplata);

		j.stampaj();
	}

}
