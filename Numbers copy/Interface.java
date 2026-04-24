package Numbers;

/*interface Sample{
	void disp();
	void test();
}
class Demo implements Sample
{
	public void disp() {
		System.out.println("Hello");
	}
		public void test() 
		{
			System.out.println("Hii");
		}
	}


public class Interface {

	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.disp();
		d1.test();

	}

}*/

/*interface Sample{
	void disp();
	void test();
	
}

abstract class Demo1 implements Sample
{
	public void disp() {
		System.out.println("hello");
	}
}

class Cool1 extends Demo1
{
	public void test()
	{
		System.out.println("Hii");
	}

public static void main(String[] args) {
	Cool1 c1=new Cool1();
	c1.disp();
	c1.test();	
}
}*/

interface Nike
{
	void shoes();
	
}
interface Puma extends Nike{
	void bags();
}
class Rajoutlet implements Puma
{
	public void bags() {
		System.out.println("jingilaala bags");
	}
	public void shoes() {
		System.out.println("jingilaala shoes");
	}
}
class Interface{
	public static void main (String[]args) {
		Rajoutlet i1=new Rajoutlet();
		i1.shoes();
		i1.bags();
	}
}
