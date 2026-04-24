package Numbers;

public class Mininum 
{

	public static void main(String[] args) {
		int no=861896;
		int min=1000;
		while(no!=0) {
			int rem=no%10;
			if(rem<min) {
				min=rem;
			}
			no=no/10;
		}
		System.out.println(min);
	}

}


	