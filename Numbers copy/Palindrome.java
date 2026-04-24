package Numbers;

public class Palindrome {

	public static void main(String[] args) {
		int no=141;
		int originalno=no;
		int result=0;
		
		while(no!=0) {
			int rem=no%10;
			result=(result*10)+rem;
			no=no/10;
		}
		if(result==originalno)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
