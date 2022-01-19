package p18_01;

import java.util.ArrayList;

public class InstagramPost {
//	Kreirati klasu InstagramPost koja ima
//	niz slika
//	Opis koji moze da se postavi za post
//	metodu dodajSliku

	private ArrayList<InstagramImage> nizSlika = new ArrayList<InstagramImage>();

	private String opis;

	public InstagramPost(String opis) {
		this.opis = opis;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public void dodajSliku(InstagramImage image) {
		this.nizSlika.add(image);
	}
}
