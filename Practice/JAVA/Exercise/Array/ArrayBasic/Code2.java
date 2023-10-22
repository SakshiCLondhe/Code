import java.util.*;
class Code2{
	 public static void main(String args []){
		Scanner sc =new Scanner (System.in);
		System.out.println("enter size"); 
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println(" enter elements");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int temp = arr[0];

		System.out.println("max no");
		for(int i=0;i<size;i++){
	
			if(temp<arr[i])
			{	
			temp=arr[i];
				
			}
			
		}
		System.out.println(temp);
	 }
}


