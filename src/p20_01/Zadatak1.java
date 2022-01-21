package p20_01;

public class Zadatak1 {

	public static void main(String[] args) {
//		1.Zadatak
//		Kreirati klasu Osoba koja od atributa ima:
//		ime i prezime
//		jmbg
//		konstuktor sa parametrima
//		metodu stampaj koja stampa podatke u formatu
//		ime prezime, jmbg
//
//		Kreirati klasu Student koja nasledjuje klasu Osoba, 
//		koja od dodatnih atributa ima:
//		broj indeksa
//		dug za skolarinu 
//		konstuktor sa parametrima
//		metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//		Napisati implementaciju metode stampaj da stampa sve podatke o studentu
//
//		Kreirati klasu Profesor koja nasledjuje klasu Osoba, 
//		koja od dodatnih atributa ima:
//		naziv predmeta koji predaje
//		iznos plate
//		konstuktor sa parametrima
//		metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//		Napisati implementaciju metode stampaj da stampa sve podatke o profesoru
//
//		U glavnom programu kreirati 2 studenta i 2 profesora.

		Student student1 = new Student("Djordje Pejcic", "0510990785021", 1520, 20000);
		Student student2 = new Student("Jelena Jelenkovic", "1012991756238", 420, 0);
		
		student1.uplatiSkolarinu(10000);
		student1.stampajSTudenta();
		
		student2.uplatiSkolarinu(100);
		student2.stampajSTudenta();
		
		Profesor profesor1 = new Profesor("Jelena Petrovic", "1001968875214", "Ekonomika turizma", 70000);
		Profesor profesor2 = new Profesor("Marija Bratic", "1002984725214", "Osnove turizma", 70000);
		
		profesor1.povecajPlatu(5);
		profesor2.povecajPlatu(2);
		
		profesor1.stampajProfesora();
		profesor2.stampajProfesora();

	}

}
