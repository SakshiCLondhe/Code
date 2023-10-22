import java.util.*;

class Code13{
	 public static void main(String args []){
		  System.out.println(" first Array is");
		  int arr1[]=new int []{5,7,9,3,6,2};
		  for( int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]+" ");
		  }
		  int arr2[]=new int []{1,2,6,-1,0,9};
		  int temp1= arr1[0];
		  int temp2= arr2[0];
		  for(int i =1;i<arr1.length;i++){
			if(temp1 <arr1[i]){
				temp1=arr1[i];
			}
		  }
		  System.out.println(" Max no is :"+temp1);
		  System.out.println(" Second Array");
		  for( int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		  }
		  for( int i=1;i<arr2.length;i++){
			if(temp2>arr2[i]){

				temp2= arr2[i];
			}
		  }
		  System.out.println(" Min no is :"+temp2);
		  int Prod = temp1*temp2;
		  System.out.println(" Product is :"+ Prod);
	 }
		 
		
		 }
