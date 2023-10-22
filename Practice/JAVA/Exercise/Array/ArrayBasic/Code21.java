import java.util.*;
class Code21{
	 static void  TwoSum(int arr[],int x){
	for( int i=0;i<arr.length-1;i++){
		 for( int j=i+1; j<arr.length;j++){
		int add=arr[i]+arr[j];
		if(add==x){
			System.out.println(arr[i]+"&" +arr[j]);
		}

	}
	}
	 }

	 public static void main(String ar[]){
	 Scanner sc = new Scanner(System.in);
	 System.out.println(" Enter Size of array :");

	 int size=sc.nextInt();
	  
	 int arr[]=new int[size];
	 System.out.println(" Enter array Elements ");
	 for(int i=0;i<size;i++){
		 arr[i]=sc.nextInt();
	 }
	 System.out.println(" Enter  no: ");
	 int x=sc.nextInt();

	 TwoSum(arr,x);


	 
	 }
}



