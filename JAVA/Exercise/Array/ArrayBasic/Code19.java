import java.util.*;
 class Code19 {
	  static void SubarraySum(int arr[], int sum ){
		for(int i=0;i<arr.length;i++){
			 int CurrentSum=arr[i];
			for(int j=i+1;j<arr.length;j++){

		        if( CurrentSum==sum){
				System.out.println( "Subarray in between"+i+ "&" +(j-1));
				return;
			}
			CurrentSum= CurrentSum+arr[j];	
			}
	        }
			System.out.println(" Subarray is not found");


	  }
	  public static void main(String rgs []){
		   int arr[]=new int []{1,4,20,3,10,5};
		   int sum =35;
		   SubarraySum(arr,sum);
	  }
 }

