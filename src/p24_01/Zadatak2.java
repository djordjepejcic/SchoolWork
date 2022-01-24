package p24_01;

public class Zadatak2 {

	public static void main(String[] args) {
//		Zadatak 2. 
//		Kreirati apstraktnu klasu Atleticar �iji su tributi: 
//		ime i prezime privatni
//		i rezultat ostvaren na takmi�enju koji je zasticen
//		Javne metode klase su: 
//		apstratktna metoda koja ispituje da li je rezultat atleti�ara bolji od rezultata drugog atleti�ara (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
//		metoda koja stampa podataka o atleti�aru u formatu: (ime) (prezime), (rezultat)
//		
//		Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar. Kod trka�a je bolji manji rezultat, a kod skaka�a ve�i. 
//		Kreirati i klasu Disciplina �iji su privatni atributi: 
//		ime discipline
//		tip discipline (Trkacka ili Skakacka)
//		niz atleti�ara koji u�estvuju u toj disciplini. 
//		U javnom delu klase definisati: 
//		konstuktore, gettere i settere
//		konstruktor koji postavlja ime discipline i tip
//		metodu dodaj atleticara u disciplinu
//		metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
//		privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom 
//		metoda koja prikazuje podatke o pobedniku discipline. 
//		U funkciji main kreirati discipline �Skok u dalj� i �110m s preponama� sa proizvoljnim brojem u�esnika, u�itati podatke o u�esnicima obe discipline sa tastature i na ekranu prikazati poruke o pobednicima obe discipline. 
		
		Atleticar atleticar_1 = new Trkac("Stefan Jovic", 100);
		Atleticar atleticar_2 = new Trkac("Stefan Mileusnic", 50);
		Atleticar atleticar_3 = new Trkac("Stefan Lalic", 150);

		Disciplina disciplina_1 = new Disciplina("110m sa preponama", "Trkacka");
		disciplina_1.dodajAtleticara(atleticar_1);
		disciplina_1.dodajAtleticara(atleticar_2);
		disciplina_1.dodajAtleticara(atleticar_3);
		
		disciplina_1.printPobednik();
		
		Atleticar atleticar_4 = new Skakac("Stefan Jovic", 100);
		Atleticar atleticar_5 = new Skakac("Stefan Mileusnic", 50);
		Atleticar atleticar_6 = new Skakac("Stefan Lalic", 150);
		
		Disciplina disciplina_2 = new Disciplina("Skok u dalj", "Skakacka");
		disciplina_2.dodajAtleticara(atleticar_4);
		disciplina_2.dodajAtleticara(atleticar_5);
		disciplina_2.dodajAtleticara(atleticar_6);
		
		disciplina_2.diskfalifikujAtleticara("Stefan Lalic");
		
		disciplina_2.printPobednik();


	}

}
