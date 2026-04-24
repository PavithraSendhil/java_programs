package Numbers;

import java.util.Arrays;

public class positivemissingno {

	public static void main(String[] args) {
int[] arr= {5,1,3,2,6,4,7,10,9};
int sum=0;
Arrays.sort(arr);
int n=arr[arr.length-1];
int totalsum=n*(n+1)/2;
for(int i=0;i<arr.length;i++) {
	sum=sum+arr[i];
}
	

	System.out.println(totalsum-sum);

}
}
