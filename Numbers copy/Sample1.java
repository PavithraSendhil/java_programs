package Numbers;

public class Sample1 {

	public static void main(String[] args) {
	System.out.println("****Main Starts****");
	try {
		int i=1/0;
	}
catch(ArithmeticException e) {
	System.out.println("Handled...");
}
	System.out.println("***Main ends***");
	}

}
