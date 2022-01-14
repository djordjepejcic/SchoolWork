package p14_01;

public class Movie {

	private String movieTitle;
	private int yearOfRelease;
	private Director director;

	public Movie(String movieTitle, int yearOfRelease) {
		this.movieTitle = movieTitle;
		this.yearOfRelease = yearOfRelease;
	}

	public String getMovieTitle() {
		return this.movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public int getYearOfRelease() {
		return this.yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public Director getDirector() {
		return this.director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public void print() {
		System.out.println(getMovieTitle() + ", " + getYearOfRelease() + ".");
		System.out.print("Rezirao je ");
		this.director.print();
	}
}
