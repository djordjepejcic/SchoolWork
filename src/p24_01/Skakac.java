package p24_01;

public class Skakac extends Atleticar{

	public Skakac(String imeIPrezime, double rezultat) {
		super(imeIPrezime, rezultat);
	}

	@Override
	public boolean koJeBolji(Atleticar atleticar) {
		return this.getRezultat() > atleticar.getRezultat();
	}
	
}
