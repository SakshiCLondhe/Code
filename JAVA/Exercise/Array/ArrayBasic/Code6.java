import java.util.*;
class Code6{
	 public static void main(String args []){
		  Scanner sc = new Scanner(System.in);
		  System.out.println(" enter size");
		   int size=sc.nextInt();
		   System.out.println(" enter elements:");
		   int arr[]=new int[size];
		   for(int i=0;i<arr.length;i++){
			   arr[i]=sc.nextInt();
		   }
		    
		   for(int i=0;i<arr.length;i++){
			    if(arr[i]==0){
				    arr[i]=5;
			    }
				    System.out.print(arr[i]);
			    
			  
		   }
		   
	 }
}
 
