import java.util.*;
 class Code8{
	 public static void main(String args []){
		 Scanner sc = new Scanner (System.in);
		 System.out.println(" enter size");
		 int size= sc.nextInt();

		 int arr[]=new int[size];
		 System.out.println("enter a &b");
		 int A=sc.nextInt();
		 int B=sc.nextInt();
		 System.out.println("Enter elements");
		
		 for(int i=0;i<arr.length;i++){

			 arr[i]=sc.nextInt();
		 }
		 
		 for(int num :arr){
		 
		if(num>A || num<B){

			System.out.println("No");

		 }
		 else{
			 System.out.println("Yes");
	 }}
 }

 }
