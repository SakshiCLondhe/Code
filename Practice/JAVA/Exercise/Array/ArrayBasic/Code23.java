importjava.util.*;
class Code23{
	  static int  ExpeOdd(int arr[]){
	   HashMap<Integer, Integer> hm = new HashMap();
	    int ans =-1;
	  
	    for( int  i=0;i<arr.length;i++){
		     int num =arr[i];
	   hm.put(num,hm.getOrDefault(num,0)+1);
		    
	    }
	for( Map.Entry<Integer,Integer> entry : hm.entrySet()){
	   if(entry.getValue()%2!=0){
		return entry.getKey();
        }
	}
	if( ans !=-1){
		System.out.println("  occuring Exceptionally odd  no is: "+ ans);
	}
	else{
		System.out.println(" no such elements is found");
	}
	return -1;
	  }

	  public static void main(String arg []){
          Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Size");
	  int N = sc.nextInt();
	  int arr[]=new int [N];
	  System.out.println(" Enter Array Elements: ");
	  for( int i=0;i<N;i++){
		arr[i]=sc.nextInt();
	  }
	
	  System.out.println(ExpeOdd(arr));
	  }
}




