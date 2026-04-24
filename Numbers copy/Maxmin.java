package Numbers;

public class Maxmin {

	public static void main(String[] args) {
//int[] arr= {5,2,9,3,1};
//int max=0;
//for(int i=0;i<arr.length;i++) {
//	if(arr[i]>max) {
//		max=arr[i];
//	}
//}
//System.out.println(max);
//	}
//}
	
		//Second Maximum
		
		
//		       int[] arr = {5, 2, 9, 3, 1};
//
//		        int fmax = Integer.MIN_VALUE;
//		        int smax = Integer.MIN_VALUE;
//
//		        for (int i = 0; i < arr.length; i++) {
//		            if (arr[i] > fmax) {
//		                smax = fmax;
//		                fmax = arr[i];
//		            } else if (arr[i] > smax && arr[i] != fmax) {
//		                smax = arr[i];
//		            }
//		        }
//
//		        System.out.println("First Max: " + fmax);
//		        System.out.println("Second Max: " + smax);
//		    }
//		
//		
//	}

                  //Third Maximum

//        int[] arr = {12, 5, 9, 22, 18, 5, 22}; // sample array
//
//        int firstMax = 0;
//        int secondMax = 0;
//        int thirdMax = 0;
//
//        for (int num : arr) {
//            if (num == firstMax || num == secondMax || num == thirdMax) {
//                continue; // skip duplicates
//            }
//
//            if (firstMax == 0 || num > firstMax) {
//                thirdMax = secondMax;
//                secondMax = firstMax;
//                firstMax = num;
//            } else if (secondMax == 0 || num > secondMax) {
//                thirdMax = secondMax;
//                secondMax = num;
//            } else if (thirdMax == 0 || num > thirdMax) {
//                thirdMax = num;
//            }
//        }
//
//        if (thirdMax != 0) {
//            System.out.println("Third Maximum Number: " + thirdMax);
//        } else {
//            System.out.println("Not enough distinct elements to find third maximum.");
//        }}}
		
		
		//to find minimum 
		
//		int arr[]= {5,2,9,3,1};
//		int min=1000;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//			
//		}
//		System.out.println(min);
//		
//	}}
		
		//to find Second Minimum
		
		
//		
//		       int[] arr = {7, 3, 9, 1, 3, 5};
//
//		        int min = Integer.MAX_VALUE;
//		        int secondMin = Integer.MAX_VALUE;
//
//		        for (int num : arr) {
//		            if (num < min) {
//		                secondMin = min;
//		                min = num;
//		            } else if (num > min && num < secondMin) {
//		                secondMin = num;
//		            }
//		        }
//
//		        if (secondMin == Integer.MAX_VALUE) {
//		            System.out.println("No second minimum found (all elements might be same).");
//		        } else {
//		            System.out.println("Second Minimum: " + secondMin);
//		        }
//		    }
//		}
		
		//Third Minimum

		

		
//		        int[] arr = {8, 2, 5, 1, 3, 9};
//
//		        int firstMin = Integer.MAX_VALUE;
//		        int secondMin = Integer.MAX_VALUE;
//		        int thirdMin = Integer.MAX_VALUE;
//
//		        for (int num : arr) {
//		            if (num < firstMin) {
//		                thirdMin = secondMin;
//		                secondMin = firstMin;
//		                firstMin = num;
//		            } else if (num > firstMin && num < secondMin) {
//		                thirdMin = secondMin;
//		                secondMin = num;
//		            } else if (num > secondMin && num < thirdMin) {
//		                thirdMin = num;
//		            }
//		        }
//
//		        if (thirdMin == Integer.MAX_VALUE) {
//		            System.out.println("Third minimum not found (array has less than 3 unique elements).");
//		        } else {
//		            System.out.println("Third Minimum: " + thirdMin);
//		        }
//		    }
//		}
		



