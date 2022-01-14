package p14_01;

public class FacebookPost {
//	Kreirati klasu FacebookPost
//	opis
//	korisnik (referenca na korisnika koji je kreirao post)
//	konstrukore koje mislite da su vam potrebni
//	metoda print, stampa u formatu:
//	(ime) (prezime)
//	(opis post-a)

	String text;
	User user;

	public FacebookPost(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void print() {
		this.user.print();
		System.out.println(getText());
	}
}
