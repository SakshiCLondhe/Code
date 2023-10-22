// Find the Maximum element between the range
import java.util.*;
 class Code11{
	  public static void main(String args []){
		  Scanner sc= new Scanner(System.in);
		    int arr[]=new int []{1,2,3,4,5,6};
		    int N=6;
		    System.out.println(" Array");
		    for( int i=0;i<N;i++){
			System.out.println(arr[i]+" ");
		    }
		    System.out.println("Enter Range" );
		    int X=sc.nextInt();
		    int MaxE=Integer.MIN_VALUE;
		    for(int i=0;i<=X;i++){
			    if(MaxE<arr[i]){
				    MaxE=arr[i];
			    
		     }}
		    System.out.println("MAX Element is " +MaxE);
	  }
 }

				


