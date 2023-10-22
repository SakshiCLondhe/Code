import java.util.*;
 class Code1{
		public static void main(String args []){
			int s=0;
			for( int i=0;i<=100;i++){
				s=s+i;
			}
			System.out.println(s);;
		 }
 }
//Iterations = b-a+1 where b is ending(i<=b)  and a is starting number (i=a)
//Iterations =100-0+1=101
//Time Complexity= O(1)
//if we change input but it does not affect to for loop iterations then time complexity is Big O(1)
//Big O(1) is constant time complexit
						
