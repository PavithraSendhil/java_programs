package Numbers;

public class Except5 {

	public static void main(String[] args) {
		/*try {
			int i=1/0;
			System.out.println("Hiii");
		}
catch(ArithmeticException e) {
	System.out.println("Hiii");
}
	}*/

		
		System.out.println("Mainstarts");
		try {
			int i=1/0;
		}
		catch(Exception e) {
			System.out.println("Caught");
		}
		catch(ArithmeticException a1) {
			System.out.println("Handeled");
		}
}
