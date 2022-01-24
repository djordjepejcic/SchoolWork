package p24_01;

import java.util.ArrayList;

public class PoreskaUprava {
//	Kreirati klasu PoreskaUprava koja za atribute ima:
//	ime grada u kom se nalazi
//	niz objekata
//	metodu dodaj objekat
//	metodu koja vraca objekat sa najvecim porezom
//	metodu koja vraca objekat sa najmanjim porezom
//	metodu koja racuna ukupan porez za ceo grad
//	metodu koja stampa sve objekte

	private String imeGrada;
	private ArrayList<Objekat> listaObjekata = new ArrayList<Objekat>();

	public PoreskaUprava(String imeGrada) {
		super();
		this.imeGrada = imeGrada;
	}

	public String getImeGrada() {
		return imeGrada;
	}

	public void setImeGrada(String imeGrada) {
		this.imeGrada = imeGrada;
	}

	public void dodajObjekat(Objekat objekat) {
		listaObjekata.add(objekat);
	}

	public Objekat najveciPorez() {
		double maximum = listaObjekata.get(0).porez();
		Objekat objekatMax = null;
		for (int i = 0; i < listaObjekata.size(); i++) {
			if (listaObjekata.get(i).porez() > maximum) {
				maximum = listaObjekata.get(i).porez();
			}
			if (listaObjekata.get(i).porez() == maximum) {
				objekatMax = listaObjekata.get(i);
			}
		}
		return objekatMax;

	}

	public Objekat najmanjiPorez() {
		double minimum = listaObjekata.get(0).porez();
		Objekat objekatMin = null;
		for (int i = 0; i < listaObjekata.size(); i++) {
			if (listaObjekata.get(i).porez() < minimum) {
				minimum = listaObjekata.get(i).porez();
			}
			if (listaObjekata.get(i).porez() == minimum) {
				objekatMin = listaObjekata.get(i);
			}
		}
		return objekatMin;

	}
	
	public void printAll () {
		System.out.println("GRAD: " + this.getImeGrada().toUpperCase());
		for (int i = 0; i < listaObjekata.size(); i++) {
			listaObjekata.get(i).print();
		}
	}
}
