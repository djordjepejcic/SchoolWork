package p14_01;

public class Video {
	
	private String id;
	private String naziv;
	private int duzinaVidea;
	private int brojLajkova;
	private int brojDislajkova;
	private int brojPregleda;
	
	public Video (String id, String naziv, int duzinaVidea, int brojLajkova, int brojDislajkova, int brojPregleda) {
		this.id = id;
		this.naziv = naziv;
		this.duzinaVidea = duzinaVidea;
		this.brojLajkova = brojLajkova;
		this.brojDislajkova = brojDislajkova;
		this.brojPregleda = brojPregleda;
	}
	
	public String getID () {
		return this.id;
	}
	
	public String getNaziv () {
		return this.naziv;
	}
	
	public int getDuzinaVidea () {
		return this.duzinaVidea;
	}
	
	public int getBrojLajkova () {
		return this.brojLajkova;
	}
	
	public int getBrojDislajkova () {
		return this.brojDislajkova;
	}
	
	public int getBrojpregleda () {
		return this.brojPregleda;
	}
	
	public void lajkuj () {
		this.brojLajkova++;
	}
	
	public void dislajkuj () {
		this.brojDislajkova++;
	}
	
	public void pogledaj () {
		this.brojPregleda++;
	}
}
