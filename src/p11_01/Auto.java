package p11_01;

public class Auto {

	String imeIPrezime;
	String markaAutomobila;
	int brojVrata;
	double potrosnja;
	int brzina;
	String registracija;
	boolean klima;
	int godProizvodnje;
	int doKadJeRegistrovan;
	int kubikaza;
	int kapacitetRezervoara;
	double trenutnaLitraza;

	public void stampa() {
		System.out.println(this.imeIPrezime);
		System.out.println(this.markaAutomobila + " - " + this.brojVrata + "-ro vrata");
		System.out.println("Sa potrosnjom od " + this.potrosnja + "l na 100km");
		System.out.println(this.brzina + "  km/h je trenutna brzina");
		System.out.println("Registracija: " + this.registracija);
		if (klima) {
			System.out.println("Klima je ukljucena.");
		} else {
			System.out.println("Klima je iskljucena.");
		}
		System.out.println("Godina proizvodnje: " + this.godProizvodnje + " godina.");
		switch (this.doKadJeRegistrovan) {
		case 1:
			System.out.println("Automobil je registrovan do januara.");
			break;
		case 2:
			System.out.println("Automobil je registrovan do februara.");
			break;
		case 3:
			System.out.println("Automobil je registrovan do marta.");
			break;
		case 4:
			System.out.println("Automobil je registrovan do aprila.");
			break;
		case 5:
			System.out.println("Automobil je registrovan do maja.");
			break;
		case 6:
			System.out.println("Automobil je registrovan do juna.");
			break;
		case 7:
			System.out.println("Automobil je registrovan do jula.");
			break;
		case 8:
			System.out.println("Automobil je registrovan do avgusta.");
			break;
		case 9:
			System.out.println("Automobil je registrovan do septembra.");
			break;
		case 10:
			System.out.println("Automobil je registrovan do oktobra.");
			break;
		case 11:
			System.out.println("Automobil je registrovan do novembra.");
			break;
		default:
			System.out.println("Automobil je registrovan do decembra.");
			break;
		}
		System.out.println("Kubikaza: " + this.kubikaza);
		System.out.println("Kapacitet rezervoara: " + this.kapacitetRezervoara + " l.");
		System.out.println("Trenutna litraza: " + this.trenutnaLitraza + " l.");
	}

	public boolean prekoracenje(int ogranicenje) {
		return this.brzina > ogranicenje;
	}

	public int novcanaKazna(int ogranicenje) {
		int kazna = 0;
		if (this.brzina > ogranicenje) {
			kazna = (this.brzina - ogranicenje) * 1000;
		}
		return kazna;
	}

	public void dodajGas() {
		this.brzina = this.brzina + 10;
	}

	public void koci() {
		if (this.brzina >= 0) {
			this.brzina = this.brzina - 10;
		}
	}

	public double potrosnjaAuta() {
		double potrosnjaAuta = 0;
		if (klima) {
			potrosnjaAuta = ((this.brzina / 100.0) * this.potrosnja) * 1.2;
		} else {
			potrosnjaAuta = ((this.brzina / 100.0) * this.potrosnja);
		}
		return potrosnjaAuta;
	}

	public boolean oldtimer() {
		return this.godProizvodnje < 1950;
	}

	public boolean daLiJeIsteklaRegistracija(int trenutniDatum) {
		return this.doKadJeRegistrovan >= trenutniDatum;
	}

	public double cenaZaRegistraciju() {
		double cenaZaRegistraciju = 0;
		if (this.kubikaza <= 2000) {
			cenaZaRegistraciju = kubikaza * 100;
		} else {
			cenaZaRegistraciju = (kubikaza * 100) * 1.3;
		}
		return cenaZaRegistraciju;
	}

	public double natociGorivo(double kolikoSeToci) {
		double racunZaGorivo;
		if ((kolikoSeToci + this.trenutnaLitraza) <= this.kapacitetRezervoara) {
			racunZaGorivo = 170 * kolikoSeToci;
		} else {
			racunZaGorivo = 170 * (this.kapacitetRezervoara - this.trenutnaLitraza);
		}
		return racunZaGorivo;
	}

	public boolean daLiIduIstomBrzinom(Auto x) {
		return this.brzina == x.brzina;
	}
}
