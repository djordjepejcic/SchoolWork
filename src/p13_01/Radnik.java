package p13_01;

public class Radnik {

	private String jmbg;
	private String imeIPrezime;
	private int brojDece;
	private int stepenStrucneSpreme;
	private double godineStaza;

	public Radnik() {

	}

	public Radnik(String jmbg) {
		this.jmbg = jmbg;
	}

	public Radnik(String imeIprezime, String jmbg, int brojDece, int stepenStrucneSpreme, double godineStaza) {
		this.imeIPrezime = imeIprezime;
		this.jmbg = jmbg;
		this.brojDece = brojDece;
		this.stepenStrucneSpreme = stepenStrucneSpreme;
		this.godineStaza = godineStaza;
	}

	public void print() {
		System.out.println("Ime i prezime: " + getImeIPrezime());
		System.out.println("JMBG: " + getJmbg());
		System.out.println("Broj dece: " + getBrojDece());
		System.out.println("Stepen strucne spreme: " + getstepenStrucneSpreme());
		System.out.println("Godine staza: " + getGodineStaza());
	}

	public String getJmbg() {
		return this.jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getImeIPrezime() {
		return this.imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public int getBrojDece() {
		return this.brojDece;
	}

	public void setBrojDece(int brojDece) {
		this.brojDece = brojDece;
	}

	public int getstepenStrucneSpreme() {
		return this.stepenStrucneSpreme;
	}

	public void setStepenStrucneSpreme(int stepenStrucneSpreme) {
		this.stepenStrucneSpreme = stepenStrucneSpreme;
	}

	public double getGodineStaza() {
		return this.godineStaza;
	}

	public void setGodineStaza(double godineStaza) {
		this.godineStaza = godineStaza;
	}

	private double minuliRad(double godineStaza) {
		if (godineStaza <= 10) {
			return 0.05;
		} else if (godineStaza > 10 && godineStaza <= 20) {
			return 0.075;
		} else {
			return 0.1;
		}
	}

	private double koeficijentSlozenosti() {
		switch (this.stepenStrucneSpreme) {
		case 1:
			return 1.03;
		case 2:
			return 1.65;
		case 3:
			return 2;
		case 4:
			return 2.27;
		case 5:
			return 2.88;
		case 6:
			return 3.09;
		case 7:
			return 3.40;
		default:
			return 4.12;
		}
	}

	public double plata() {
		return 35000 + ((koeficijentSlozenosti() + minuliRad(godineStaza)) * 1000);
	}

	public boolean kreditnoSposoban() {
		return plata() >= 50000;
	}

	public int slobodniDani() {
		return 22 + (this.brojDece * 2);
	}

	enum koeficijentSlozenosti {
		I_STEPEN, II_STEPEN, III_STEPEN, IV_STEPEN, V_STEPEN, VI_STEPEN, VII_STEPEN, VIII_STEPEN
	}
}
