import java.util.*;
class Code4{
	 public static void main(String args []){
		  for( int i=1;i<=N;i=i+2){ 
			  System.out.println(i);
		  }
	 }
// Suppose N=13
// i=1  1<=13 i=1+2
// 1=3  3<=13 i=3+2
// i=5  5<=13 i=5+2
// i=7  7<=13 i=7+2
// i=9  9<=13 i=9+2
// i=13 13<=13 i=15
// i=15 15<=13 loop stop condition failed
//
// N=13

// Iteration are(N+1)/2=(13+1)/2=14/2=7=(N+1)/2<== Iterations
// Time Complexity=(N/2+1/2)==>( when we calculate time complexity  firstly we have to calculate the no of iterations  after that we have   neglate the lower term  and last we have remove constant coeffient 
// ===>Big O(N)
                   

