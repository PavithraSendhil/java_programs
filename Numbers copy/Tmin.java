package Numbers;

import java.util.Scanner;

public class Tmin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:");
		int a = sc.nextInt();
		int Smin=9, Fmin=9 , Tmin=9;
		while(a!=0) {
			int rem =a% 10;
			if(rem<Fmin) {
				Tmin=Smin;
				Smin=Fmin;
				Fmin=rem;
				
			}
			else if(rem<Smin && rem!=Fmin){
Tmin = Smin;
Smin = rem;
}
			else if(rem<Tmin && rem!=Smin && rem!=Fmin) {
				Tmin=rem;
			}
			a= a/10;
		}
		System.out.println(Tmin);
	}

}
