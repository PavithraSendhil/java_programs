package Numbers;

public class Encapfb {
	private String pwd = "Pavi@123";

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public static void main(String[] args) {
		Encapfb fb = new Encapfb();
		System.out.println(fb.getPwd());
		fb.setPwd("Pavi777");
		System.out.println(fb.getPwd());
	}

}
