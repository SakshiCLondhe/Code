import java.util.*;
import java.util.Scanner;
class Code1{
	 public static void main(String args []){
		 Scanner sc = new Scanner(System.in);
		 int size= sc.nextInt();
		 int arr[]= new int[size];
		 int s=0;
		 for( int i=0;i<arr.length;i++){
			 arr[i]=sc.nextInt();
		 }
		 for( int i=0;i<size;i++){
			 if(arr[i]%2==1){
				 s=s+arr[i];

			 }

		 }
		 	System.out.println(s);
	 }
}

