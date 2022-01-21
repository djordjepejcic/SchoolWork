package p20_01;

public class Profesor extends Osoba {
//	Kreirati klasu Profesor koja nasledjuje klasu Osoba, 
//	koja od dodatnih atributa ima:
//	naziv predmeta koji predaje
//	iznos plate
//	konstuktor sa parametrima
//	metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//	Napisati implementaciju metode stampaj da stampa sve podatke o profesoru

	private String nazivPredmeta;
	private double iznosPlate;

	public Profesor() {
		super();
	}

	public Profesor(String imeIPrezime, String jmbg, String nazivPredmeta, double iznosPlate) {
		super(imeIPrezime, jmbg);
		this.nazivPredmeta = nazivPredmeta;
		this.iznosPlate = iznosPlate;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public double getIznosPlate() {
		return iznosPlate;
	}

	public void setIznosPlate(double iznosPlate) {
		this.iznosPlate = iznosPlate;
	}
	
	public void povecajPlatu (int iznos) { 
		this.iznosPlate = this.getIznosPlate() + (this.getIznosPlate() * 0.01 * iznos);
	}
	
	public void stampajProfesora () {
		stampajOsobu();
		System.out.println("Naziv predmeta: " + this.getNazivPredmeta());
		System.out.println("Iznos plate: " + this.getIznosPlate());
		System.out.println();
	}

}
