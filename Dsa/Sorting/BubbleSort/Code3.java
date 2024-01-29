//Bubble sort in single recursion
class RecBB{
	public static void main (String args[]){
		int arr[]=new int []{2,3,1};
		int n=arr.length;
		
		RecBB obj=new RecBB();
		obj.BubbleSort(arr,n);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	void BubbleSort(int arr[],int n){
		boolean Swapped;

		if(n==1){
			return;
		}
		Swapped=false;
		for(int j=0;j<arr.length-1;j++){

		   if(arr[j]>arr[j+1]){
			   int temp=arr[j];
			   arr[j]=arr[j+1];
			   arr[j+1]=temp;
			   Swapped=true;
		   } 
		   }
	          if(Swapped ==false){
		     return;
		  }
		
	      	      BubbleSort(arr,n-1);
	}
		 
}	
