import java.util.Arrays;
import java.util.Collections;
 class Code9{
	  public static void main(String args []){
		  int arr[]=new int[]{9,0,1,3,0};
			int temp;
		        for( int i=0;i<arr.length;i++){
			for( int j=i+1;j<arr.length;j++){
			if(arr[i]<arr[j]){
				temp=arr[i];
		       		arr[i]=arr[j];
				arr[j]=temp;
			 }
			 }
			 }
			System.out.println("largest no form ");
                         for(int i=0;i<=arr.length-1;i++)
			 {
	   			   System.out.print(arr[i]);
			 }

		
	  }
 }


