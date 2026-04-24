package Numbers;

public class Except4 {

	public static void main(String[] args) {
		System.out.println("Mainstarts");
		try {
			int i=1/0;
			System.out.println("hiii");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Caught");
		}
		catch(ArithmeticException e) {
			System.out.println("handeled");
		}
		System.out.println("Mainends");


	}

}
