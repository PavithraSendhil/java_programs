package Numbers;

public class EvenProdCheck {

	public static void main(String[] args) {
int[] arr1= {1,2,3,4};
int[] arr2= {5,7,9};
System.out.println(checkProductAndReturn(arr1));
System.out.println(checkProductAndReturn(arr2));
	}
public static int checkProductAndReturn(int[] nums) {
	int product=1;
	int sum=0;
	for(int num:nums) {
		product *=num;
		sum +=num;
	}
	if(product % 2==0) {
		return sum;
	}
	else {
		return 0;
	}
}
}
