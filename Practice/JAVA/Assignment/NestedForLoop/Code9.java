class Code9{
	public static void main(String args []){
		char ch ='A';
		for(int i=1;i<=4;i++){
		for(int j=1;j<=4;j++){
			if (j%2==1){
				System.out.print(ch);
				ch++;
			}
			else{
			 
				System.out.print(ch-65);
			}
		}
		System.out.println();
		}
	}
}

