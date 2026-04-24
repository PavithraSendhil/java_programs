package Numbers;

public class maxarr {

	public static void main(String[] args) {
		int arr[]= {5,2,9,3,1};
		int Tmax=0,Smax=0,Fmax=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>Fmax) {
				Smax=Fmax;
				Fmax=arr[i];
			}
			else if(arr[i]>Smax) {
				Tmax=Smax;
				Smax=arr[i];
				
			}
			else if(arr[i]>Tmax) {
				Tmax=arr[i];
			}
			System.out.println(Tmax);
		}
	}
}


