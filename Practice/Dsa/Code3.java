import java.util.*;
class Code3{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		 int N=sc.nextInt();
		int Max= Integer.MIN_VALUE;
		int arr[]=new int[N];
		int cnt=0;
		for( int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}

		for( int i=0;i<arr.length;i++){
			if(arr[i]>Max)
			{
				Max=arr[i];
			}
		}
		
		for(int j=0;j<N;j++){
			if(arr[j]==Max){
				cnt++;
			}
		}
		System.out.println(N-cnt);
	}
}
