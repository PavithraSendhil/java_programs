package Numbers;

public class Happynumber {
static int numsum(int no)
{
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		sum=sum+(rem*rem);
		no=no/10;
	}
	return sum;
}
	public static void main(String[] args) {
	int no=15;
	while (no>9)
	{
		no=numsum(no);
	}
	if(no==1 || no==7)
	{
		System.out.println(no+"is a Happy Number");
	}
	else
	{
		System.out.println(no+"is not a Happy Number");
	}
	}

}
