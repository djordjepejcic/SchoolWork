package p17_01;

public class ZoomCall {
//	Kreirati klasu ZoomCall koja ima:
//	link za poziv
//	password
//	korisnika koji je host
//	korisnika koji je guest
//	gettere za sve atribute
//	setter samo za guest-a
//	metodu pokreni poziv koja stampa podatke u formatu:
//	Zoom Call: url
//	Password: password
//	Host: ime i prezime
//	Guest: ime i prezime
//	Maksimalno trajanje poziva je (broj minuta)min
//			
//	Maksimalno trajanje poziva se cita od korisnika koji je host!
//	U glavnom programu kreirati objekte definisanih klasa i testirati rad definisanih funkcija 

	private String linkZaPoziv;
	private String sifra;
	private Korisnik host;
	private Korisnik guest;
	
	public ZoomCall (String linkZaPoziv, String sifra, Korisnik host) {
		this.linkZaPoziv = linkZaPoziv;
		this.sifra = sifra;
		this.host = host;
	}
	
	public String getLinkZaPoziv() {
		return linkZaPoziv;
	}

	public String getSifra() {
		return sifra;
	}

	public Korisnik getHost() {
		return host;
	}

	public Korisnik getGuest() {
		return guest;
	}

	public void setGuest(Korisnik guest) {
		this.guest = guest;
	}
	
//	metodu pokreni poziv koja stampa podatke u formatu:
//	Zoom Call: url
//	Password: password
//	Host: ime i prezime
//	Guest: ime i prezime
//	Maksimalno trajanje poziva je (broj minuta)min
	
	public void pokreni () {
		System.out.println("Zoom Call: " + this.getLinkZaPoziv());
		System.out.println("Password: " + this.getSifra());
		System.out.println("Host: ");
		this.getHost().print();
		System.out.println("Guest: ");
		this.getGuest().print();
		System.out.println("Maksimalno trajanje poziva je " + this.getHost().duzinaTrajanjaPoziva() + " min.");
	}
}
