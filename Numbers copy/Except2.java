package Numbers;

public class Except2 {

	public static void main(String[] args) {
	System.out.println("Mainstarts");

	try {
		int a=Integer.parseInt("wer2342%^&%^");
		System.out.println(a);
	}
	catch(NumberFormatException e) {
		System.out.println("Handeled");
	}
	System.out.println("Mainends");
	}

}
