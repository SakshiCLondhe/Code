import java.util.*;
 class Code5{
	  public static void main(String args []){
		  Scanner sc = new Scanner (System.in);
		  System.out.println(" enter size is");
		  int size=sc.nextInt();
		  int arr[]=new int[size];
		   int Pro=1;
		   System.out.println(" enter Array elements");
		  for(int i=0;i<arr.length;i++){
			  arr[i]=sc.nextInt();
			
		  }
		  for(int i=0;i<arr.length;i++){
			  Pro=Pro*arr[i];
		  }
		  System.out.println("Product of all elements is : "+Pro);
	  }
 }


