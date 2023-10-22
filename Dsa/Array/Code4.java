
/* Given an array  of size N
 * return the cnt of pair (i,j)
 * with arr[i]+arr[j]=k
 * int N=10;
 * int k = 10;
 * Note :i!=j
 * */
 import java.util.*;
 class Code4{
	  public static void main(String args []){
		  int arr[]=new int[]{3,5,2,1,-3,7,8,5,6,13};
		  int N =10;
		  int k=10;
		  int itr=0;
		  int cnt=0;
		  for( int i=0;i<arr.lenght;i++){
			  for(int j=i+1;j<arr.length;j++){
				  if(arr[i]+arr[j]==k && i!=j)
				  {
					  cnt++;
				  }
			  }
		  }
		  System.out.println(cnt);
		  System.out.println(itr);
	  }
	  }



