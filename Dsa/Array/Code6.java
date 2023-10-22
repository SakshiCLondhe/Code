// Rotate Array
//
 import  java.util.*;
  class Code6{
   static   void   RotateArr(int arr[], int N, int R){
	 int temp=arr[0];
	 int temp1=arr[1];
         for( int i=1;i<N;i++){
		 temp1=arr[i];
		 arr[i]=temp;
		 temp=temp1;
	   }
	 arr[0]=temp1;
	}	  
   
public static void main(String args []){
	 Scanner sc = new Scanner(System.in);
	 System.out.println(" Enter Size: ");
		 int N = sc.nextInt();
		  int arr[] = new int [N];
	 System.out.println(" Enter Array Elements");
	 for( int i=0;i<arr.length;i++){
		 arr[i]=sc.nextInt();
	 }
	 System.out.println(" Enter B");
	 int R=sc.nextInt();
	 RotateArr(arr,N,R);
	 System.out.println(" After Rotating array ");
	  for( int i=0;i<N;i++){

	  	System.out.print(arr[i]+" ");
	  }
}
}


  
