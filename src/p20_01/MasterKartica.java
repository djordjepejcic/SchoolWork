package p20_01;

public class MasterKartica extends PlatnaKartica{
//	Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
//	konstruktor sa parametrima
//	implementira metodu koja vrsi transakciju, tako da na prosledjenu sumu dodaje proviziju od 1.5 posto na sumu.
//	metoda naplatiOdrzavanje, koja sa racuna skida $2.
//	implementira metodu koja stampa podatke o kartici u formatu:
//	Master Card: 12/2019, 4012-1239-1221-3381, $232
	
	public MasterKartica() {
		super();
	}

	public MasterKartica(double suma, String brojKartice, int godinaVazenja, int mesecVazenja) {
		super(suma, brojKartice, godinaVazenja, mesecVazenja);
	}

	public void izvrsiTransakciju(double iznos) {
			super.izvrsiTransakciju(iznos - (iznos * 0.015));
	}
	
	public void naplatiOdrzavanje () {
		super.suma = super.getSuma() - 2;
	}
//	implementira metodu koja stampa podatke o kartici u formatu:
//	Master Card: 12/2019, 4012-1239-1221-3381, $232
	
	public void stampajMaster () {
		System.out.println("Master Card: " + super.getMesecVazenja() + "/" + super.getGodinaVazenja() + ", " + super.getBrojKartice() + ", " + super.getSuma());
		System.out.println();
	}
	
}
