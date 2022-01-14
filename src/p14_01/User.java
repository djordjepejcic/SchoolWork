package p14_01;

public class User {
//	Kreirati klasu Korisnik koja ima
//	ime
//	prezime
//	gettere i settere za ime i prezime
//	konstuktore koje mislite da su vam potrebni
//	metoda koja stampa u formatu:
//	(ime) (prezime)

	private String name;
	private String surname;

	public User(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void print() {
		System.out.println(getName() + " " + getSurname());
	}
}
