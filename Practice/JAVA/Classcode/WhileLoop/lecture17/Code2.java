//Given an integer N 
//print sum of its digit 
//assume N>10
//input =6531
//output=15
 class Code2{
	 public static void main( String []args){
		 int N =6531;
		 int sum =0;
		 while(N!=0)
		 {
	                  int rem=N%10;
                       	sum =sum+rem;
		     N =N/10;
		 }
		 System.out.println(sum);
	 }
 }
