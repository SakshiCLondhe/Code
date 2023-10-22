import java.util.*;
class Code4{
	 public static void main(String args []){
		  for( int i=0;i<=N;i=i+2){ 
			  System.out.println(i);
		  }
	 }
// Suppose N=10
// i=0  0<=10 i=2
// 1=2  2<=10 i=4
// i=4  4<=10 i=6
// i=6  6<=10 i=8
// i=8  8<=10 i=10
// i=10 10<=10 i=12
// i=12 12<=10 loop stop condition failed
// N=10

// Iteration are(N+1)/2=(10+1)/2=11/2=5=N/2<== Iterations
//  Time Complexity =Big O(N)
                   



