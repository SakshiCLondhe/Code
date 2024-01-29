// using recursion
import java.util.*;
class Code2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[]{1,2,11,24,37,57,66,67};
		int serach=sc.nextInt();
		int start=0;
		int end=arr.length-1;
		Code2 obj= new Code2();
		int index =obj.binarySearch(arr,start,end,N,search);
	}
	int binarySearch(int arr[],int start,int end,int N, int search){
		if(start>end){
			 return -1;
		}
		else{
			int mid=(start+mid)/2;
			if(arr[mid]<search){
				return binarySearch(arr,mid+1,end,N,search);                        }
			else{
				return binarySearch(arr,start,mid-1,N,search);
			}
		}
	}

}
