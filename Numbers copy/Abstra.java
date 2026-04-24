

abstract class Sample3
{
	abstract void disp();
	abstract void test();
}
abstract class Demo3 extends Sample3
{
	void disp()
	{
		System.out.println("Hello");
	}
	
}
class Tester3 extends Demo3
{
	void test() {
		System.out.println("Hiii");
	}
}
public class Abstra {

	public static void main(String[] args) {
		Tester3 t1=new Tester3();
		t1.disp();
		t1.test();

	}

}
