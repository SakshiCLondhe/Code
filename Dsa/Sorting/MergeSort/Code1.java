//
class Code1{
	public static void main(String rgs []){
		int arr[]=new int[]{1,3,1,2,5,5};
		int start=0;
		int end=arr.length-1;
		Code1 obj=new Code1();
		obj.MergeSort(arr,start,end);
		System.out.println("Array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	void MergeSort(int arr[],int start,int end){
		if(start<end){
			int mid =(start+end)/2;
		
		System.out.println("start: "+start+" "+"mid: "+mid+" "+"End: "+" "+end);
		MergeSort(arr,start,mid);
		MergeSort(arr,mid+1,end);
		}
	}
}


