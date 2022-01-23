package p21_01;

public class QualityOptimizerControl extends Control {
//	Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i 
//	ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
//	gettere, settere i konstruktore
//	implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta. Kvalitet se racuna na osnovu formule:
//	brzina interneta * 10.1, gde se uzima prvi veci kvalitet
//	npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
//	npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
//	npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720

	private double brzinaInterneta;

	public QualityOptimizerControl(int brzinaInterneta) {
		super();
		this.brzinaInterneta = brzinaInterneta;
	}

	public double getBrzinaInterneta() {
		return brzinaInterneta;
	}

	public void setBrzinaInterneta(int brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer videoPlayer) {
		if (brzinaInterneta * 10.1 <= 144) {
			videoPlayer.kvVidea = 144;
		} else if (brzinaInterneta * 10.1 > 144 && brzinaInterneta * 10.1 <= 240) {
			videoPlayer.kvVidea = 240;
		} else if (brzinaInterneta * 10.1 > 240 && brzinaInterneta * 10.1 <= 480) {
			videoPlayer.kvVidea = 480;
		} else if (brzinaInterneta * 10.1 > 480 && brzinaInterneta * 10.1 <= 720) {
			videoPlayer.kvVidea = 720;
		} else if (brzinaInterneta * 10.1 > 720 && brzinaInterneta * 10.1 <= 1080) {
			videoPlayer.kvVidea = 1080;
		} else if (brzinaInterneta * 10.1 > 1080) {
			videoPlayer.kvVidea = 2040;
		}
	}

}
