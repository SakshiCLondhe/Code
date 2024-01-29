class Code3{
	 public static void main(String args []){
		 int arr[]=new int[]{2,-15,7,11,-3,85,-27};
		 int N =arr.length;
	          System.out.println(recu( arr,N));
		 
		 
	 }
	  static int recu(int arr[],int N){
		 int MaxEv=Integer.MIN_VALUE;
		 int MinOd=Integer.MAX_VALUE;
		 for(int i=0;i<N;i++){

			 if(arr[i]%2==0 &&arr[i]>MaxEv){
				 MaxEv=arr[i];
		             
			     }
			 if(arr[i]%2==1 && arr[i]<MinOd){
				 MinOd=arr[i];
			 }

		 }
		 System.out.println("Max Ev"+MaxEv);
		 System.out.println("Min Odd"+MinOd);
		  return MaxEv-MinOd;
		 
	 }
}
