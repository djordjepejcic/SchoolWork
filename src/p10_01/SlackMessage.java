package p10_01;

public class SlackMessage {

	String tekst;
	String imeIPrezime;
	String datumIVreme;
	
	public void stampaj () {
		System.out.println("Tekst poruke: " + this.tekst);
		System.out.println("Ime i Prezime: " + this.imeIPrezime);
		System.out.println("Datum i vreme: " + this.datumIVreme + "h");
	}
}
