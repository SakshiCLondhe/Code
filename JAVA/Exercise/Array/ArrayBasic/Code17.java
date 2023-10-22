import java.util.*;
 class Code17{
	 // using sorting methode
	  static int SumOfDistinct( int arr[]){
		   int s=0;
		   int current =arr[0];
		    Arrays.sort(arr);
		    int elements=0;
		  for( int i=0;i<=arr.length-1;i++){
		if(current!=arr[i]){

			s+=arr[i];
			current=s;
			elements=current;

		}
	  }
	  System.out.println(current);
	   // using hashset
           static int SumOfUniqueNo( int arr[]){
		   Set<Integer> obj=new Hashset<>();
		   int e=0;
		   if( obj.containsarr[i]){
			   s=+arr[i];
			   e=s;
			   
		   }



	   }
	   System.out.println(e);
		return 1;  
}
	   public static void main(String args []){
		int arr[]=new int[]{1,1,2,2,3,3,4};
		System.out.println(SumOfDistinct(arr));
		System.out.println(SumOfUniqueNo(arr))


	   }
	  }
