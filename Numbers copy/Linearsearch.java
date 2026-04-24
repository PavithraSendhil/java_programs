package Numbers;

public class Linearsearch {

	public static void main(String[] args) {
int[] arr= {4,1,5,8,3,7,6,2};
int search=7;
linearsearch(arr,search);	
	}
static void linearsearch(int[] arr,int search) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==search) {
			System.out.println("The value is present in the index of "+i);
			return;
		}
	}
	System.out.println("The value is not present");
}
}
