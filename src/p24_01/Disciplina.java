package p24_01;

import java.util.ArrayList;

public class Disciplina {
//	Kreirati i klasu Disciplina èiji su privatni atributi: 
//	ime discipline
//	tip discipline (Trkacka ili Skakacka)
//	niz atletièara koji uèestvuju u toj disciplini. 
//	U javnom delu klase definisati: 
//	konstuktore, gettere i settere
//	konstruktor koji postavlja ime discipline i tip
//	metodu dodaj atleticara u disciplinu
//	metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
//	privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom 
//	metoda koja prikazuje podatke o pobedniku discipline. 

	private String imeDiscipline;
	private String tipDiscipline;
	private ArrayList<Atleticar> listaAtleticara = new ArrayList<Atleticar>();

	public Disciplina() {

	}

	public Disciplina(String imeDiscipline, String tipDiscipline) {
		super();
		this.imeDiscipline = imeDiscipline;
		this.tipDiscipline = tipDiscipline;
	}

	public String getImeDiscipline() {
		return imeDiscipline;
	}

	public void setImeDiscipline(String imeDiscipline) {
		this.imeDiscipline = imeDiscipline;
	}

	public String getTipDiscipline() {
		return tipDiscipline;
	}

	public void setTipDiscipline(String tipDiscipline) {
		this.tipDiscipline = tipDiscipline;
	}

	public void dodajAtleticara(Atleticar atleticar) {
		listaAtleticara.add(atleticar);
	}

	public void diskfalifikujAtleticara(String imeIPrezime) {
		for (int i = 0; i < listaAtleticara.size(); i++) {
			if (listaAtleticara.get(i).getImeIPrezime().equals(imeIPrezime)) {
				listaAtleticara.remove(i);
			}
		}
	}

	private Atleticar najbolji() {
		Atleticar najbolji = listaAtleticara.get(0);
		for (int i = 0; i < listaAtleticara.size(); i++) {
			if (listaAtleticara.get(i).koJeBolji(najbolji)) {
				najbolji = listaAtleticara.get(i);
			}
		}
		return najbolji;
	}
	
	public void printPobednik () {
		System.out.println("NAJBOLJI ATLETICAR JE: ");
		System.out.println();
		najbolji().print();
	}
}
