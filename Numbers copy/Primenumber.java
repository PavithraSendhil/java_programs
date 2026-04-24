package Numbers;

public class Primenumber {

	public static void main(String[] args) {
int no=17;
boolean flag=true;
//for(int i=2;i<=Math.pow(no,0.5);i++)
	for(int i=2;i<=Math.sqrt(no);i++)
{
	if(no%i==0) {
		flag=false;
		break;
	}
}
	
	
	if(flag==true)
	{
		System.out.println("Prime number");
	}
	else
	{
		System.out.println("Not a Prime number");
	}

}
}
