import java.util.*;
class Code6{
	 public static void main(String args []){
		 for(int i=0;i*i<=13;i++){
			System.out.println(i);
		 }
	 }
}
//Suppose
//n=9
//i=1   1*1<=9  i=2
//i=2   2*2<=9  i=3
//i=3   3*3<=9  i=4
//i=4   4*4<=9  Condition failed
//there are 3 iteration in this scenario
//which is sqrt(n)
// Iterations is Sqrt(n)
// Time Complexity is ==> (n^1/2)
