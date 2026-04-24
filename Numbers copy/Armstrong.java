package Numbers;

public class Armstrong {

	public static void main(String[] args) {
		int no=153;
		int num=no,copy=no,count=0,sum=0;
		while(num!=0) {
			num/=10;
			count++;
		}
		while(no!=0) {
			int rem=no%10;
			sum+=Math.pow(rem, count);
			no/=10;
		}
		if(copy==sum)
		{
			System.out.println(copy+" Armstrong number");
			
		}
		else 
		{
			System.out.println(copy+" Not an Armstrong Number");
		}

	}

}
