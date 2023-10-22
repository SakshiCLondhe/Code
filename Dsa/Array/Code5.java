// Prefix sum
import java.util.*;
 class Code5{
	  public static void main(String args []){
		   Scanner sc = new Scanner(System.in);
		   int arr[]=new int []{1,2,3,4};
		   int N=4;
		    int Q=3;
		   for(int i=1;i<N;i++){
			   arr[i]=arr[i-1]+arr[i];
		   }
		   for( int i=1;i<=Q;i++){
			   System.out.println(" Enter Start Index");
			    int Start= sc.nextInt();
			    System.out.println(" Enter End Index");
			    int End=sc.nextInt();
			     int sum=0;
			      if(Start==0){
				    sum=arr[0];
			      }
			       else{
		            sum=arr[End]-arr[Start-1];
			       }
		   
		    System.out.println(" Sum "+sum);
	  }}
 }


		   
			 
