package p13_01;

public class Zadatak2 {

	public static void main(String[] args) {

		Radnik dj = new Radnik();

		dj.setImeIPrezime("Djordje Pejcic");
		dj.setBrojDece(0);
		dj.setGodineStaza(13);
		dj.setJmbg("0510990730030");
		dj.setStepenStrucneSpreme(7);

		dj.print();

		System.out.println();
		System.out.println("Plata: " + dj.plata() + " dinara.");
		if (dj.kreditnoSposoban()) {
			System.out.println("Radnik je kreditno sposoban.");
		} else {
			System.out.println("Radnik nije kreditno sposoban.");
		}
		System.out.println("Radnik ima " + dj.slobodniDani() + " dana odmora godisnje.");

		System.out.println();

		Radnik s = new Radnik("1002991870025");
		s.print();

		System.out.println();

		Radnik a = new Radnik("Aleksandar Tosic", "2310990730051", 1, 7, 15);
		a.print();

		System.out.println();
		System.out.println("Plata: " + dj.plata() + " dinara.");
		if (dj.kreditnoSposoban()) {
			System.out.println("Radnik je kreditno sposoban.");
		} else {
			System.out.println("Radnik nije kreditno sposoban.");
		}
		System.out.println("Radnik ima " + dj.slobodniDani() + " dana odmora godisnje.");
	}

}
