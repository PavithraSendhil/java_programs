package Numbers;

public class Singledigit {
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
		int no=391;
		while (no>9)
		{
			no=numsum(no);
			
		}
System.out.println(no);
	}

}
