import java.util.*;
import java.util.ArrayList;
 class Code20{
	   static void CommanE( int arr[], int brr[] ,  int crr[] ){
		    Arrays.sort(arr);
		    Arrays.sort(brr);
		    Arrays.sort(crr);
			ArrayList<Integer> al=new ArrayList<>();
			int i=0;
			 int j=0;
			 int k=0;

		   while(i<arr.length && j<brr.length && k<crr.length){
				if( arr[i]==brr[j] && brr[j]==crr[k]){
			         	al.add(arr[i]);
					 i++;
					 j++;
					 k++;
				}
				else if( arr[i]<brr[j]){
					i++;
				}
				else if(brr[j]<crr[k]){
					j++;
				}
				else{
					k++;
				}
		   }
	   
		   	System.out.println(" Comman Elements are: "+al);
	   }

 
	    public static void main(String args []){
		    int arr[]=new int[]{10,20,30,80};
		    int brr[]=new int[]{40,50,60,80};
		    int crr[]=new int[]{80,100,110,40};
		    CommanE(arr, brr,crr);
	    }
 }
