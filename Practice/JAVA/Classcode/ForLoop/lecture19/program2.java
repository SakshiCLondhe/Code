class Program2{
	public static void main(String args []){
		int N =5;
                int count=0;
		for (int i=1;i<=N;i++){
			if (N%i==0)
			{
		       	  count++;
			}
		}

		       if (count==2){
		       System.out.println("it is prime no");
		       }
		       else {
			       System.out.println("not prime no");
		       }

		}
	}


