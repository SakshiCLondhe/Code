import java.util.*;
 class Code24{
	  public static void main(String rg []){
		  Scanner sc = new Scanner(System.in);
		  System.out.println(" Enter size");
		  int N=sc.nextInt();

                  int arr[]=new int[N];
		  System.out.println(" Enter Arrays Elements : ");
		  for( int i=0;i<arr.length;i++){
			  arr[i]=sc.nextInt();
		  }
		  Arrays.sort(arr);
		  System.out.println("  Second Smallest no is :" +arr[1]);
	  }
 }

		
		   
