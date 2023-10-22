// 1- based indexing
import java.util.*;
 class Code
{
	 public static void main(String args []){
	 int arr[]=new int []{1,2,3,3};
	  int N =arr.length;
	  int flag=0;
	   for( int i=1;i<arr.length;i++){
		   int L=0;
		   int R=0;
		   for( int j=1;j<i-1;j++){
			   L=L+arr[j];
		   }
		   for( int j=i+1;j<arr.length;j++){
			   R=R+arr[j];
		   }
		   if(L==R){
			   System.out.println(i);
			   break;

		   }
	   }
	   if(flag ==0){
		   System.out.println("-1");
	   }
	 }
}



