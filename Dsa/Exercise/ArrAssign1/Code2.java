// Maximum Occurance
import java.util.*;
 class Code2{
	 public static void main(String args []){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter size");
		 int n =sc.nextInt();
		 int arr[]=new int [n];
		 
		 System.out.println(" Enter element");
		 for( int i=0;i<n;i++){
			 arr[i]=sc.nextInt();
		 }
		 Arrays.sort(arr);
		 System.out.println("Enter B");
		 int B=sc.nextInt();
		
		 for(int i=0;i<arr.length;i++){
			  int cnt =0;
			 for(int j=i+1;j<arr.length;j++){
				if( arr[i]==arr[i+1]){
				cnt++;
			 }
		 }
		 
		 if(cnt==B){
			 System.out.println(arr[i]);
		 }
	
		 
	 
	 }
 }
 }


