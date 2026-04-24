package Numbers;

import java.util.Arrays;

public class sortandsearch {

	public static void main(String[] args) {
		int[] arr= {4,1,3,8,5,6,2,7};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+"");
		}
System.out.println(Arrays.binarySearch(arr, 8));
	}

}
