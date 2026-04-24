package Numbers;

abstract class Sample2
{
	abstract void disp();
	abstract void test();
}
class Demo2 extends Sample2{
	void disp() {
		System.out.println("hiiii");
		
	}
	void test()
	{
	System.out.println("hellooo");
	}
}


public class Mainclassy {

	public static void main(String[] args) {
		Demo2 d1=new Demo2();
		d1.disp();
		d1.test();

	}

}
