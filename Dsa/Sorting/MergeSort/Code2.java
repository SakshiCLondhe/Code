// Merge two sorted array
class MergeSort{
	public static void main(String args[]){
		int arr1[]=new int[]{1,3,6};
		int arr2[]=new int[]{0,4,8};
		int n=arr1.length;
		int m=arr2.length;
		int p=n+m;
		int arr3[]=new int[p];
		int i=0;
		int j=0;
		int k=0;
		while(i<n && j<m){
			if(arr1[i]<arr2[j]){
				arr3[k++]=arr1[i++];
				
			}
			else{
				arr3[k++]=arr2[j++];
				
			}
			
		}
		while(i<arr1.length){
			arr3[k++]=arr1[i++];
		
		}
		while(j<arr2.length){
			arr3[k++]=arr2[j++];
			
		}


		for(int s=0;s<arr3.length;s++){
			System.out.print(arr3[s]+" ");
		}
		System.out.println();

}

}
