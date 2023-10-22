import java.util.*;
class Code18{

	static int ProdOfMaxMin(int arr[],int brr[]){
		int max=arr[0];
		 int min =brr[0];
		 int Prod;
	for(int i=0;i<arr.length;i++)
	{
		if(max<arr[i]){
			max=arr[i];

		}
		 

	}
	 
	
	for( int j=0;j<brr.length;j++){
		if(min >brr[j]){

			min=brr[j];

	}
	}
	 
	  Prod=max*min;
	  return Prod;

	
	}

	public static void main(String args []){
		Scanner sc = new Scanner (System.in);
		int arr[]=new int[]{0,0,0,0};
		int brr[]=new int[]{1,-1,2};
	System.out.println(ProdOfMaxMin(arr,brr));
	}
	}


