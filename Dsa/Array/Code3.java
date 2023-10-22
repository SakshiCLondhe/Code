/*Given an array  find the maximum element in array
 * arr:[2,3,4,5,6,1]
 * N=6
 *max element is=6
 */
import java.util.*;
class Code3{
	 public static void main(String args []){
	 int arr[]=new int []{2,5,1,4,8,0,8,1,3,8};
	 int N=10;
	  int cnt=0;
	 int maxE= Integer.MIN_VALUE;
	 for(int i=0;i<N;i++){
		 if(arr[i]>maxE){
			 maxE=arr[i];
		 }
	 }
	 for( int i=0;i<N;i++){
		 if( maxE==arr[i]){
			 cnt ++;
		 }
	 }
	 System.out.println(N-cnt);
	 }
}




