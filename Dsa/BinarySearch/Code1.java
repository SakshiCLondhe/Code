import java.util.*;
class Code1{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		Code1 obj = new Code1();
		int arr[]=new int[]{1,2,11,24,37,57,66,85};
		int n =arr.length;
		int search=sc.nextInt();
		int resu=obj.binarysearch(arr,n,search);
		if(resu==-1){
			System.out.println("Element not found");
		}
		else{
			System.out.println("Element found at index"+resu);
		}

	}
	int binarysearch(int arr[], int n,int search){
	     int start=0;
	     int end=arr.length-1;
	      
	      while(start<=end){
		      int mid =(start+end)/2;
		      if(arr[mid]==search){
			      return mid;
		      }
		      if(arr[mid]>search){
			      end=mid-1;
		      }
		      if(arr[mid]<search){
			       start=mid+1;
		      }
		      
	      }
	      return -1;
	}
}
