// CarryForward==>LeftMax==>

import java.util.*;
class Code12{
	 public static void main(String args []){
		 Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Size: ");
		   int N =sc.nextInt();
		   System.out.println("Enter Array Element :");
		   int arr[]=new int [N];
		   for( int i=0;i<arr.length;i++){
			   arr[i]=sc.nextInt();
		     }
		   int LeftMax[]=new int[N];
		   for(int i=0;i<arr.length;i++){
			    int maxE=Integer.MIN_VALUE;
			   for( int j=0;j<=i;j++){
				   if( maxE<arr[j]){
					 
					   maxE=arr[j];
				   }
				   LeftMax[i]=maxE;
			   }
		   }
		   for( int i=0;i<arr.length;i++){
			   System.out.println(LeftMax[i]+" ");
		   }
	 }
}




