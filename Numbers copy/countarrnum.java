package Numbers;

import java.util.Arrays;

public class countarrnum {

	public static void main(String[] args) {
		int[] arr= {4,1,3,8,5,6,2,7};
		count=0;
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			count++;
			System.out.println(count);
		}
	}
}
