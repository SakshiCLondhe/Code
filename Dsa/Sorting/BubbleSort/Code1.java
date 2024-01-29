class BubbleSort{
	public static void main(String args []){
		int arr[]=new int []{4,7,8,2,3,6};
		int n = arr.length;
		 int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				count++;
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
				        arr[j]=temp;
				}
			
		}}
	        System.out.println("Sorted Array is :");
	        for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}
		System.out.println();
		System.out.println(count);
		
	}
}
					


