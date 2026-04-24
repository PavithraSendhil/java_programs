package Numbers;

public class Factmethodwthpara {

static int num(int no)
{
	int fact=1;
	for(int i=no;i>1;i--)
	{
		fact=fact*i;
		
	
	}
	return fact;
}
	
	public static void main(String[] args) {
		int no=num(5);
		System.out.println(no);

	}

}
