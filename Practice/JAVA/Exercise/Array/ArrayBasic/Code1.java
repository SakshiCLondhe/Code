import java.util.*;
class Code1{
	 public static void main(String args []){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter size");
		int size=sc.nextInt();
		System.out.println("Enter elements");
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			
			 arr[i]=sc.nextInt();
		}
		System.out.println("Enter specific no");
		int n= sc.nextInt();
		for(int i=0;i<arr.length;i++)	{
			if(n==arr[i]){
				System.out.println(" Index of Specific no");
				System.out.println(i);
			}
		}
}}






