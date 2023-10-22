class Code12{
	public static void main(String args []){
		int no = 6531;
		int cnt=0;
		while(no!=0){
			 int rem =no%10;
			 cnt++;
			  no=no/10;
		}
		System.out.println(cnt);
	}
}

