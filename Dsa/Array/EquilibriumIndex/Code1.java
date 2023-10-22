// Input1:=[-7,1,5,2,-4,3,0]
// o/p=3
//Input2:=[1,2,3]
//o/p:=-1
import java.util.*;
class Code1{
	public static void main(String args []){
		int arr[]=new int []{-7,1,5,2,-4,3,0};
		int flag=1;
		for( int i=0;i<arr.length-1;i++){
			 int Leftsum=0;
			 int Rightsum=0;
			 for( int j=0;j<i;j++){
				 Leftsum= Leftsum+arr[j];
			 }
			 for( int j=i+1;j<arr.length;j++){
				 Rightsum=Rightsum+arr[j];
			 }
			 if(Leftsum==Rightsum){
				 
				 System.out.println(i);
				 break;

			 }
		}
		if(flag==0)
			System.out.println("-1");
		
	}
	}


				 
