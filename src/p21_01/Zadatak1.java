package p21_01;

public class Zadatak1 {

	public static void main(String[] args) {
//		1.Zadatak
//
//		Kreirati klasu Student koja ima:
//		ime i prezime studenta
//		broj indeksa
//		godinu studija
//		gettere, settere i konstruktore
//		metodu koja racuna i vraca cenu skolarine, metoda vraca 0 u ovoj klasi.
//		metodu koja vraca da li je student na buzetu ili ne, uvek vraca true
//		metodu koja stampa podatke u formatu:
//		ime i prezime, broj indeksa, godina studija
//		Finansiranje: budzet/samofinansirajuci
//		Cena skolarine: cena
//
//		Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
//		koja za cenu skolarine vraca 90000
//		za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija
//
//		Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
//		koja za cenu skolarine vraca 100000
//		za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
//		U glavnoj klasi kreirati studente i testirati funkciolanosti

		StudentOsnovnih student1 = new StudentOsnovnih("Djordje Pejcic", 1520, 7);
		StudentOsnovnih student2 = new StudentOsnovnih("Djordje Pejcic", 1520, 2);
		StudentMaster student3 = new StudentMaster("Djordje Pejcic", 420, 1);
		StudentMaster student4 = new StudentMaster("Djordje Pejcic", 420, 3);

		student1.print();
		student2.print();
		student3.print();
		student4.print();
	}

}
