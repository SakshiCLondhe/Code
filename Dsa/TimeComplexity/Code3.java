import java.util.*;
class Code3{
	 static int  fun(int M, int N){
		for( int i=1;i<=N;i++){// Iteration are N [b-a+1=N-1+1=N]
			System.out.println(i);
		}
		for( int j=1;j<=M;j++){//Iteration are M   [b-a+1=M-1+1=M]
			
			System.out.println(j);
		}
		return 0;
	 }
	 public static void main(String args []){
           Scanner sc = new Scanner(System.in);
	   int N=sc.nextInt();
	   int M=sc.nextInt();
	   System.out.println(fun(M,N));
	 }
	 }

//Iterations are M+N
//Time Complexity will be Big O(M+N) Or Big O(max(M,N))

