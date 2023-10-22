//Break
//factor are equal to 2 then print no is prime
class Code1{
       	public static void main(String args []){
	int x=15;
	int count=0;
	for (int i=1;i<=x;i++){
		if(i%2==0)
		{
			count++;
		}
		if(count>2){
			break;
		}
	}

		if(count==2)
		{
		System.out.println("no is prime");
		}
		else
		{
		System.out.println("no is not prime");
		}
	}
			

}
