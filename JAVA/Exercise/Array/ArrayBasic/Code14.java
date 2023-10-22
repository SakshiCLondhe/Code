import java.util.*;
 class Code14{
	  static int Occurance(int arr[],int x){
		  int cnt=0;
           for( int i=0;i<arr.length;i++){
		if(x==arr[i]){
			cnt++;
			System.out.print(" "+i);
		
		}
	  }
	  return cnt;
	  }
	  
	 public static void main(String args []){
		
		 int X=3;
		  int arr[]= new int []{1,3,3,4};
		  Occurance(arr,X);

		}


	  
 }
