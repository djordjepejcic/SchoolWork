package p13_01;

public class Tacka {

	private int x;
	private int y;
	
	public Tacka () {
		
	}
	
	public Tacka (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void print () {
		System.out.println("Koordinata X: " + this.x);
		System.out.println("Koordinata Y: " + this.y);
	}
		
	public int getX () {
		return this.x;
	}
	
	public void setX (int x) {
		this.x = x;
	}
	
	public int getY () {
		return this.y;
	}
	
	public void setY (int y) {
		this.y = y;
	}
}
