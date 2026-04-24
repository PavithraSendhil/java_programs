package Numbers;

public class Tmax {

	public static void main(String[] args) {
int no=86193;
int Tmax=0,Smax=0,Fmax=0;
while(no!=0) {
	int rem=no%10;
	if(rem>Fmax) {
		Smax=Fmax;
		Fmax=rem;
		
	}
	else if((rem>Smax) && rem!=Fmax){
		Tmax=Smax;
		Smax=rem;
	}
	else if((rem>Tmax) && rem!=Smax && rem!=Fmax){
		Tmax=rem;
	}
	no=no/10;
}
System.out.println(Tmax);
	}

}
