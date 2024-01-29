import java.util.*;
class Code1{
	public static void main(String args []){
         Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Array Size: ");
	 int size=sc.nextInt();
	 System.out.println("Enter Array elements:");
	 int arr[]=new int[size];
	 for(int i=0;i<arr.length;i++){
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("Array elements are :");
	 System.out.print("[ ");
	 for(int j=0;j<arr.length;j++){
		 System.out.print(arr[j]+" ");
	 }
	 System.out.print("]");
	 System.out.println();
	}
}

