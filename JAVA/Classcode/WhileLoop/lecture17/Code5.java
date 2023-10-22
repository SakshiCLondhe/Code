//Reverse number 
/*class Code5{
	public static void main(String args []){
	int N=6531;
	while (N!=0)
	{
	System.out.print(N%10);
	       	N=N/10;
	}
	}
}*/

class Code5{
	public static void main(String args []){
		int N =6531;
		int rem =1 ;
		while (N!=0)
	{
                   rem=N%10;
		   N=N/10;
                   
		
		System.out.print(rem);
	}

	}
}
		
