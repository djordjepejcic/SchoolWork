package p20_01;

public class VisaKartica extends PlatnaKartica {
//	Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
//	ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.
//	getter i setter za ovlasceno lice
//	konstruktor sa parametrima
//	implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume. Najmanja provizija moze biti $4.
//	implementira metodu koja stampa podatke o kartici u formatu:
//	Visa Card: 4012-1239-1221-3381, 11/2019, $212

	private String ovlascenoLice;

	public VisaKartica() {
		super();
	}

	public VisaKartica(double suma, String brojKartice, int godinaVazenja, int mesecVazenja, String ovlascenoLice) {
		super(suma, brojKartice, godinaVazenja, mesecVazenja);
		this.ovlascenoLice = ovlascenoLice;
	}

	public String getOvlascenoLice() {
		return ovlascenoLice;
	}

	public void setOvlascenoLice(String ovlascenoLice) {
		this.ovlascenoLice = ovlascenoLice;
	}

//	implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume. Najmanja provizija moze biti $4.
//	implementira metodu koja stampa podatke o kartici u formatu:
//	Visa Card: 4012-1239-1221-3381, 11/2019, $212

	public void izvrsiTransakciju(double iznos) {
		if (iznos * 0.018 >= 4) {
			super.izvrsiTransakciju(iznos - (iznos * 0.018));
		} else {
			super.izvrsiTransakciju(iznos - 4);
		}
	}

	public void stampajVisu() {
		System.out.println("Visa Card: " + super.getBrojKartice() + ", " + super.getMesecVazenja() + "/"
				+ super.getGodinaVazenja() + ", " + super.suma);
		System.out.println();
	}
}
