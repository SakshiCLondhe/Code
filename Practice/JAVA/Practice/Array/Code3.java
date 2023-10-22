import java.util.*;
class Code3{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p=1;
		 int arr[] = new int [n];
		 for(int i=0;i<n;i++){
			 arr[i]=sc.nextInt();
			 if(i%2!=0){
				p=p*arr[i];
			 }
		 }
		 System.out.println(p);
	}
}
