package p24_01;

public class Trkac extends Atleticar{

	public Trkac(String imeIPrezime, double rezultat) {
		super(imeIPrezime, rezultat);
	}

	@Override
	public boolean koJeBolji(Atleticar atleticar) {
		return this.getRezultat() < atleticar.getRezultat();
	}
	
	

	
}
