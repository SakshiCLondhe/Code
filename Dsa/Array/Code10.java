import java.util.*;
 class Code10{
	  public static void main(String args []){
          char arr[]=new char[]{'a','e','b','g','a','g'};
	   int cnt=0;
	    int CountSum=0;
	  for( int i=0;i<arr.length;i++){
		  if(arr[i]=='a'){
			   CountSum++;
		  }
	          else if(arr[i]=='g'){
	                  cnt+=CountSum;
       	}
		  
	  }
	  System.out.println(cnt);
	  }
 }
