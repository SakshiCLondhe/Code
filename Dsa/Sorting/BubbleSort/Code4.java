class Bs012{
      static void sortedArray(int arr[], int start, int mid,int end){
	   if(arr[mid]<=end){
		 if(arr[mid]==0){
		          swap(arr,start,mid);
		          sortedArray(arr,start+1,mid+1,end);
			
                 } 
		 else if(arr[mid]==1){
			 sortedArray(arr,start+1,mid+1,end);
		 }
		 else {
			swap(arr,start,end);
			sortedArray(arr,start+1,mid+1,end-1);

		 }

		 }
	}
      static  void swap(int arr[], int i ,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

   
	public static void main(String args []){
		Bs012 obj= new Bs012();
		int arr[]=new int[]{0,1,2,2,0};
		System.out.println("Original Array");
		for( int k=0;k<arr.length;k++){
			System.out.print(arr[k]+" ");

		}
		System.out.println();

		obj.sortedArray(arr,0,0,arr.length-1);
		
		System.out.println(" Sorted Array");
		for(int s=0;s<arr.length;s++)
		{
			System.out.print(arr[s]+" ");

		}
		System.out.println();



	}


}
