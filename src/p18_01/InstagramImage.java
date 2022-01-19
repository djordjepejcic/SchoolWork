package p18_01;

import java.util.ArrayList;

public class InstagramImage {
//	Kreirati klasu InstagramImage koja ima:
//	niz tagova
//	dimenziju slike
//	putanju do slike (npr: instagram.com/korsnik-pera/profilna.jpg)
//	metodu dodajTag

	private ArrayList<InstagramTag> nizTagova = new ArrayList<InstagramTag>();
	private int velicinaSlikeX;
	private int velicinaSlikeY;
	private String linkDoSlike;

	public InstagramImage() {

	}

	public InstagramImage(int velicinaSlikeX, int velicinaSlikeY, String linkDoSlike) {
		this.velicinaSlikeX = velicinaSlikeX;
		this.velicinaSlikeY = velicinaSlikeY;
		this.linkDoSlike = linkDoSlike;
	}

	public int getVelicinaSlikeX() {
		return velicinaSlikeX;
	}

	public void setVelicinaSlikeX(int velicinaSlikeX) {
		this.velicinaSlikeX = velicinaSlikeX;
	}

	public int getVelicinaSlikeY() {
		return velicinaSlikeY;
	}

	public void setVelicinaSlikeY(int velicinaSlikeY) {
		this.velicinaSlikeY = velicinaSlikeY;
	}

	public String getLinkDoSlike() {
		return linkDoSlike;
	}

	public void setLinkDoSlike(String linkDoSlike) {
		this.linkDoSlike = linkDoSlike;
	}

	public void dodajTag(InstagramTag tag) {
		this.nizTagova.add(tag);
	}

}
