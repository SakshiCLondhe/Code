class Count{
	public static void  main(String args[]){
		int x=336566671;
		int count=0;
		while (x!=0){
			x=x/10;
			count++;
		}
		System.out.println(count);
	}
}

