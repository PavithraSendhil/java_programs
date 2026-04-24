package Numbers;

public class Except3 {

	public static void main(String[] args) {
		System.out.println("Mainstarts");
try {
	Except3 e3=null;
	System.out.println(e3.hashCode());
}
catch(NullPointerException e) {
	System.out.println("Caught");
}
System.out.println("Mainends");
	}

}
