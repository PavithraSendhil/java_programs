package Numbers;
class KYC{
 void helo(){
	System.out.println("Welcome to KYC");
}
}
class Project extends KYC{
	void hello() {
		System.out.println("Welcome to my project");
	}
}
public class Task1 {

	public static void main(String[] args) {
		Project p1=new Project();
		p1.hello();
		p1.helo();

	}

}
