package Numbers;

public class Arrayrotation {

	public static void main(String[] args) {
int arr[]= {1,2,3,4,5,6};
int N=5;

	N=N%arr.length;


for(int i=0;i<arr.length;i++) {
	if(i<N) {
		System.out.print(arr[arr.length+i-N]);
	}
	else {
		System.out.print(arr[i-N]);
	}
}




	}

}
