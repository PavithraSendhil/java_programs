package Numbers;

import java.util.Arrays;

public class ZigZag {

	public static void main(String[] args) {
int[] arr= {4,3,7,8,6,2,1};
Zigzag(arr);
System.out.println(Arrays.toString(arr));
	}
public static void Zigzag(int[] arr) {
	boolean less=true;
	for(int i=0;i<arr.length-1;i++) {
		if(less) {
			if(arr[i]>arr[i+1]) {
				swap(arr,i,i+1);
			}
		}else {
			if(arr[i]<arr[i+1]) {
				swap(arr,i,i+1);
			}
		}
		less=!less;
	}
}
public static void swap(int[] arr,int i,int j) {
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
}
