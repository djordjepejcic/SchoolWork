package p14_01;

public class Director {

	private String nameSurname;
	private int yearsAge;

	public Director(String nameSurname, int yearsAge) {
		this.nameSurname = nameSurname;
		this.yearsAge = yearsAge;
	}

	public String getNameSurname() {
		return this.nameSurname;
	}

	public void setMovieTitle(String nameSurname) {
		this.nameSurname = nameSurname;
	}

	public int getYearsAge() {
		return this.yearsAge;
	}

	public void setYearsAge(int yearsAge) {
		this.yearsAge = yearsAge;
	}

	public void print() {
		System.out.println(getNameSurname() + ", " + getYearsAge() + " godina");
		System.out.println();
	}
}
