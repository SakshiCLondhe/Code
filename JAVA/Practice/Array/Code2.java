import java.util.*;
import java.util.Scanner;
class Code2{
	 public static void main(String args []){
		 Scanner sc = new Scanner(System.in);
		 int size=sc.nextInt();
		 int arr[]=new int[size];
		 int s=0;
		 for(int i=0;i<size;i++){
			  arr[i]=sc.nextInt();
			  if(arr[i]%2==0){
				 s=s+arr[i];
			  }
		 }
		 System.out.println(s);
	 }
}
