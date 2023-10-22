import java.util.*;
class Code2{
	 public static void main(String args []){
		 Scanner sc = new Scanner(System.in);
		 System.out.println(" Enter Size :");
		 int n= sc.nextInt();
		 int arr[]=new int [n];
		
		 System.out.println(" Enter Array Element :");
		 for( int i=0;i<arr.length;i++)
		 {
			arr[i]=sc.nextInt();
		
		 }
		 int cnt=0;
		 for( int i=0;i<arr.length;i++){
			 for( int j=i+1;j<arr.length;j++){
			    if(arr[i]<arr[j]){
				   cnt++;
				    break;
			    }
		 }
		 }
		 System.out.println(cnt);
		}
}
