import java.util.*;
class Code8{
	 public static void main(String args []){
		  Scanner sc= new Scanner(System.in);
		  int arr[]=new int []{1,2,3,4,5};
		  int N=arr.length;
		  System.out.println("   Before rotating :");
		 	 for( int i=0;i<N;i++){
				   System.out.println(arr[i]);
			   }
		  System.out.println(" Rotating no :");
		  int R=sc.nextInt();
	                 for( int j=0;j<R;j++)
			 {
			      int temp1=arr[0];
		         for( int i=0;i<N-1;i++)
			 {
			    arr[i]=arr[i+1];
		         }
		            arr[N-1]=temp1;
		         }
			 System.out.println(" Afeter Rotating :");

		         for( int i=0;i<N;i++){
				 
			    System.out.println(arr[i]);
		         }
			  System.out.println();
	 }
}


