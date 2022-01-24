package p24_01;

public abstract class Atleticar {
//	Kreirati apstraktnu klasu Atleticar èiji su tributi: 
//	ime i prezime privatni
//	i rezultat ostvaren na takmièenju koji je zasticen
//	Javne metode klase su: 
//	apstratktna metoda koja ispituje da li je rezultat atletièara bolji od rezultata drugog atletièara (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
//	metoda koja stampa podataka o atletièaru u formatu: (ime) (prezime), (rezultat)
//	

	private String imeIPrezime;
	protected double rezultat;

	public Atleticar(String imeIPrezime, double rezultat) {
		this.imeIPrezime = imeIPrezime;
		this.rezultat = rezultat;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public double getRezultat() {
		return rezultat;
	}

	public void setRezultat(double rezultat) {
		this.rezultat = rezultat;
	}

	public abstract boolean koJeBolji(Atleticar atleticar);

	public void print() {
		System.out.println("Ime i prezime: " + this.getImeIPrezime() + " || REZULTAT: " + this.getRezultat());
	}
}
