class Code2{
	 static void sum(int arr[], int N, int sum){
		 for( int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<N;j++){ 
				 if(sum==arr[i]+arr[j]  ){
					 System.out.println(i+" &"+j);
					 
				 }
			 
		 }
	 
               }
 }
	 public static void main(String args []){
		 int arr[]=new int[]{0,1,2,3,4,5,6};
		 int N=arr.length;
		 int sum=6;
		 sum(arr,N,sum);
	 }
}

