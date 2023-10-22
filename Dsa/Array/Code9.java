import java.util.*;
class Code9{
	 public static void main(String args []){
		  Scanner sc = new Scanner(System.in);
		  System.out.println(" Enter  size :");
		  int N=sc.nextInt();
		  int arr[] =new int [N];
		  System.out.println(" Enter Array Elements :");
		  for( int i=0;i<arr.length;i++){
			  arr[i]=sc.nextInt();
		  }
		  System.out.println(" Enter position ");
		  int R=sc.nextInt();
		  for( int i=0;i<R;i++){
			   int temp = arr[N-1];
			  for( int j=N-1;j>0;j--){
				  arr[j]=arr[j-1];
			  }
			  arr[0]=temp;
		  }
		  System.out.println(" After Rotating :");

		   for( int i=0;i<N;i++){
			   System.out.print(arr[i]+" ");
		   }
		   System.out.println();
	 }
}
                          


