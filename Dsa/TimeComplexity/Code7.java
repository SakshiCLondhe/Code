import java.util.*;
class Code7{
	 public static void main(String args []){
		 Scanner sc = new Scanner(System.in);
		 int N=sc.nextInt();
		 int i=N;
	       while(i>1){
		       i=i/2;
	     
	        System.out.println(i);
	       }
	 }
}
//Suppose N=4
//while(4>1)  i=4/2=2  i=2
//while(2>1)  i=2/2=1  i=1
//Iteration for N is
// log2N=log24=2 so the iteration are ==> log2(N)
// Time Complexity is Big O(log2(N))


