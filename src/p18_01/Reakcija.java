package p18_01;

public class Reakcija {
//	Kreirati klasu Reakcija koja ima 
//	tip reakcije (smajli, like, srce)
//	ime i prezime korisnika koji je reagovao 
//	gettere, settere i konstruktore

	private String tipReakcije;
	private String imeIPrezimeReakcija;

	public Reakcija() {

	}

	public Reakcija(String tipReakcije, String imeIPrezimeReakcija) {
		this.tipReakcije = tipReakcije;
		this.imeIPrezimeReakcija = imeIPrezimeReakcija;
	}

	public String getTipReakcije() {
		return tipReakcije;
	}

	public void setTipReakcije(String tipReakcije) {
		this.tipReakcije = tipReakcije;
	}

	public String getImeIPrezimeReakcije() {
		return imeIPrezimeReakcija;
	}

	public void setImeIPrezime(String imeIPrezimeReakcije) {
		this.imeIPrezimeReakcija = imeIPrezimeReakcije;
	}

}
