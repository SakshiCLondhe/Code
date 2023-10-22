// Maximum Product of 2 no 
import java.util.*;
 class Code26{
	  public static void main(String args []){
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Size :");
		  int N=sc.nextInt();
		  int arr[]=new int[N];
		  System.out.println("Enter Array Elements :");
		   int Prod=0;
		    
		     
		  for( int i=0;i<arr.length;i++){
			  arr[i]=sc.nextInt();
		  }
		  for( int i=0;i<arr.length-1;i++){

				 Prod=arr[i]*arr[i+1];
			  System.out.println("Prod of "+i+"&"+(i+1)+"is :"+Prod);
		  }
	  } }
	  
 

		   
