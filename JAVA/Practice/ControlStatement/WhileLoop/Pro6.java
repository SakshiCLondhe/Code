class Code6{
	public static void main(String args []){
		int sum =0;
		 int no =6531;
		 while( no!=0){
			 int rem = no%10;
			  sum = sum+rem;
			  no=no/10;
		 }
			  System.out.println(sum);
		 
	}
}

