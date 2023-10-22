import java.util.*;
class Code16{
	 public static void main(String args []){
		  int arr[]=new int[] {1,1,2,2,3,3,0,0,0};
		 int max=0;
		  int element=0;
		   int temp=arr[0];
		 
		for(int i=0;i<arr.length;i++){
			int cnt=0;
			for( int j=0;j<arr.length;j++){

			if(arr[i]==arr[j]){
				cnt++;
			}
			}
			if( cnt>max){
			  max=cnt;
			  element=arr[i];
			}
			}
		

			System.out.println(element);
		
	 }

	

	 
}
