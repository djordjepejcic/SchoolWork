package p18_01;

public class Zadatak4 {

	public static void main(String[] args) {
//		4.Zadatak(Za vezbanje)

//		Kreirati klasu InstagramUser koja ima:
//		username
//		Ime i prezime
//		email
//		Sve sto vam dalje zatreba dopunite klasu.

//		Kreiarti klasu InstagramTag koja ima:
//		x koordinatu na slici
//		y koordinatu na slici
//		usera koji je tagovan

//		Kreirati klasu InstagramImage koja ima:
//		niz tagova
//		dimenziju slike
//		putanju do slike (npr: instagram.com/korsnik-pera/profilna.jpg)
//		metodu dodajTag
//
//		Kreirati klasu InstagramPost koja ima
//		niz slika
//		Opis koji moze da se postavi za post
//		metodu dodajSliku

		InstagramUser user_1 = new InstagramUser("denudacija", "Djordje Pejcic", "djodjo1234@gmail.com");
		InstagramUser user_2 = new InstagramUser("nikola90", "Nikola Djokic", "nikoladj@gmail.com");
		InstagramUser user_3 = new InstagramUser("milena987", "Milena Pavlovic", "mpavlovic@gmail.com");
		InstagramUser user_4 = new InstagramUser("marija89", "Marija Miladinovic", "marijam@gmail.com");
		InstagramUser user_5 = new InstagramUser("aleks78", "Aleksandar Trickovic", "trile@gmail.com");

		InstagramTag tag_1 = new InstagramTag(10, 15, user_2);
		InstagramTag tag_2 = new InstagramTag(16, 20, user_3);
		InstagramTag tag_3 = new InstagramTag(8, 20, user_4);
		InstagramTag tag_4 = new InstagramTag(7, 21, user_5);

		InstagramImage image_1 = new InstagramImage(25, 30, "instagram.com/denudacija/marakes.jpg");
		InstagramImage image_2 = new InstagramImage(25, 30, "instagram.com/denudacija/sefsauen.jpg");

		image_1.dodajTag(tag_1);
		image_1.dodajTag(tag_2);
		image_2.dodajTag(tag_3);
		image_2.dodajTag(tag_4);

		InstagramPost post_1 = new InstagramPost("Marocco. East on west of Africa. :-)");

		post_1.dodajSliku(image_1);
		post_1.dodajSliku(image_2);

		System.out.println(user_1.getNameSurname() + " " + user_1.getEmail() + " " + user_1.getUsername());
		System.out.println("New post");
		System.out.println(post_1.getOpis());
		System.out.println("Velicina slike " + image_1.getVelicinaSlikeX() + " X " + image_1.getVelicinaSlikeY());
		System.out.println("Velicina slike " + image_2.getVelicinaSlikeX() + " X " + image_2.getVelicinaSlikeY());
		System.out.println("Link: " + image_1.getLinkDoSlike());
		System.out.println("Link: " + image_2.getLinkDoSlike());
		System.out.println("Tagovani " + tag_1.getUser_tag().getUsername());
		System.out.println("Tagovani " + tag_2.getUser_tag().getUsername());
		System.out.println("Tagovani " + tag_3.getUser_tag().getUsername());
		System.out.println("Tagovani " + tag_4.getUser_tag().getUsername());

	}

}
