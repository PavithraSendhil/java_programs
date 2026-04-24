package Numbers;

/*public class sumevenarray {

	public static void main(String[] args) {
		int arr[]= {4,3,5,8,1,7};
		int sum=0;
		for(int num:arr) {
			if(num%2 == 0) {
				sum=sum+num;
			}
			
		}System.out.println(sum);
		
	}
}
*/

/*public class sumevenarray {

	//odd
	
	
	public static void main(String[] args) {
		int arr[]= {4,3,5,8,1,7};
		int sum=0;
		for(int num:arr) {
			if(num%2 != 0) {
				sum=sum+num;
			}
			
		}System.out.println(sum);
		
	}
}*/

//even index array element
/*public class sumevenarray {

	public static void main(String[] args) {
		int arr[]= {4,3,5,8,1,7};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2 == 0) {
				sum=sum+arr[i];
			}
			
		}
		System.out.println(sum);
	}
}

*/
//odd index array element
/*public class sumevenarray {

	public static void main(String[] args) {
		int arr[]= {4,3,5,8,1,7};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2 != 0) {
				sum=sum+arr[i];
			}
			
		}
		System.out.println(sum);
	}
}
*/

//sum of oly prime number
public class sumevenarray {

	public static boolean isprime(int num) {
		if(num<2) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
	public static void main(String[] args) {
		int arr[]= {4,3,5,8,1,7};
		int sum=0;
		for(int num:arr) {
			if(isprime(num)) {
				sum=sum+num;
			}
			
		}
		System.out.println(sum);
	}
}


