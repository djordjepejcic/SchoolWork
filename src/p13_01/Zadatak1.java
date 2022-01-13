package p13_01;

public class Zadatak1 {

	public static void main(String[] args) {

		Tacka x = new Tacka ();
		
		x.setX(10);
		
		Tacka y = new Tacka();
		
		y.setY(20);
		
		x.print();
		y.print();
		
		Tacka a = new Tacka(10, 15);
		a.print();
		
	}

}
