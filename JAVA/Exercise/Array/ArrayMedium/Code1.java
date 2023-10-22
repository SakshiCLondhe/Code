import java.util.*;
class Code1
{
	 public static void main(String [] a){
	 Scanner sc = new Scanner(System.in);
	 int size=sc.nextInt();
	 int arr[]=new int[size];
	 for(int i=0;i<size;i++){
		 arr[i]=sc.nextInt();
		 System.out.println(arr[i]+"index is"+i);
	 }
}}
