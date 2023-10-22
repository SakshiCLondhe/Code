import java.util.*;
class Code4{
	 public static void main(String args []){
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		int arr[]=new int[a];
		int s=0;
		for(int i=0;i<a;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++){
			if(i%2==1){
			System.out.println(arr[i]);
			}
		}
		System.out.println(s);
	 }
}

