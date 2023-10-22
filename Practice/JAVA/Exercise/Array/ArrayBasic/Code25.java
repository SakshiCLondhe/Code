import java.util.*;
class Code25{
	 public static void main(String args []){

		int arr[]=new int[]{1,8,8,4,5,6};
		int N=6;
		int FirstMax=Integer.MIN_VALUE;
		int SecondMax=Integer.MIN_VALUE;
		for( int i=0; i<N;i++){
			if(FirstMax<arr[i]){
			
				SecondMax=FirstMax;
				FirstMax=arr[i];
			}
			else if(SecondMax<arr[i] && arr[i]!=FirstMax){
				SecondMax=arr[i];


		
			}}
		if(SecondMax == Integer.MIN_VALUE){
			System.out.println("There is no second largest ele");
		}
		else{
		System.out.println(" Second max " +SecondMax);
	 }
	 
	 
	 }}

