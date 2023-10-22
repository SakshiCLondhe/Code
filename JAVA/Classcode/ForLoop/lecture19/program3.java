// perfect no 

class Program3{
       public static void main ( String args []){
       int N=6;
       int sum =0;
       for ( int i=1;i<N;i++){
		if (N%i==0){
		sum +=i;
		}
       }
		if(N==sum){
			System.out.println("perfect no");
		} 
		else {
			System.out.println("not perfect no");
		}
       
       }
}
