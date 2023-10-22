class Odd{
	public static void main(String args []){
		int x=94211423;
		int count=0;
		while (x!=0){
			int r=x%10;
		        int d= x/10;
			if(r%2!=0)
	         	count++;
			}  
	   	System.out.println(count);
		
	}
}

