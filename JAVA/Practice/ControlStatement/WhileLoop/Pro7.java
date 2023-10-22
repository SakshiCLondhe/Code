class Code7{
	public static void main(String args []){
		int no =6531;
		 int mul=1;
		 while(no!=0){
			 int rem = no%10;
			 mul = mul*rem;
			 no = no/10;
		 }

			 System.out.println(mul);
	}
}

