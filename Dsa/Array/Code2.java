/*  Given an Integer array of size N count th no of element having atleast elements greater than itself
 *  arr:[2,5,1,4,8,0,8,1,3,8]
 *  */
import java.util.*;
class Code2{
	 public static void main(String a[]){
		 int arr[]=new int []{2,5,1,4,8,0,8,1,3,8};
		 int N=10;
		 int cnt=0;
		 for( int i=0;i<N;i++){
			 for( int j=0;j<N;j++){
				 if(arr[i]<arr[j]){
					 cnt++;
					 break;//   aatla for loop break krto

				 }
			 }
		 }
		 System.out.println(cnt);
	 }
}
