package Numbers;

import java.util.Random;

public class RandOTP {

	public static void main(String[] args) {
Random random=new Random();
int no = 1000+ random.nextInt(8999);
System.out.println(no);
	}

}
