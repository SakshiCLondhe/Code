import java.util.*;
class BB{
	 public static void main (String args []){
		  int arr []= new int[]{2,3,4,5,6,7};
		  int n = arr.length;
		  BB obj= new BB();
	           boolean Swapped; 
		  int count=0;
		  for(int i=0;i<arr.length;i++){
			  Swapped= false;
		  for( int j=0;j<arr.length-i-1;j++){
			  count++;

			  if(arr[j]>arr[j+1]){
				  int temp=arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=temp;
				  Swapped=true;
			  }
		 }
			  if(Swapped==false){
				  break;
			  }
		  }
		  for( int k=0;k<arr.length;k++){
			  System.out.print(arr[k]+" ");
		  }
		  System.out.println();

		  System.out.println(count);
		  }


          

}

					   
