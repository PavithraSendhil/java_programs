package Numbers;

public class Num {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 7852;
		int mul=1;

		while(no!=0)
		{
			int rem = no % 10;
			mul = mul * rem;
			no = no / 10;
		}
		System.out.println(mul);

	}

}
