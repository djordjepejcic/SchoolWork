package p18_01;

import java.util.ArrayList;

public class History {
//	Klasu History koja ima:
//	niz stranica koje su posecene
//	metoda otvori stranicu koja dodaje novi historypage u niz.
//	metodu obrisi prema linku - metoda koja iz niza izbacuje stranicu prema linku
//	metoda obrisi kolacice za link - metoda koja za homepage brise kolacice
//	metoda obrisi istoriju - metoda brise celu istoriju
//	metoda sacuvajKredencija - od parametara se prima naziv stranice i username i password koji se cuvaju.
//	metoda pogledajIstoriju - stampa sve posecene stranice
//	metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.
//	metoda obrisiSveKolaciceZaSadnjihSatVremena-  brise kolacice za strnaice koje su ucitane u zadnjih sat vremena. Metoda kao parametar prima trenutno vreme (sat i minut)

	private ArrayList<HistoryPage> nizPosecenihStranica = new ArrayList<HistoryPage>();

	public void otvoriStranicu(HistoryPage historyPage) {
		this.nizPosecenihStranica.add(historyPage);
	}

	public void obrisiPremaLinku(String link) {
		for (int i = 0; i < nizPosecenihStranica.size(); i++) {
			if (nizPosecenihStranica.get(i).getLink().equalsIgnoreCase(link)) {
				nizPosecenihStranica.remove(i);
			}
		}
	}

	public void obrisiKolacicePremaLinku(String link) {
		for (int i = 0; i < nizPosecenihStranica.size(); i++) {
			if (nizPosecenihStranica.get(i).getLink().equalsIgnoreCase(link)) {
				this.nizPosecenihStranica.get(i).obrisiKolacice();
			}
		}
	}

	public void obrisiIstoriju() {
		for (int i = nizPosecenihStranica.size() - 1; i >= 0; i--) {
			nizPosecenihStranica.remove(i);
		}
	}

	public void sacuvajKredencija(String nazivStranice, String username, String password) {
		for (int i = 0; i < nizPosecenihStranica.size(); i++) {
			this.nizPosecenihStranica.get(i).setNazivStranice(nazivStranice);
			this.nizPosecenihStranica.get(i).sacuvajKredencijale(username, password);
		}
	}

	public void pogledajIstoriju() {
		for (int i = 0; i < nizPosecenihStranica.size(); i++) {
			nizPosecenihStranica.get(i).stampaj();
		}
	}

	public void obrisiSveKolacice() {
		for (int i = 0; i < nizPosecenihStranica.size(); i++) {
			this.nizPosecenihStranica.get(i).obrisiKolacice();
		}
	}

	public void obrisiSveKolaciceZaSadnjihSatVremena(int trenutniSat, int trenutniMinut) {
		for (int i = 0; i < nizPosecenihStranica.size(); i++) {
			if ((nizPosecenihStranica.get(i).getSat() == trenutniSat - 1
					&& nizPosecenihStranica.get(i).getMinut() >= trenutniMinut)
					|| (nizPosecenihStranica.get(i).getSat() == trenutniSat
							&& nizPosecenihStranica.get(i).getMinut() <= trenutniMinut)) {
				nizPosecenihStranica.get(i).obrisiKolacice();
			}
		}
	}
}
