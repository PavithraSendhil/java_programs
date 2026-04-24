package Numbers;

public class Reverseno {

	public static void main(String[] args) {
	int no=348;
	int result=0;
	while(no!=0) {
		int rem=no%10;
		result=(result*10)+rem;
		no=no/10;
	}
	System.out.println(result);

	}

}
