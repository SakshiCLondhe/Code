import java.util.*;
class Code4{
	 public static void main(String rga []){
		 Scanner sc = new Scanner(System.in);
		 System.out.println(" enter size");
		 int size = sc.nextInt();
		 System.out.println(" enter array elements");
		 int arr[]= new int [size];
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 int temp=arr[0];
		 for(int i=0;i<arr.length;i++){
			 if(temp<arr[i]){
				 temp=arr[i];
			 }
		 }
		 System.out.println(" Largest no is  "+temp);
	 }
}



