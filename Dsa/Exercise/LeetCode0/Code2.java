import java.util.*;
 class Code2{
	  static int[] TwoSum(int [] arr, int target){
		  for( int i=0;i<arr.length;i++){
			  for(int j=i+1;j<arr.length-1;j++){
				  if( arr[i]+arr[j]==target){
					  return new int[]{i,j};
				
				  } 
			  }
		 }
	           return null;
 
	  }
	  public static void main(String args []){
		  Scanner sc =new Scanner (System.in);
		  System.out.println(" Enter size");
		  int n=sc.nextInt();
		   int arr[]=new int [n];
		   System.out.println(" Enter elements");
		   for( int i=0;i<n;i++){
			   arr[i]=sc.nextInt();
		   }
		   System.out.println( "Enter Target no");
		  int target=sc.nextInt();
		  int k[]=TwoSum(arr,target);
		  if(k!=null){
			  System.out.println(" index are: "+k[0] +" & "+k[1]);
		  }
		  else{

			  System.out.println(" no  target found");
		  }

		 
	  }

 } 
