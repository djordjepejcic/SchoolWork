package p18_01;

public class InstagramUser {
//	Kreirati klasu InstagramUser koja ima:
//	username
//	Ime i prezime
//	email
//	Sve sto vam dalje zatreba dopunite klasu.

	private String username;
	private String nameSurname;
	private String email;

	public InstagramUser() {

	}

	public InstagramUser(String username, String nameSurname, String email) {
		this.username = username;
		this.nameSurname = nameSurname;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNameSurname() {
		return nameSurname;
	}

	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
