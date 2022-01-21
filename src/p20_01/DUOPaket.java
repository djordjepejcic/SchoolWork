package p20_01;

public class DUOPaket extends Paket {
//	Kreirati klasu DUOPaket koaj nasledjuje klasu Paket i koja ima:
//	ovaj paket ima 6 meseci po dinar
//	naziv paketa je EON FULL DUO
//	uredjaj koji dodatno ide uz ovaj paket (moze biti fiksni/mobilni/tablet/laptop)
//	brzina interneta ovog paketa je 250/100 MB
//	metodu za povecanje brzine interneta, kao parametar se unosi koliko je to uvecanje
//	metodu za stampu 
//	ime i prezime korisnika 
//	naziv paketa - brzina download/brzina upload - ugovorna obaveza
//	cena + broj meseci za dinar

	public DUOPaket() {
		super();
	}

	public DUOPaket(String imeIPrezimeKorisnika, double cena, int mesecnaObaveza) {
		super("EON FULL DUO", imeIPrezimeKorisnika, cena, mesecnaObaveza, 250, 150);
	}

	public void povecajBrzinu(int x) {
		super.brzinaDOwnload = super.getBrzinaDOwnload() + x;
		super.brzinaUpload = super.getBrzinaUpload() + x;
	}
	
	public void dodeliUredjaj (String uredjaj) {
		System.out.println(uredjaj);
	}

	public void stampajEONDUO(int x, String uredjaj) {
		super.stampaj();
		System.out.println(super.kolikoMeseciZaDinar(x));
		dodeliUredjaj(uredjaj);
		System.out.println();
	}
	
	

}
