import java.util.*;
class Code1{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Size :");
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter Elements: ");

		for( int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int maxE=Integer.MIN_VALUE;
		int minE=Integer.MAX_VALUE;
		for(int  i=0;i<n;i++){
			if(arr[i]>maxE){
				maxE=arr[i];
			}
			if(arr[i]<minE){
				minE=arr[i];
			}

		}
		int sum=maxE+minE;
		System.out.println(" Sum of maximum  and minimum elements is: "+sum);
	}
}




