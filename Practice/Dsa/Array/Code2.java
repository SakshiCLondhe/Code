import java.util.*;
class Code2{
	
	public static void main(String args []){
		int arr[]=new int []{2,1,5,4,7,8,};
		int cnt =0;  
		for( int i=0;i<arr.length;i++){
			  for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					cnt++;
					break;
				}
			  }
		  }
		  System.out.println(cnt);
	}
}
