import java.util.*;
class Code22{
	 static void FirstOccure( int arr[], int k){
		 	HashMap<Integer , Integer> hm = new HashMap<>();
			int ans= -1;
		 for( int ele: arr ){
			  if( hm.containsKey(ele)){
				  hm.put(ele,hm.get(ele) + 1);
			  }
			  else{
				  hm.put(ele,1);
			  }
		 
		 
		  if( hm .get(ele) == k){
		     ans=ele;
			 break;
		 }
		  }
	        if(ans!=-1){
		 System.out.println(" first elements occuring "+k+" time is"+ans);
}
	 }
	 public static void main(String args []){
		 Scanner sc = new Scanner(System.in);
		 System.out.println(" Enter Size");
		 int N = sc.nextInt();
		 int arr[]= new int [N];
		 for( int i=0;i<arr.length;i++){
		   arr[i]=sc.nextInt();
		 }
		  System.out.println("Enter  cnt");
		  int k=sc.nextInt();
		  FirstOccure(arr,k);

	 }
}

		
		   

	 
