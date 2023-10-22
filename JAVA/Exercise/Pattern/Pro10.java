class Pro10{
	public static void main(String args []){
		for(int i=1;i<=3;i++){
			int x=1;
			char ch= 'A';
			for(int j=1;j<=3;j++){
				if(j%2==0){
					System.out.print((x++)+(ch++));
				}
				if(j%2!=0){
					System.out.print((x++)+(ch++));
				}
			}
			System.out.println();
		}
	}
}


