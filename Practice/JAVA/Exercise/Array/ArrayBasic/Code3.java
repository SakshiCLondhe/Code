import java.util.*;
class Code3{
	 public static void main(String args []){ 
 		Scanner sc = new Scanner(System.in);
		System.out.println(" enter size");
		int size= sc.nextInt();
		System.out.println(" enter  elements");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int temp =arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(temp<arr[i]){
				arr[i]=temp;
			}
		}
		System.out.println(arr[i]);
	 }
}
			 
