package p14_01;

public class ClanskaKartica {
//	Kreirati klasu ClanskaKarta koja ima:
//	popust (u rasponu od 5 do 10 %)
//	broj kartice (npr: 9329-0239)
//	gettere i setter 
//	konstuktore

	private int popust;
	private String brojKartice;

	public ClanskaKartica() {

	}

	public ClanskaKartica(int popust, String brojKartice) {
		this.popust = popust;
		this.brojKartice = brojKartice;
	}

	public int getPopust() {
		return this.popust;
	}

	public void setBrojKartice(int popust) {
		this.popust = popust;
	}

	public String getBrojKartice() {
		return this.brojKartice;
	}

	public void setPopust(String brojKartice) {
		this.brojKartice = brojKartice;
	}

}
