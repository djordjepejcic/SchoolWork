package p21_01;

public class Zadatak5 {

	public static void main(String[] args) {
//	5. Zadatak
//	Caribic zeli da napravi program koji omogucava da se kreira proizvod sa proizvoljnim brojem podataka
//	Npr: Ice point vanila sa dodacima: plazma, cokolada
//	Npr: Pica sa dodacima: kackavalj, masline, kecap, majonez
//
//	Kreirati klasu Dodatak ili Sastojak kako hocete koja ima:
//	naziv dodatka
//	cenu dodatka
//	konstruktore, gettere i settere koji su vam potrebni
//	metodu stampaj koja stampa u formatu:
//	(dodatak)  (cena)
//
//	Kreirati abstraktnu klasu Proizvod koja ima:
//	niz dodataka
//	metodu ubaciDodatak koja dodaje dodatak u niz
//	metodu koja vraca cenu svih dodataka koje ima proizvod
//	abstraktnu metodu ukupnu racunaj cenu 
//	abstraktnu metodu stampaj
//
//	Kreirati klasu IcePoint koja nasledjuje klasu Proizvod i koja ima:
//	tip sladoleda (vanila, cokolada)
//	atribut koji kaze da li je mali ice point ili veliki (promenljiva tipa boolean)
//	override uje metodu koja ukupnu cenu racuna:
//	ako je mali ice point na cenu svih dodataka doda 100
//	ako je veliki ice point cenu svih dodataka doda 130
//	override uje metodu stampaj da stampa sve podatke
//			
//	Kreirati klasu Pica koja nasledjuje klasu Proizvod i koja ima:
//	cena podloge
//	override uje metodu koja ukupnu racuna cenu tako sto na cenu svih dodataka doda i cenu podloge
//	override uje metodu stampaj da stampa sve podatke
//			
//	U glavnom programu kreirati niz proizvoda od 3 IcePinta i 2 Pice. Svakom proizvodu dodati po nekoliko dodataka i na kraju ispisati ukupnu cenu porudzbine.

		Dodatak dodatak_1 = new Dodatak("plazma", 50);
		Dodatak dodatak_2 = new Dodatak("choko chips", 60);
		Dodatak dodatak_3 = new Dodatak("slag", 30);
		Dodatak dodatak_4 = new Dodatak("karamela", 50);
		Dodatak dodatak_5 = new Dodatak("oreo keks", 60);
		Dodatak dodatak_6 = new Dodatak("sirup jagode", 60);

		Dodatak dodatakZaPicu_1 = new Dodatak("paradajz pelat", 60);
		Dodatak dodatakZaPicu_2 = new Dodatak("mocarela", 100);
		Dodatak dodatakZaPicu_3 = new Dodatak("prsuta", 160);
		Dodatak dodatakZaPicu_4 = new Dodatak("parmezan", 100);
		Dodatak dodatakZaPicu_5 = new Dodatak("masline", 50);
		Dodatak dodatakZaPicu_6 = new Dodatak("pesto sos", 60);

		Proizvod proizvod_1 = new IcePoint("vanila", false);
		Proizvod proizvod_2 = new IcePoint("cokolada", true);
		Proizvod proizvod_3 = new IcePoint("malaga", false);
		Proizvod proizvod_4 = new Pica(100);
		Proizvod proizvod_5 = new Pica(150);

		proizvod_1.dodajSastojak(dodatak_1);
		proizvod_1.dodajSastojak(dodatak_2);
		proizvod_1.dodajSastojak(dodatak_3);
		proizvod_2.dodajSastojak(dodatak_2);
		proizvod_2.dodajSastojak(dodatak_4);
		proizvod_2.dodajSastojak(dodatak_5);
		proizvod_3.dodajSastojak(dodatak_2);
		proizvod_3.dodajSastojak(dodatak_6);
		proizvod_4.dodajSastojak(dodatakZaPicu_1);
		proizvod_4.dodajSastojak(dodatakZaPicu_2);
		proizvod_4.dodajSastojak(dodatakZaPicu_3);
		proizvod_4.dodajSastojak(dodatakZaPicu_5);
		proizvod_5.dodajSastojak(dodatakZaPicu_1);
		proizvod_5.dodajSastojak(dodatakZaPicu_2);
		proizvod_5.dodajSastojak(dodatakZaPicu_3);
		proizvod_5.dodajSastojak(dodatakZaPicu_4);
		proizvod_5.dodajSastojak(dodatakZaPicu_6);

		proizvod_1.print();
		proizvod_2.print();
		proizvod_3.print();
		proizvod_4.print();
		proizvod_5.print();

	}

}
