import java.util.*;
class Code10{
	  public static void main(String args []){
		   int arr[]={9,12,23,10,12,12,15,23,14,12,15};
		   int cnt=0;
		   for(int i=0;i<arr.length;i++){
			   for(int j=i+1;j<arr.length;j++){
			   if(arr[i]==arr[j]){
			   cnt++;
			   } 
			if(cnt%2==0){
				System.out.println(arr[i]);
			}
			   }
		   /*for(int i=0;i<arr.length;i++){
		   	if(cnt%2==0){
				   System.out.println(arr[i]);
		  	 }
		
		   }*/
	  }
 }
}



	  
