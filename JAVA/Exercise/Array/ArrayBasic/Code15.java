import java.util.*;
class Code15{

	static int UniqueElements( int arr[],int k){
		
		for( int i=0;i<arr.length;i++){
			int cnt=0;

			for( int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
				 cnt++;
				}
				
			}
			 if( cnt!=k){
				 return arr[i];
			 }
				
				
		
		}
		return -1;

}
 
	public static void main(String args []){
		 int k =4;
		  
		 int arr[]= new int[]{2,2,2,10,2};
		 System.out.println(UniqueElements(arr,k));
	       

	}
}
