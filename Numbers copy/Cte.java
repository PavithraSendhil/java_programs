package Numbers;


class Insufficientbal extends Exception{
	
}
public class Cte {
static int amt=1000;
static void money(int useramt) throws Insufficientbal{
	if(useramt<amt) {
		System.out.println("Happy Transaction");
	}
	else {
		throw new Insufficientbal();
	}
}
	public static void main(String[] args) {
try {
	money(3000);
}
catch(Insufficientbal e) {
	System.out.println("handeled");
}
	}

}
