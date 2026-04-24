package Numbers;

public class Except1 {

	public static void main(String[] args) {
	System.out.println("***Main Starts***");
	int[] arr= {10,20,30};
	try {
		System.out.println(arr[9]);
	}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Caught");
}
	System.out.println("**Mainends**");
	}

}
