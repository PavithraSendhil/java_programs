package Numbers;

import java.util.Scanner;

public class CountSumoddeven {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("Enter a no:");
int a = sc.nextInt();
int evensum=0;
int oddsum=0;
int evencount=0;
int oddcount=0;

while(a>0) {
	int rem=a%10;
	if(rem%2==0) {
		evensum+=rem;
		evencount++;
		
	}
	else {
		oddsum +=rem;
		oddcount++;
		
	}
	a=a/10;
	
}
System.out.println("evencount:" + evencount);
System.out.println("evensum:" + evensum);
System.out.println("oddcount:" + oddcount);
System.out.println("oddsum:" + oddsum);

	}

}
