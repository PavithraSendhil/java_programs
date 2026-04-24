package Numbers;

import java.util.Scanner;

public class SecMax {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a no:");
int a = sc.nextInt();
int Smax=0,Fmax=0;
while(a!=0) {
	int rem =a% 10;
	if(rem>Fmax) {
		Smax=Fmax;
		Fmax=rem;
		
	}
	else if(rem>Smax){
		Smax=rem;
	}
	a= a/10;
}
System.out.println(Smax);
	}

}
