package Numbers;

public class Maxinum {

	public static void main(String[] args) {
		int no=861896;
		int max=0;
		while(no!=0) {
			int rem=no%10;
			if(rem>max) {
				max=rem;
			}
			no=no/10;
		}
		System.out.println(max);
	}

}
