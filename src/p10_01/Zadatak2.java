package p10_01;

public class Zadatak2 {

	public static void main(String[] args) {

		SlackMessage m = new SlackMessage();

		m.tekst = "Ala je lep ovaj svet. :-)";
		m.imeIPrezime = "Djordje Pejcic";
		m.datumIVreme = "10.01.2022. 20:58";

		m.stampaj();
	}
}