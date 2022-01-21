package p20_01;

public class EONPaket extends Paket {
//	Kreirati klasu EONPaket koja nasledjuje klasu Paket i koja ima:
//	ovaj paket ima 3 meseca po dinar
//	ovaj paket se zove EON LIGHT DUO
//	brzina interneta ovog paketa je 150/75 MB
//	metodu za stampu koja stampa podatke u formatu:
//	ime i prezime korisnika 
//	naziv paketa - brzina download/brzina upload - ugovorna obaveza
//	cena + broj meseci za dinar

	public EONPaket() {
		super();
	}

	public EONPaket(String imeIPrezimeKorisnika, double cena, int mesecnaObaveza) {
		super("EON LIGHT DUO", imeIPrezimeKorisnika, cena, mesecnaObaveza, 150, 75);
	}

	public void stampajEON(int x) {
		super.stampaj();
		System.out.print(super.kolikoMeseciZaDinar(x));
		System.out.println();
	}
}
