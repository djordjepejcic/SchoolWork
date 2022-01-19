package p18_01;

public class InstagramTag {
//	Kreiarti klasu InstagramTag koja ima:
//	x koordinatu na slici
//	y koordinatu na slici
//	usera koji je tagovan

	private int x;
	private int y;
	private InstagramUser user_tag;

	public InstagramTag() {

	}

	public InstagramTag(int x, int y, InstagramUser user_tag) {
		this.x = x;
		this.y = y;
		this.user_tag = user_tag;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public InstagramUser getUser_tag() {
		return user_tag;
	}

	public void setUser_tag(InstagramUser user_tag) {
		this.user_tag = user_tag;
	}

}
