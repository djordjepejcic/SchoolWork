package p14_01;

public class YoutubePlayer {

	private Video video;
	private int kvVidea;
	private String rezim;
	private int jacinaZvuka;
	private int vremeReprodukcije;

	public YoutubePlayer() {
		this.jacinaZvuka = 75;
		this.kvVidea = 144;
	}

	public Video getVideo() {
		return this.video;
	}

	public int getKvVidea() {
		return this.kvVidea;
	}

	public String getRezim() {
		return this.rezim;
	}

	public int getJacinaZvuka() {
		return this.jacinaZvuka;
	}

	public int getVremeReprodukcije() {
		return this.vremeReprodukcije;
	}

	public void ucitajVideo(Video video) {
		this.video = video;
		this.vremeReprodukcije = 0;
		this.kvVidea = 144;
		this.getVideo().pogledaj();
	}

	public void pojacaj() {
		this.jacinaZvuka = jacinaZvuka + 10;
		if (this.jacinaZvuka > 100) {
			this.jacinaZvuka = 100;
		}
	}

	public void smanji() {
		this.jacinaZvuka = jacinaZvuka - 10;
		if (this.jacinaZvuka < 0) {
			this.jacinaZvuka = 0;
		}
	}

	public void postaviKvalitet(int brzinaInterneta) {
		if (brzinaInterneta <= 2) {
			kvVidea = 144;
		} else if (brzinaInterneta <= 4) {
			kvVidea = 240;
		} else if (brzinaInterneta <= 6) {
			kvVidea = 360;
		} else if (brzinaInterneta <= 8) {
			kvVidea = 720;
		} else {
			kvVidea = 1080;
		}
	}

	public void aktivirajMiniPlayerMod() {
		this.rezim = "MiniPlayer Mod";
	}

	public void aktivirajBioskopskiMod() {
		this.rezim = "Bioskopski Mod";
	}

	public void aktivirajPrekoCelogEkranaMod() {
		this.rezim = "FullScreen mod";
	}

	public void premotajUnapred() {
		if (this.vremeReprodukcije <= vremeReprodukcije) {
			this.vremeReprodukcije = vremeReprodukcije + 10;
		} else {
			this.vremeReprodukcije = vremeReprodukcije;
		}
	}

	public void premotajUnazad() {
		if (vremeReprodukcije >= 0) {
			this.vremeReprodukcije = vremeReprodukcije - 10;
		} else {
			this.vremeReprodukcije = 0;
		}
	}

	public void iscrtajZvuk() {
		int brCrtica = jacinaZvuka / 10;
		System.out.print("<: ");
		for (int i = 0; i < brCrtica; i++) {
			System.out.print("| ");
		}
	}

	public void iscrtajRezim() {
		if (this.rezim.equalsIgnoreCase("MiniPlayer Mod")) {
			System.out.println("[  ]");
		} else if (this.rezim.equalsIgnoreCase("Bioskopski Mod")) {
			System.out.println("[...]");
		} else {
			System.out.println("[||||]");
		}
	}

	public void iscrtajTrenutnoVreme() {
		int minut = this.vremeReprodukcije / 60;
		int sekund = this.vremeReprodukcije % 60;
		int minutUkupnogVideo = getVideo().getDuzinaVidea() / 60;
		int sekundUkupnogVidea = getVideo().getDuzinaVidea() % 60;
		System.out.println(minut + ":" + sekund + " / " + minutUkupnogVideo + ":" + sekundUkupnogVidea);
	}

	public void iscrtajTimeline() {
		int brojZvezdica = this.vremeReprodukcije * 100 / getVideo().getDuzinaVidea();
		int brojTackica = 100 - brojZvezdica;
		for (int i = 0; i < brojZvezdica; i++) {
			System.out.print("*");
		}
		for (int i = 0; i < brojTackica; i++) {
			System.out.print(".");
		}
	}

	public void iscitaj() {
		this.iscrtajTrenutnoVreme();
		this.iscrtajZvuk();
		System.out.println();
		System.out.print("Timeline: ");
		this.iscrtajTimeline();
		System.out.println();
		System.out.print("Kvalitet: " + this.getKvVidea() + "p");
		System.out.println();
		System.out.println("Rezim: " + this.getRezim());
		System.out.println(getVideo().getNaziv());
		System.out.println("LIKES " + getVideo().getBrojLajkova() + " | SHARES " + getVideo().getBrojDislajkova());
		System.out.println("BROJ PREGELDA: " + getVideo().getBrojpregleda());
	}

	public void shareVideo() {
		System.out.println("LINK: https://youtu.be/" + this.video.getID());
	}
}
