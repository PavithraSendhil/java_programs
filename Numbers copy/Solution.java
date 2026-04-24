package Numbers;

public class Solution {

	static int numsum(int no)
	{
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		
		}
		return sum;
	}
	public static void main(String[] args) {
		int no=numsum(391);
		System.out.println(no);

	}

}
